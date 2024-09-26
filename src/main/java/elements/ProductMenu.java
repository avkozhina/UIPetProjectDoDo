package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProductMenu {
    protected static SelenideElement productSelectionButton (String sectionName, String productName) {
        return $x("//h2[text()='" + sectionName + "']/ancestor::section//a[text()='" + productName + "']/ancestor::article//button");
    }
    protected static final SelenideElement buttonCookiePolycy = $x("//button[@class='cookie-policy-button']");
    protected static final SelenideElement buttonCard = $x("//button[@data-testid = 'navigation__cart']");


}
