Feature: To test knowledge base option functioanlity

Scenario Outline: Verify knowledge base option
Given Verify customer loggedin
When  user clicks on knowledge base and sdafe option
Then  user selects Parent node and node type from tree node
Then  user enters "<Node Title>" and clicks on save button

Examples:

|Node Title|
|Okay|
|Fine|