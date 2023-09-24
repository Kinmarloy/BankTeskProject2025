package tests;

import helpers.Driver;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import pages.LoginPage;
import pages.MainPage;

import static io.restassured.RestAssured.given;
import static testdata.UsersList.USER1;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RegistrationTests extends Driver {

    @Test
    @Order(1)
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.1 Регистрация нового пользователя")
    public void NewUserRegistration() {
        new MainPage()
                .open("https://parabank.parasoft.com/parabank/index.htm");
        new LoginPage()
                .userRegistration(USER1);
    }

    @Test
    @Order(2)
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.2 Авторизация в банке")
    public void UserAuthorization() {
        new MainPage()
                .open("https://parabank.parasoft.com/parabank/index.htm");
        new LoginPage()
                .login(USER1);
    }

    @Test
    @Order(3)
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.3 Восстановление данных пользователя")
    public void UserDataRecovery() {
        new MainPage()
                .open("https://parabank.parasoft.com/parabank/index.htm");
        new LoginPage()
                .recoveryData(USER1);
    }

    @Test
    @Order(4)
    @Tag("Регистрация пользователя")
    @DisplayName("ТК 01.4 Удаление базы данных с пользователями")
    public void DeleteUserData() {
        RestAssured.baseURI = "https://parabank.parasoft.com/parabank/services/bank";

        given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .when()
                .post("/cleanDB")
                .then()
                .statusCode(204);
    }
}
