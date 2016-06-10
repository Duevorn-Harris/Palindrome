import com.duevornHarris.RuleChecker;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by duevornharris on 6/10/16.
 */
public class RuleCheckerSpec {

    @Test
    public void testRule(){
        RuleChecker ruleChecker = new RuleChecker();
        assertTrue(ruleChecker.testRule("aba",1));
        assertTrue(ruleChecker.testRule("aaabbbb",1));
    }
}
