import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestTZ {

    @BeforeMethod
    public void Before() {
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
        //Configuration.holdBrowserOpen = true;
        open("http://computer-database.gatling.io/computers");
    }

    @Test
    public void addCompTest(){

        new MainPageLogic()
                .pressAddCompButton()
                .receiveUniqueCompName()
                .enterCompName()
                .enterIntroducedDate()
                .enterDiscontinuedDate()
                .chooseBrand()
                .pressCreateCompButton()
                .putCompNameIntoSearchField()
                .pressFilterButton()
                .isCompReallyAdded();
    }
}
