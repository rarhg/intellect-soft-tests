package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContactFormPage {

    private final SelenideElement nameField = $("#name");
    private final SelenideElement phoneField = $("#contact");
    private final SelenideElement messageField = $("#message");
    private final SelenideElement confirmCheckbox = $("#confirm");

    @Step("Проверить, что форма обратной связи отображается")
    public ContactFormPage formShouldBeVisible() {
        nameField.shouldBe(visible);
        phoneField.shouldBe(visible);
        messageField.shouldBe(visible);
        confirmCheckbox.shouldBe(visible);
        return this;
    }
}