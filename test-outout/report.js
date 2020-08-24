$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/D Drive/Mohit/WorkSpace_Mohit/FreeCrmAutomation/src/main/java/com/freecrm/Features/KnowledgeBase.feature");
formatter.feature({
  "line": 1,
  "name": "To test knowledge base option functioanlity",
  "description": "",
  "id": "to-test-knowledge-base-option-functioanlity",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify knowledge base option",
  "description": "",
  "id": "to-test-knowledge-base-option-functioanlity;verify-knowledge-base-option",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Verify customer loggedin",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on knowledge base and sdafe option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects Parent node and node type from tree node",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cNode Title\u003e\" and clicks on save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "to-test-knowledge-base-option-functioanlity;verify-knowledge-base-option;",
  "rows": [
    {
      "cells": [
        "Node Title"
      ],
      "line": 11,
      "id": "to-test-knowledge-base-option-functioanlity;verify-knowledge-base-option;;1"
    },
    {
      "cells": [
        "Okay"
      ],
      "line": 12,
      "id": "to-test-knowledge-base-option-functioanlity;verify-knowledge-base-option;;2"
    },
    {
      "cells": [
        "Fine"
      ],
      "line": 13,
      "id": "to-test-knowledge-base-option-functioanlity;verify-knowledge-base-option;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verify knowledge base option",
  "description": "",
  "id": "to-test-knowledge-base-option-functioanlity;verify-knowledge-base-option;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Verify customer loggedin",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on knowledge base and sdafe option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects Parent node and node type from tree node",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Okay\" and clicks on save button",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "KnowledgeBaseStepDefinitions.verify_customer_loggedin()"
});
formatter.result({
  "duration": 19571582400,
  "status": "passed"
});
formatter.match({
  "location": "KnowledgeBaseStepDefinitions.user_clicks_on_knowledge_base_and_sdafe_option()"
});
formatter.result({
  "duration": 3122413800,
  "status": "passed"
});
formatter.match({
  "location": "KnowledgeBaseStepDefinitions.user_selects_Parent_node_and_node_type_from_tree_node()"
});
formatter.result({
  "duration": 198809700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Okay",
      "offset": 13
    }
  ],
  "location": "KnowledgeBaseStepDefinitions.user_enters_and_clicks_on_save_button(String)"
});
formatter.result({
  "duration": 2010985800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify knowledge base option",
  "description": "",
  "id": "to-test-knowledge-base-option-functioanlity;verify-knowledge-base-option;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Verify customer loggedin",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on knowledge base and sdafe option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects Parent node and node type from tree node",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Fine\" and clicks on save button",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "KnowledgeBaseStepDefinitions.verify_customer_loggedin()"
});
formatter.result({
  "duration": 16900653300,
  "status": "passed"
});
formatter.match({
  "location": "KnowledgeBaseStepDefinitions.user_clicks_on_knowledge_base_and_sdafe_option()"
});
formatter.result({
  "duration": 3055181100,
  "status": "passed"
});
formatter.match({
  "location": "KnowledgeBaseStepDefinitions.user_selects_Parent_node_and_node_type_from_tree_node()"
});
formatter.result({
  "duration": 194698200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fine",
      "offset": 13
    }
  ],
  "location": "KnowledgeBaseStepDefinitions.user_enters_and_clicks_on_save_button(String)"
});
formatter.result({
  "duration": 2233866500,
  "status": "passed"
});
});