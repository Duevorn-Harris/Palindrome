import com.duevornHarris.Rules.OddRule;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by duevornharris on 6/10/16.
 */
public class OddRuleSpec {

    @Test
    public void checkIfRuleAppliesTest(){
        OddRule oddRule = new OddRule();
        assertTrue(oddRule.checkIfRuleApplies("three"));
    }
    @Test
    public void isAnagramOfPalindrome(){
        OddRule oddRule = new OddRule();
        assertTrue(oddRule.isAnagramOfPalindrome(1));
    }
}
