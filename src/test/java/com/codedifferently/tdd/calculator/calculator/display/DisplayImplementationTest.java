package com.codedifferently.tdd.calculator.calculator.display;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayImplementationTest {

    @Test
    public void switchDisplayModeTest() {
        //Given
        DisplayImplementation dimp = new DisplayImplementation();
        dimp.switchDisplayMode();

        //When
        String actual = dimp.getCurrentDisplayMode();
        String expected = "HEXADECIMAL";

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchDisplayModeTestString() {
        //Given
        DisplayImplementation dimp = new DisplayImplementation();
        dimp.switchDisplayMode("HEXADECIMAL");

        //When
        String actual = dimp.getCurrentDisplayMode();
        String expected = "HEXADECIMAL";

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDisplayModeTest() {
        //Given
        DisplayImplementation dimp = new DisplayImplementation();

        //When
        String expected = "DECIMAL";
        String actual = dimp.getCurrentDisplayMode();

        //Then
        Assert.assertEquals(actual, expected);
    }
}
