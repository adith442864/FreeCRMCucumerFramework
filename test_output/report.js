$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Workspace/FreeCrmBDDFramework/src/main/java/features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "adithbalaji",
        "Test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "deal1",
        "2000",
        "60",
        "20"
      ],
      "line": 15
    },
    {
      "cells": [
        "deal2",
        "3000",
        "60",
        "30"
      ],
      "line": 16
    },
    {
      "cells": [
        "deal3",
        "4000",
        "70",
        "40"
      ],
      "line": 17
    },
    {
      "cells": [
        "deal4",
        "5000",
        "80",
        "50"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 13775785200,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 24801199,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 480893101,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 5775130800,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 5246900,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.moves_to_new_deal_page()"
});
formatter.result({
  "duration": 1911576699,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 8981594300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1068748099,
  "status": "passed"
});
});