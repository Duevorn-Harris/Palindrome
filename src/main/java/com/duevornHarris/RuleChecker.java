package com.duevornHarris;

import com.duevornHarris.Rules.EvenRule;
import com.duevornHarris.Rules.OddRule;
import com.duevornHarris.Rules.Rule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duevornharris on 6/10/16.
 */
public class RuleChecker {

    private List<Rule> ruleList;

    public RuleChecker(){
        ruleList = new ArrayList<Rule>();
        ruleList.add(new EvenRule());
        ruleList.add(new OddRule());
    }

    public boolean testRule(String input, int numberOfOddOccurrences){
        boolean ruleAnswer = false;
        for(Rule rule : ruleList){
            if(rule.checkIfRuleApplies(input)){
                ruleAnswer = rule.isAnagramOfPalindrome(numberOfOddOccurrences);
            }
        }
        return ruleAnswer;
    }
}
