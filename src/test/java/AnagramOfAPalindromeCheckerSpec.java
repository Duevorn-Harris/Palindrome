import com.duevornHarris.AnagramOfAPalindromeChecker;
import com.duevornHarris.AssignCharOccurences;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by duevornharris on 6/10/16.
 */
public class AnagramOfAPalindromeCheckerSpec {


    @Test
    public void calculateNumOfOddOccurencesTest(){
        String testCase = "aba";
        AnagramOfAPalindromeChecker anagramOfAPalindromeChecker = new AnagramOfAPalindromeChecker();
        anagramOfAPalindromeChecker.setInput(testCase);
        int expectedValue = 1;
        int actualValue = anagramOfAPalindromeChecker.calculateNumOfOddOccurences();
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkIfInputIsAnAnagramOfAPalindromeTest(){
        String testCase = "aaabbbb";
        AnagramOfAPalindromeChecker anagramOfAPalindromeChecker = new AnagramOfAPalindromeChecker();
        anagramOfAPalindromeChecker.setInput(testCase);
        assertTrue(anagramOfAPalindromeChecker.checkIfInputIsAnAnagramOfAPalindrome());
        testCase = "cdefghmnopqrstuvw";
        anagramOfAPalindromeChecker.setInput(testCase);
        assertFalse(anagramOfAPalindromeChecker.checkIfInputIsAnAnagramOfAPalindrome());
    }
}
