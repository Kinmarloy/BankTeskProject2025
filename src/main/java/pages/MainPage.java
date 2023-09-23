package pages;

import com.codeborne.selenide.Selenide;

public class MainPage {

    public void open(String url) {
        Selenide.open(url);
    }
}
