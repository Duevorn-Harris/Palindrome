package com.duevornHarris.Rules;

/**
 * Created by duevornharris on 6/10/16.
 */
public interface Rule {

    boolean checkIfRuleApplies(String input);

    boolean isAnagramOfPalindrome(int oddCount);
}
