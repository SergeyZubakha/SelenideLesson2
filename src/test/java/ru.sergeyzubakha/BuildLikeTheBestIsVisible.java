package ru.sergeyzubakha;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BuildLikeTheBestIsVisible {
    @Test
    void buildLikeTheBestIsVisible() {
        open("https://github.com/");
        $((byText("Solutions"))).hover();
        $("[href=\"/enterprise\"").click();
        $(".application-main").shouldHave(text("Build like the best"));
    }
}
