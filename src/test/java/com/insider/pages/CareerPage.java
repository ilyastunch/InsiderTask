package com.insider.pages;

import com.insider.utilities.BrowserUtils;
import com.insider.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CareerPage {

    public CareerPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@class='vc_custom_heading menu-head']")
    public List<WebElement> menuBarList;

    @FindBy(css = ".lazyloaded")
    public List<WebElement> imageList;

    @FindBy(xpath = "//*[@class='job QualityAssurance Istanbul,Turkey Full-Time']")
    public List<WebElement> positionList;



    @FindBy(xpath = "//select[@class='jobs-locations']")
    public WebElement locationDropdown;

    @FindBy(xpath = "//select[@class='jobs-teams']")
    public WebElement departmantDropdown;






    public void checkMenuBarItems(){

        /*for(int i=0; i<menuBarList.size(); i++){
            BrowserUtils.waitFor(2);
            menuBarList.get(i).click();
           for(int j=0; j<imageList.size(); j++){
               Assert.assertTrue(imageList.get(j).isDisplayed());
            }
        }*/

        menuBarList.get(0).click();
        for(int j=0; j<imageList.size(); j++){
            Assert.assertTrue(imageList.get(j).isDisplayed());
        }

    }

    public void selectLocation (String locationText){
        Select stateDropdown = new Select(locationDropdown);
        stateDropdown.selectByVisibleText(locationText);

    }

    public void selectDepartment (String departmantText){
        Select departmantdd = new Select(departmantDropdown);
        departmantdd.selectByVisibleText(departmantText);

    }

    public void checkPosition(){
        for (int i = 0; i < positionList.size(); i++) {
             Assert.assertTrue(positionList.get(i).getText().contains(" "));
        }
    }
}
