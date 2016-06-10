import com.duevornHarris.Rules.EvenRule;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by duevornharris on 6/10/16.
 */
public class EvenRuleSpec {

    @Test
    public void isEvenTest(){
        EvenRule evenRule = new EvenRule();
        assertTrue(evenRule.checkIfRuleApplies("four"));
    }

    @Test
    public void isAnagramOfPalindromeTest(){
        EvenRule evenRule = new EvenRule();
        assertTrue(evenRule.isAnagramOfPalindrome(0));
    }
}
