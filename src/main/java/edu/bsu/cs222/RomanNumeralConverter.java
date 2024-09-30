package edu.bsu.cs222;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {
    Map<Integer, String> romanNumeralKey = new HashMap<>(Map.ofEntries(
            Map.entry(3000,"MMM"),
            Map.entry(2000,"MM"),
            Map.entry(1000,"MM"),
            Map.entry(900,"CM"),
            Map.entry(800,"DCCC"),
            Map.entry(700,"DCC"),
            Map.entry(600,"DC"),
            Map.entry(500,"D"),
            Map.entry(400,"CD"),
            Map.entry(300,"CCC"),
            Map.entry(200,"CC"),
            Map.entry(100,"C"),
            Map.entry(90,"XC"),
            Map.entry(80,"LXXX"),
            Map.entry(70,"LXX"),
            Map.entry(60,"LX"),
            Map.entry(50,"L"),
            Map.entry(40,"XL"),
            Map.entry(30,"XXX"),
            Map.entry(20,"XX"),
            Map.entry(10,"X"),
            Map.entry(9,"IX"),
            Map.entry(8,"VIII"),
            Map.entry(7,"VII"),
            Map.entry(6,"VI"),
            Map.entry(5,"V"),
            Map.entry(4,"IV"),
            Map.entry(3,"III"),
            Map.entry(2,"II"),
            Map.entry(1,"I")));
    public String integerToRomanNumeral(int num) {
        String resultString = "";
        if(num < 1) {
            return "Error: Converter only accepts positive numbers";
        }
        else if(num > 3000) {
            return "Error: Converter only accepts numbers up to 3000";
        }
        if(Integer.toString(num).length()==4) {
            int tempNum = num / 1000 * 1000;
            resultString += romanNumeralKey.get(tempNum);
            num -= tempNum;
        }
        if(Integer.toString(num).length()==3) {
            int tempNum = num / 100 * 100;
            resultString += romanNumeralKey.get(tempNum);
            num -= tempNum;
        }
        if(Integer.toString(num).length()==2) {
            int tempNum = num / 10 * 10;
            resultString += romanNumeralKey.get(tempNum);
            num -= tempNum;
        }
        if(Integer.toString(num).length()==1) {
            resultString += romanNumeralKey.get(num);
        }


        return resultString;
    }
}
