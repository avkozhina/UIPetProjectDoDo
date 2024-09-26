package elements.Popup;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddressSelectionPopup {
    protected static final SelenideElement buttonPickUpFromPizzeria = $x("//button[contains(text(), 'Забрать')]");
    protected static final SelenideElement buttonSpecifyDeliveryAddress = $x("//button[contains(text(), 'Указать')]");
    protected static final SelenideElement buttonConfirmAddressPickUp = $x("//button[@data-testid='menu_product_select']");

}
