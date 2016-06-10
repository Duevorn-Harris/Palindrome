package com.duevornHarris;

import java.util.HashMap;
import java.util.Map;

public class AnagramOfAPalindromeChecker {

    private HashMap<Character,Integer> charMapper;
    private String input;


    public void setInput(String input){
        AssignCharOccurences assignCharOccurences = new AssignCharOccurences(input);
        charMapper = assignCharOccurences.getCharMapper();
        this.input = input;
    }

    public  boolean checkIfInputIsAnAnagramOfAPalindrome(){
        int numOfOddOccurences = calculateNumOfOddOccurences();
        RuleChecker ruleChecker = new RuleChecker();
        return ruleChecker.testRule(input,numOfOddOccurences);
    }

    public int calculateNumOfOddOccurences(){
        int counter = 0;
        for(Map.Entry<Character,Integer> entry : charMapper.entrySet()){
            if(entry.getValue() % 2 != 0)
                counter++;
        }
        return counter;
    }
}