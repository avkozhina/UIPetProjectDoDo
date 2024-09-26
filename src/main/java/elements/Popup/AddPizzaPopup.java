package elements.Popup;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddPizzaPopup {
    protected static final SelenideElement buttonAddPizzaToCard = $x("//button[@data-testid = 'button_add_to_cart']");

}
