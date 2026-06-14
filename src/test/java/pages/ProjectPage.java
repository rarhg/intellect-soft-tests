package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {

    private final SelenideElement title = $(".h2.my-auto.fw-bold.text-primary.is-slogan");
    private final SelenideElement description = $(".mb-4.fs-4");

    @Step("Проверить, что заголовок проекта отображается")
    public ProjectPage titleShouldBeVisible() {
        title.shouldBe(visible);
        return this;
    }

    @Step("Проверить, что описание проекта отображается")
    public ProjectPage descriptionShouldBeVisible() {
        description.shouldBe(visible);
        return this;
    }
}