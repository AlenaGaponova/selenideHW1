package selenideHW1.solutions;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class git {
    @Test
    void solutions() {
        //открыть GitHub
        open("https://github.com/");
        //навести мышку на solutions
        $("ul.d-lg-flex").shouldHave(text("Solutions")).hover();
        //в сплывающем окне нажать на элемент
        $(byText("Enterprise")).click();
        //загружена страница с заголовком - "Build like the best"
        $(".h1-mktg").shouldHave(text("Build like the best"));
    }
}
