package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import testdata.UsersList;

import static com.codeborne.selenide.Selenide.$x;
import static commonelements.AHref.aWithText;
import static commonelements.Input.inputName;


public class LoginPage extends MainPage{
        public SelenideElement loginField = $x("//input[@name='username']").as("Поле ввода логина");
        public SelenideElement passField = $x("//input[@name='password']").as("Поле ввода пароля");
        public SelenideElement loginBtn = $x("//input[@type='submit']").as("Кнопка авторизации");
        public SelenideElement registrationBtn = $x("(//input[@type='submit'])[2]")
                .as("Кнопка регистрации");
        public SelenideElement successRegText = $x("//h1/following-sibling::p")
                .as("Текст с результатом регистрации");

        @Step("Авторизация под логином {login}")
        public LoginPage login(String login, String password) {
                loginField.sendKeys(login);
                passField.sendKeys(password);
                loginBtn.click();
                return this;
        }

        @Step("Регистрация нового пользователя")
        public LoginPage userRegistration(UsersList user) {
                aWithText("Register").click();
                inputName("customer.firstName", "Имя").sendKeys(user.getFirstName());
                inputName("customer.lastName", "Фамилия").sendKeys(user.getLastName());
                inputName("customer.address.street", "Адресс").sendKeys(user.getAddress());
                inputName("customer.address.city", "Город").sendKeys(user.getCity());
                inputName("customer.address.state", "Регион").sendKeys(user.getState());
                inputName("customer.address.zipCode", "Почтовый индекс").sendKeys(user.getZipCode());
                inputName("customer.phoneNumber", "Телефон").sendKeys(user.getPhone());
                inputName("customer.ssn", "ИНН").sendKeys(user.getSsn());
                inputName("customer.username", "Логин").sendKeys(user.getUsername());
                inputName("customer.password", "Пароль").sendKeys(user.getPassword());
                inputName("repeatedPassword", "Подтверждение пароля").sendKeys(user.getPassword());
                registrationBtn.click();
                Assertions.assertEquals(successRegText.getText(),
                        "Your account was created successfully. You are now logged in.",
                        "Текст с результатом регистрации не совпадает");
                return this;
        }
}