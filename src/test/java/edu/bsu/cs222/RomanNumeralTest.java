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
    @Test
    public void convert2045IntoRomanNumerals() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.integerToRomanNumeral(2045);
        Assertions.assertEquals("MMXLV", result);
    }

    @Test
    public void convertNegative5intoRomanNumerals(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.integerToRomanNumeral(-5);
        Assertions.assertEquals("Error: Converter only accepts positive numbers", result);
    }

    @Test
    public void convert0intoRomanNumerals(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.integerToRomanNumeral(0);
        Assertions.assertEquals("Error: Converter only accepts positive numbers", result);
    }

    @Test
    public void convert5000intoRomanNumerals(){
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.integerToRomanNumeral(5000);
        Assertions.assertEquals("Error: Converter only accepts numbers up to 3000", result);
    }
}

