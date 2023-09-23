package tests;

import helpers.Driver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;

import static testdata.UsersList.USER1;

public class FirstTest extends Driver {

    @Test
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.1 Регистрация нового пользователя")
    public void NewUserRegistration() {
        new MainPage()
                .open("https://parabank.parasoft.com/parabank/index.htm");
        new LoginPage()
                .userRegistration(USER1);
    }

    @Test
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.2 Авторизация в банке")
    public void UserAuthorization() {
        new MainPage()
                .open("https://parabank.parasoft.com/parabank/index.htm");
        new LoginPage()
                .login(USER1);
    }

    @Test
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.3 Восстановление данных пользователя")
    public void UserDataRecovery() {
        new MainPage()
                .open("https://parabank.parasoft.com/parabank/index.htm");
        new LoginPage()
                .recoveryData(USER1);
    }
}
