import com.duevornHarris.AssignCharOccurences;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by duevornharris on 6/10/16.
 */
public class AssignCharOccurrencesSpec {

    @Test
    public void testMapper(){
        String testCase = "aba";
        AssignCharOccurences assignCharOccurences = new AssignCharOccurences(testCase);
        HashMap<Character, Integer> charMapper = assignCharOccurences.getCharMapper();
        int expectedValue = 2;
        int actualValue = charMapper.get('a');
        assertEquals("The value should be 2", expectedValue, actualValue);
    }
}
