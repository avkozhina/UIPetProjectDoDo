package steps;

import elements.CardMenu;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class CardMenuSteps extends CardMenu {
    @Step("Перейти к оформлению заказа")
    public void nextOrderStep(){
        buttonNextOrderStep
                .shouldBe(visible)
                .click();
    }
}
