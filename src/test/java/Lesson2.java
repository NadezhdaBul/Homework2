import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Lesson2 {
    @Test
    void findSoftAssertions(){
        open ("https://github.com/");
        $("[name=q]").setValue("Selenide").pressEnter();
        $(".container-lg").$(byText("Wikis")).click();
        $("#wiki_search_results").$(byText("SoftAssertions")).
                shouldHave(text("SoftAssertions")).click();
        $$(".markdown-body li").get(2).shouldHave(text("JUnit5 extension"));
        $(".markdown-body").shouldBe(text("Using JUnit5 extend test class"));
        $(".markdown-body").shouldHave(text("@"))
                .shouldHave(text("ExtendWith"))
                .shouldHave(text("({"))
                .shouldHave(text("SoftAssertsExtension"))
                .shouldHave(text("."))
                .shouldHave(text("class"))
                .shouldHave(text("."))
                .shouldHave(text("})"))
                .shouldHave(text("class"))
                .shouldHave(text("Tests"))
                .shouldHave(text("{"))
                .shouldHave(text("@"))
                .shouldHave(text("void"))
                .shouldHave(text("Test"))
                .shouldHave(text("test"))
                .shouldHave(text("() {"))
                .shouldHave(text("Configuration"))
                .shouldHave(text("."))
                .shouldHave(text("assertionMode"))
                .shouldHave(text("="))
                .shouldHave(text("SOFT"))
                .shouldHave(text(";"))
                .shouldHave(text("open"))
                .shouldHave(text("("))
                .shouldHave(text("page.html"))
                .shouldHave(text(")"))
                .shouldHave(text("$"))
                .shouldHave(text("#first"))
                .shouldHave(text(")."))
                .shouldHave(text("should"))
                .shouldHave(text("("))
                .shouldHave(text("visible"))
                .shouldHave(text(")."))
                .shouldHave(text("click"))
                .shouldHave(text("();"))
                .shouldHave(text("$"))
                .shouldHave(text("("))
                .shouldHave(text("#second"))
                .shouldHave(text(")."))
                .shouldHave(text("should"))
                .shouldHave(text("("))
                .shouldHave(text("visible"))
                .shouldHave(text(")."))
                .shouldHave(text("click"))
                .shouldHave(text("(); } }"));
    }
}

