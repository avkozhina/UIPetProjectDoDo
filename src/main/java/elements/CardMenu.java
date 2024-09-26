package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CardMenu {
    protected static final SelenideElement buttonNextOrderStep = $x("//button[@data-testid = 'cart__button_next']");
}
