import com.codeborne.selenide.Condition;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainPageLogic extends MainPageElements{

    public MainPageLogic pressAddCompButton() {
        addCompButton.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPageLogic receiveUniqueCompName() {
        long unixTime = System.currentTimeMillis();
        compName = String.valueOf(unixTime);
        return this;
    }

    public MainPageLogic enterCompName() {
        compNameField.shouldBe(Condition.visible).sendKeys(compName);
        return this;
    }

    public MainPageLogic enterIntroducedDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");
        int year = (Calendar.getInstance().get(Calendar.YEAR))-10;
        String introducedYear = String.valueOf(year);
        String formatted1 = introducedYear + "-" + format.format(cal.getTime());
        introducedField.shouldBe(Condition.visible).sendKeys(formatted1);
        return this;
    }

    public MainPageLogic enterDiscontinuedDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        discontinuedField.shouldBe(Condition.visible).sendKeys(formatted);
        return this;
    }

    public MainPageLogic chooseBrand() {
        brandNameField.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPageLogic pressCreateCompButton() {
        createCompButton.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPageLogic putCompNameIntoSearchField() {
        filterField.shouldBe(Condition.visible).sendKeys(compName);
        return this;
    }

    public MainPageLogic pressFilterButton() {
        filterButton.shouldBe(Condition.visible).click();
        return this;
    }

    public void isCompReallyAdded() {
        Assert.assertTrue(getResponse(),"Epic Fail!!!");
    }

    public boolean getResponse() {
        String errorMessageStr = errorMessage.getAttribute("innerText");
        if (errorMessageStr.equals("Nothing to display")) {
            errorMessageequals = false;
        }
        else {
        errorMessageequals = true;
        } return errorMessageequals;}

}
