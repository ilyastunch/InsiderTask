package com.insider.pages;

import com.insider.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "//*[@id='menu-item-21643']/a")
    public WebElement career;
}
