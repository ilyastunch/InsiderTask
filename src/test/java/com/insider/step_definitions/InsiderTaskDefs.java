package com.insider.step_definitions;

import com.insider.pages.ApplicationPage;
import com.insider.pages.CareerPage;
import com.insider.pages.HomePage;
import com.insider.pages.JobDescriptionPage;
import com.insider.utilities.BrowserUtils;
import com.insider.utilities.ConfigurationReader;
import com.insider.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class InsiderTaskDefs {
    HomePage homePage=new HomePage();
    CareerPage careerPage = new CareerPage();
    JobDescriptionPage jobDescriptionPage = new JobDescriptionPage();
    ApplicationPage applicationPage = new ApplicationPage();



    @Given("Visit url and check Insider home page is opened or not")
    public void visit_url_and_check_Insider_home_page_is_opened_or_not() {
        //Open the url
        Driver.get().get(ConfigurationReader.get("url"));
        //Verify you are on homepage
        Assert.assertTrue(Driver.get().getTitle().contains("Insider"));
    }


    @Given("Select Career menu in navigation bar and check Career page, its Culture, Locations, Teams, Jobs and Life at Insider blocks are opened or not")
    public void select_Career_menu_in_navigation_bar_and_check_Career_page_its_Culture_Locations_Teams_Jobs_and_Life_at_Insider_blocks_are_opened_or_not() {
//Click Career button
        homePage.career.click();
        careerPage.checkMenuBarItems();

    }

    @Given("Scroll to Career Opportunities, filter jobs by Location - Istanbul, Turkey and department - Quality Assurance, check presence of jobs list")
    public void scroll_to_Career_Opportunities_filter_jobs_by_Location_Istanbul_Turkey_and_department_Quality_Assurance_check_presence_of_jobs_list() {

       /* for (int i = 0; i < 10; i++) {
            BrowserUtils.executeJScommand("window.scrollBy(0,250");
            BrowserUtils.waitFor(1);
        }*/
        careerPage.selectLocation("Istanbul, Turkey");
        careerPage.selectDepartment("Quality Assurance");


    }

    @Given("Check that all jobs’ Position contains “Quality Assurance, Department contains Quality Assurance”, Location contains Istanbul, Turkey")
    public void check_that_all_jobs_Position_contains_Quality_Assurance_Department_contains_Quality_Assurance_Location_contains_Istanbul_Turkey() {
        careerPage.checkPosition();
    }

    @Given("Select one of the positions, check that correct position page is opened, presence of job description, requirements and Apply for this job button")
    public void select_one_of_the_positions_check_that_correct_position_page_is_opened_presence_of_job_description_requirements_and_Apply_for_this_job_button() {
        BrowserUtils.waitFor(1);
        careerPage.positionList.get(0).click();
        Assert.assertTrue(jobDescriptionPage.jobName.getText().equals("Senior Software Quality Assurance Engineer"));
    }

    @Given("Click Apply for this job button and check that this action redirects us to Application form page")
    public void click_Apply_for_this_job_button_and_check_that_this_action_redirects_us_to_Application_form_page() {

        jobDescriptionPage.applyBtns.get(0).click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(applicationPage.formHeadText.getAttribute("class").contains("form"));

    }


}
