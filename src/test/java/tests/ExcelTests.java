package tests;

import helpers.WebHooks;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static configs.Props.props;
import static testdata.UsersList.USER1;

public class ExcelTests extends WebHooks {

    @Test
    public void NewExcel() {
//        open("https://google.com");
//        sleep(1000 * 60 * 10); // приостанавливает выполнение текущего потока на 10 минут
        new WebHooks()
                .open(props.URL());
        new LoginPage()
                .userRegistration(USER1);
        System.out.println();
    }
}
