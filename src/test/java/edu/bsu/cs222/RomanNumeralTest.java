package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    @Test
    public void convertOneIntoRomanNumerals() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.integerToRomanNumeral(1);
        Assertions.assertEquals("I", result);
    }

    @Test
    public void convertTwoIntoRomanNumerals() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.integerToRomanNumeral(2);
        Assertions.assertEquals("II", result);
    }
}
