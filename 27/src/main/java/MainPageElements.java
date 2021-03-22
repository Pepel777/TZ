import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

public class MainPageElements {
    String compName;
    boolean errorMessageequals;
    SelenideElement addCompButton = $x("//*[@id=\"add\"]");
    SelenideElement compNameField = $x("//input[@name='name']");
    SelenideElement introducedField = $x("//input[@name='introduced']");
    SelenideElement discontinuedField = $x("//input[@name='discontinued']");
    SelenideElement brandNameField = $x("//option[@value='16']");
    SelenideElement createCompButton = $x("//input[@value = 'Create this computer']");
    SelenideElement filterField = $(By.id("searchbox"));
    SelenideElement filterButton = $(By.id("searchsubmit"));
    SelenideElement errorMessage = $("#main > div.well");

}
