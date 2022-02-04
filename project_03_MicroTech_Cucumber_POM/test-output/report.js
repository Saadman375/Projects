$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Feature_Login_Functionality.feature");
formatter.feature({
  "name": "Login fuctionality",
  "description": "  As a user\n  I want to login in Microtech\n  So that I can see the homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Login Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.Employee_Subscription_Form_Heading_Validation.i_am_in_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login Menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.Employee_Subscription_Form_Heading_Validation.i_click_on_Login_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify I am in Employee Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Employee_Subscription_Form_Heading_Validation.verify_I_am_in_Employee_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Login Id",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Employee_Subscription_Form_Heading_Validation.i_enter_Login_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Employee_Subscription_Form_Heading_Validation.i_enter_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.Employee_Subscription_Form_Heading_Validation.click_on_Login_Button()"
});
formatter.result({
  "error_message": "java.lang.Error: Unresolved compilation problem: \n\tThe method verifyButtonText() is undefined for the type EmployeeLoginPage\n\r\n\tat step_definitions.Employee_Subscription_Form_Heading_Validation.click_on_Login_Button(Employee_Subscription_Form_Heading_Validation.java:54)\r\n\tat ✽.Click on Login Button(file:///C:/Java/workspace/project26_Cucumber_Allure_POM/src/test/resources/features/Feature_Login_Functionality.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I will be in my Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.Employee_Subscription_Form_Heading_Validation.i_will_be_in_my_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.embedding("image/png", "embedded0.png", "Verify Login Functionality");
formatter.after({
  "status": "passed"
});
});