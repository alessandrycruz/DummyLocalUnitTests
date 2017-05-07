package com.alobot.dummylocalunittests;

import com.alobot.dummylocalunittests.utils.Base_Util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertThat(Base_Util.isValidEmail("name@email.com"), is(true));

        assertThat(Base_Util.isValidEmail(""), is(true));
    }
}