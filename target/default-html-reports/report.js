$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/InsideTask.feature");
formatter.feature({
  "name": "Some secenarios for the Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user should apply for specific job",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Visit url and check Insider home page is opened or not",
  "keyword": "* "
});
formatter.match({
  "location": "com.insider.step_definitions.InsiderTaskDefs.visit_url_and_check_Insider_home_page_is_opened_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Career menu in navigation bar and check Career page, its Culture, Locations, Teams, Jobs and Life at Insider blocks are opened or not",
  "keyword": "* "
});
formatter.match({
  "location": "com.insider.step_definitions.InsiderTaskDefs.select_Career_menu_in_navigation_bar_and_check_Career_page_its_Culture_Locations_Teams_Jobs_and_Life_at_Insider_blocks_are_opened_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scroll to Career Opportunities, filter jobs by Location - Istanbul, Turkey and department - Quality Assurance, check presence of jobs list",
  "keyword": "* "
});
formatter.match({
  "location": "com.insider.step_definitions.InsiderTaskDefs.scroll_to_Career_Opportunities_filter_jobs_by_Location_Istanbul_Turkey_and_department_Quality_Assurance_check_presence_of_jobs_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check that all jobs’ Position contains “Quality Assurance, Department contains Quality Assurance”, Location contains Istanbul, Turkey",
  "keyword": "* "
});
formatter.match({
  "location": "com.insider.step_definitions.InsiderTaskDefs.check_that_all_jobs_Position_contains_Quality_Assurance_Department_contains_Quality_Assurance_Location_contains_Istanbul_Turkey()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select one of the positions, check that correct position page is opened, presence of job description, requirements and Apply for this job button",
  "keyword": "* "
});
formatter.match({
  "location": "com.insider.step_definitions.InsiderTaskDefs.select_one_of_the_positions_check_that_correct_position_page_is_opened_presence_of_job_description_requirements_and_Apply_for_this_job_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Apply for this job button and check that this action redirects us to Application form page",
  "keyword": "* "
});
formatter.match({
  "location": "com.insider.step_definitions.InsiderTaskDefs.click_Apply_for_this_job_button_and_check_that_this_action_redirects_us_to_Application_form_page()"
});
formatter.result({
  "status": "passed"
});
});