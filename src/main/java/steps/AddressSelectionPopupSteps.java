package steps;

import elements.Popup.AddressSelectionPopup;
import io.qameta.allure.Step;

public class AddressSelectionPopupSteps extends AddressSelectionPopup {
    @Step("Выбираем тип получения 'самовывоз'")
    public void selectPickUpFromPizzeria() {
        buttonPickUpFromPizzeria.click();
    }
    @Step("Выбираем тип получения 'доставка'")
    public void selectSpecifyDeliveryAddress() {
        buttonSpecifyDeliveryAddress.click();
    }
    @Step("Подтверждаем адрес самовывоза")
    public void confirmAddressPickUp() {
        buttonConfirmAddressPickUp.click();
    }

}
