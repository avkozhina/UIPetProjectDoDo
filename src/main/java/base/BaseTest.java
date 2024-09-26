package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    private static final int TIMEOUT = 10000;

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .savePageSource(true)
                        .screenshots(true));
        Configuration.timeout = TIMEOUT;
        Configuration.browser = "chrome";
        Configuration.browserSize = "2560×1600";
        Configuration.headless = false;
       // Configuration.browserCapabilities = new ChromeOptions().addArguments("--incognito");
//        System.setProperty("chromeoptions.args", "\"--no-sandbox\",\"--disable-dev-shm-usage\"");
    }

    /**
     * Закрытие процесса с вебдрайвером
     * Метод выполняется после каждого теста.
     */
    @AfterEach
    @Step("Закрываем браузер")
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
