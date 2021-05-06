Feature: Some secenarios for the Task
  @wip
  Scenario: The user should apply for specific job
    * Visit url and check Insider home page is opened or not
    * Select Career menu in navigation bar and check Career page, its Culture, Locations, Teams, Jobs and Life at Insider blocks are opened or not
    * Scroll to Career Opportunities, filter jobs by Location - Istanbul, Turkey and department - Quality Assurance, check presence of jobs list
    * Check that all jobs’ Position contains “Quality Assurance, Department contains Quality Assurance”, Location contains Istanbul, Turkey
    * Select one of the positions, check that correct position page is opened, presence of job description, requirements and Apply for this job button
    * Click Apply for this job button and check that this action redirects us to Application form page