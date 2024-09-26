package steps;

import elements.ProductMenu;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;


public class ProductMenuSteps extends ProductMenu {
    @Step("Добавим в корзину {productName} из раздела {sectionName}")
    public void chooseProduct(String sectionName, String productName) {
        checkProductExist(sectionName,productName);
        checkProductIsAvailable(sectionName, productName);
        productSelectionButton(sectionName,productName).click();
    }
    @Step("Проверка на существование товара")
    public void checkProductExist (String sectionName, String productName) {
        Assertions.assertEquals(true, productSelectionButton(sectionName,productName).exists(), "Товара нет в меню");
    }
    @Step("Проверка на наличие товара")
    public void checkProductIsAvailable(String sectionName,String productName) {
        Assertions.assertEquals(true, productSelectionButton(sectionName,productName).isEnabled(), "Товар нельзя заказать или его нет в наличии");
    }
    @Step("Переход в корзину")
    public void goToCard() {
        buttonCard.click();
    }
    @Step("Закрыть пердупреждение об использовании cookie")
    public void closeCookiePopup() {
        buttonCookiePolycy.click();
    }


}
