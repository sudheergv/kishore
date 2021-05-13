$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Testing Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@firefox"
    },
    {
      "name": "@chrome"
    }
  ]
});
formatter.background({
  "name": "open the url and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open the browser and load the wordpress",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefintions.open_the_browser_and_load_the_wordpress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.login_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@firefox"
    },
    {
      "name": "@chrome"
    },
    {
      "name": "@important"
    }
  ]
});
formatter.step({
  "name": "enter user name \"sudheerkumar.gv@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on continue button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password \"kumar@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dashboard page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.dashboard_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "open the url and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open the browser and load the wordpress",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefintions.open_the_browser_and_load_the_wordpress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.login_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@firefox"
    },
    {
      "name": "@chrome"
    },
    {
      "name": "@non-important"
    }
  ]
});
formatter.step({
  "name": "enter user name \"invalidxyz\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on continue button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "userName error message should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.username_error_message_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "login with invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@non-important"
    }
  ]
});
formatter.step({
  "name": "enter user name \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on continue button",
  "keyword": "When "
});
formatter.step({
  "name": "enter password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Login should be failed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sudheerkumar.gv@gmail.com",
        "ABC"
      ]
    },
    {
      "cells": [
        "sudheerkumar.gv@gmail.com",
        "#@$@$"
      ]
    }
  ]
});
formatter.background({
  "name": "open the url and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open the browser and load the wordpress",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefintions.open_the_browser_and_load_the_wordpress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.login_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login with invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@firefox"
    },
    {
      "name": "@chrome"
    },
    {
      "name": "@non-important"
    }
  ]
});
formatter.step({
  "name": "enter user name \"sudheerkumar.gv@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on continue button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password \"ABC\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be failed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.login_should_be_failed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "open the url and navigate to login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open the browser and load the wordpress",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefintions.open_the_browser_and_load_the_wordpress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.login_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login with invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@firefox"
    },
    {
      "name": "@chrome"
    },
    {
      "name": "@non-important"
    }
  ]
});
formatter.step({
  "name": "enter user name \"sudheerkumar.gv@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on continue button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password \"#@$@$\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefintions.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefintions.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be failed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintions.login_should_be_failed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});