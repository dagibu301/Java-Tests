package com.dagibu.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void repeat_string_zero_times() {
        assertEquals("", StringUtil.repeat("Hello", 0));
    }

    @Test
    public  void repeat_string_two_times() {
        assertEquals("Hello Hello ", StringUtil.repeat("Hello ", 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public  void repeat_string_negative_times() {
        StringUtil.repeat("Hello ", -1);
    }

    @Test
    public void string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("This is not empty"));
    }

    @Test
    public void string_is_null() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }

}