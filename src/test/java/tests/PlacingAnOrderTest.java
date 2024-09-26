package tests;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.AddPizzaPopupStep;
import steps.AddressSelectionPopupSteps;
import steps.CardMenuSteps;
import steps.ProductMenuSteps;

public class PlacingAnOrderTest extends BaseTest {
    protected ProductMenuSteps productMenuSteps = new ProductMenuSteps();
    protected AddPizzaPopupStep addPizzaPopupStep = new AddPizzaPopupStep();
    protected CardMenuSteps cardMenuSteps = new CardMenuSteps();
    protected AddressSelectionPopupSteps addressSelectionPopupSteps = new AddressSelectionPopupSteps();

    @BeforeEach
    @Step("Открываем браузер")
    public void precondition () {
        Selenide.open("https://dodopizza.ru/peterburg");
        productMenuSteps.closeCookiePopup();
    }

    @Test
    @DisplayName("Оформление заказа с несколькими позициями")
    public void test () {
        productMenuSteps.chooseProduct("Пиццы", "Пепперони");
        addPizzaPopupStep.addPizzaToCard();
        addressSelectionPopupSteps.selectPickUpFromPizzeria();
        addressSelectionPopupSteps.confirmAddressPickUp();
        productMenuSteps.chooseProduct("Мини-пиццы","Мини Пеперони");
        productMenuSteps.chooseProduct("Кофе","Кофе Ореховый латте");
        productMenuSteps.chooseProduct("Десерты","Слоеные палочки с ананасами и брусникой");
        productMenuSteps.goToCard();
        //добавить проверку состава корзины
        cardMenuSteps.nextOrderStep();
        Selenide.sleep(500);
    }

}
