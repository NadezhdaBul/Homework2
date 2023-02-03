import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Lesson2 {
    @Test
    void findSoftAssertions(){
        open("https://github.com/");
        $("[name=q]").setValue("Selenide").pressEnter();
        $(".container-lg").$(byText("Wikis")).click();
        $("#wiki_search_results").$(byText("SoftAssertions")).
                shouldHave(text("SoftAssertions")).click();
        $$(".markdown-body li").get(1).shouldHave(text("JUnit4 rule"));

    }

}