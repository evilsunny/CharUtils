import org.junit.Assert;
import org.junit.Test;

public class CharUtilsTest {
    
    @Test
    public void testLeastUsedChar(){
        Assert.assertEquals(CharUtils.leastUsedChar("aaabbc"), 'c');
        Assert.assertEquals(CharUtils.leastUsedChar("aaabbaab"), 'b');
        Assert.assertTrue(CharUtils.leastUsedChar("aabbaabb") ==  'a' || 
                CharUtils.leastUsedChar("aabbaabb") ==  'b');
    }
}
