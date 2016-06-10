package com.duevornHarris.Rules;

/**
 * Created by duevornharris on 6/10/16.
 */
public class EvenRule implements Rule {

    public boolean checkIfRuleApplies(String input) {
        return input.length()%2==0;
    }

    public boolean isAnagramOfPalindrome(int oddCount) {
        return oddCount < 1;
    }
}
