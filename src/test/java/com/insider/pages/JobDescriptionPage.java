package com.insider.pages;

import com.insider.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class JobDescriptionPage {

    public JobDescriptionPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@class='posting-headline']/h2")
    public WebElement jobName;

    @FindBy(xpath = "//*[@class='postings-btn template-btn-submit shamrock']")
    public List<WebElement> applyBtns;





}
