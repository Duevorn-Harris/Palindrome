package com.duevornHarris;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by duevornharris on 6/10/16.
 */
public class AssignCharOccurences {

    private HashMap<Character, Integer> charMapper;
    private char[] charArray;

    public AssignCharOccurences(String input){
        charArray = input.toCharArray();
        charMapper = new HashMap<Character, Integer>();
        populateCharOccurences();
    }

    public void populateCharOccurences(){
        for(int i = 0; i < charArray.length; i++){
            if(charMapper.containsKey(charArray[i])){
                charMapper.put(charArray[i],charMapper.get(charArray[i]) + 1);
            }else{
                charMapper.put(charArray[i], 1);
            }
        }
    }

    public HashMap<Character, Integer> getCharMapper(){
        return charMapper;
    }

}
