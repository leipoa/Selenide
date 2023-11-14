import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class FormTests {

    @Test
    void correctForm(){
        open("http://localhost:9999");
        $$(".input__control").first().setValue("Челябинск");
        $("[data-test-id=date] input").click();
        $("[data-test-id=date] input").clear();
        $("[data-test-id=date] input").setValue("22.11.2023");
        $("[data-test-id=name] input").setValue("Выломова Дарья");
        $("[data-test-id=phone] input").setValue("+79000000000");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $(withText("Успешно!")).shouldBe(Condition.visible, Duration.ofSeconds(15));






    }


}
