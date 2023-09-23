import helpers.Driver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import testdata.UsersList;

public class FirstTest extends Driver {

    @Test
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.1 Регистрация нового пользователя")
    public void NewUserRegistration() {
        open("https://parabank.parasoft.com/parabank/index.htm");

        new LoginPage()
                .userRegistration(UsersList.USER1);
    }
}
