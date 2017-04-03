import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.core.Is.is;

public class isEvenTest {
    private SoftAssert softAssert = new SoftAssert();
    private isEven sut;

    @BeforeMethod
    private void isEven (){
        sut = new isEven();
    }


    @DataProvider (name="TestData")
    public Object[][] getData () {
        Object [][] data = new Object[5][2];
                data[0][0]=424231;
                data[0][1]=false;

                data[1][0]=0;
                data[1][1]=true;

                data[2][0]=89;
                data[2][1]=true;

                data[3][0]=-101;
                data[3][1]=true;

                data[4][0]=4234323444431L;
                data[4][1]=true;
        return data;
    }

    @Test (dataProvider = "TestData")
    public void testCheckIsEven(int m, boolean b) throws Exception {
        MatcherAssert.assertThat(sut.check(m), is(b));
    }
}
