import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.core.Is.is;

public class isEvenTest {
    private SoftAssert softAssert = new SoftAssert();
    private isEven sut = new isEven();


    @DataProvider (name="TestData")
    public Object[][] getData () {
        return new Object[][]{
                new Object[]{41},
                new Object[]{234},
                new Object[]{-23543},
                new Object[]{0},
                new Object[]{9999999},
                new Object[]{41},
                new Object[]{41},
                new Object[]{41},
                new Object[]{41},
                new Object[]{41},
                new Object[]{41}
        };
    }
        /*Object[][]data = new Object[10][0];
        data [0][0] = 1;
        data [1][0] = 5;
        data [2][0] = 500;
        data [3][0] = 6312;
        data [4][0] = -4326;
        data [5][0] = 234732;
        data [6][0] = 0;
        data [7][0] = 234;
        data [8][0] = 242;
        data [9][0] = 4;
        data [10][0] = 4;
        return data;*/


    @Test (dataProvider = "TestData")
    public void testCheckIsEven(int m) throws Exception {
        MatcherAssert.assertThat(sut.check(m), is(true));
        System.out.println(m);
        MatcherAssert.assertThat(sut.check(m), is(true));
        /*MatcherAssert.assertThat(sut.check1(5), is(false));
        MatcherAssert.assertThat(sut.check1(-900), is(true));
        MatcherAssert.assertThat(sut.check1(0), is(true));
        MatcherAssert.assertThat(sut.incorrectCheck(5), is(false));
        MatcherAssert.assertThat(sut.incorrectCheck(-900), is(true));
        MatcherAssert.assertThat(sut.incorrectCheck(0), is(true));*/
    }
}
