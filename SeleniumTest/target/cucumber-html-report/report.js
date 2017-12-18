$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myapplication.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Test Facebook Smoke Scenario",
  "description": "I want to use this template for my feature file",
  "id": "test-facebook-smoke-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Test Login with Valid Credential",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Open Chrome and start\tapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I enter valid \"username\" and valid \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "smokeTest.open_Chrome_and_start_application()"
});
formatter.result({
  "duration": 3890971982,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 15
    },
    {
      "val": "password",
      "offset": 36
    }
  ],
  "location": "smokeTest.i_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "duration": 4258004,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 78683,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "Test Login with Valid Credential",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Open Chrome and start\tapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I enter valid \"\u003cusername\u003e\" and valid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 36,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credential;;1"
    },
    {
      "cells": [
        "username1",
        "5"
      ],
      "line": 37,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credential;;2"
    },
    {
      "cells": [
        "username2",
        "7"
      ],
      "line": 38,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credential;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 37,
  "name": "Test Login with Valid Credential",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 29,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Open Chrome and start\tapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I enter valid \"username1\" and valid \"5\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "smokeTest.open_Chrome_and_start_application()"
});
formatter.result({
  "duration": 2151054238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username1",
      "offset": 15
    },
    {
      "val": "5",
      "offset": 37
    }
  ],
  "location": "smokeTest.i_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "duration": 114793,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 9503,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Test Login with Valid Credential",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 29,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Open Chrome and start\tapplication",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I enter valid \"username2\" and valid \"7\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "smokeTest.open_Chrome_and_start_application()"
});
formatter.result({
  "duration": 1295692581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username2",
      "offset": 15
    },
    {
      "val": "7",
      "offset": 37
    }
  ],
  "location": "smokeTest.i_enter_valid_username_and_valid_password(String,String)"
});
formatter.result({
  "duration": 250874,
  "status": "passed"
});
formatter.match({
  "location": "smokeTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 33830,
  "status": "passed"
});
});