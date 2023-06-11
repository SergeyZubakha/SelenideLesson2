package ru.sergeyzubakha;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class DragAndDrop {
    @Test
    void dragAndDrop() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
       // actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform(); почему не работает?
       $("#column-a").dragAndDropTo($("#column-b"));
       $("#column-a").shouldHave(text("B"));
       $("#column-b").shouldHave(text("A"));

    }
}
