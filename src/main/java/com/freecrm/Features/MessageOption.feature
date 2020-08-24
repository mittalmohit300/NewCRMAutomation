Feature: To test Message option functioanlity

Scenario Outline: Verify message option
Given Verify user loggedin
When user clicks on message option
Then user enters message in "<messagebox>"
Then user clicks on post button
Then close browser

Examples:

|messagebox|
|Okay|
|Fine|