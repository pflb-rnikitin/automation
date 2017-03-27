import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class isEvenTest {
    private SoftAssert softAssert = new SoftAssert();
    private isEven copy = new isEven();

    @Test
    public void testCheckIsEven() throws Exception {
        softAssert.assertEquals(true, copy.check(-990), "checkMethod: Even number isn't recognized");
        softAssert.assertEquals(false, copy.check(501), "checkMethod: Odd number isn't recognized");
        softAssert.assertEquals(true, copy.check(0), "checkMethod: Zero isn't recognized");
        softAssert.assertEquals(true, copy.check1(-500), "check1Method: Even number isn't recognized");
        softAssert.assertEquals(false, copy.check1(441), "check1Method: Odd number isn't recognized");
        softAssert.assertEquals(true, copy.check1(0), "check1Method: Zero isn't recognized");
        softAssert.assertEquals(true, copy.incorrectCheck(-500), "incorrectCheckMethod: Even number isn't recognized");
        softAssert.assertEquals(false, copy.incorrectCheck(7), "incorrectCheckMethod: Odd number isn't recognized");
        softAssert.assertEquals(true, copy.incorrectCheck(0), "incorrectCheckMethod: Zero isn't recognized");
        softAssert.assertAll()
        /*Assert.assertEquals(true, copy.check(-956));
        Assert.assertEquals(false, copy.check(-507));
        Assert.assertEquals(true, copy.check1(998));
        Assert.assertEquals(false, copy.check1(-503))*/;
    }
}
