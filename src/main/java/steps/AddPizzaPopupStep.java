package steps;

import elements.Popup.AddPizzaPopup;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class AddPizzaPopupStep extends AddPizzaPopup {
    @Step("Добавим в корзину пиццу")
    public void addPizzaToCard (){
        buttonAddPizzaToCard
                .shouldBe(visible)
                .click();
    }

}
