package com.dagibu.javatests.util;

import org.junit.Test;

import static com.dagibu.javatests.util.PasswordUtil.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(SecurityLevel.WEAK, assesstPassword("1234567"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(SecurityLevel.MEDIUM, assesstPassword("abcdefghi2341"));
    }

}