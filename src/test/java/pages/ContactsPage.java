package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContactsPage {

    private final SelenideElement title = $("h1");

    @Step("Проверить, что страница «Контакты» загрузилась")
    public ContactsPage pageShouldBeLoaded() {
        title.shouldBe(visible);
        return this;
    }
}