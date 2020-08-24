Feature: Create task for the customer

Scenario Outline: To capture customer task details
Given Verify login functionlity
When  verify home page
Then  verfiy task button
Then  verify new task button
Then  capture task details "<title>" and "<completion>" and "<description>"
Then  Close browser

Examples:

   | title | completion | description |
   | Tom 	  | 10    | test |
   | Test 	  | 20    | ok   |
   | Mohan    | 30    | fine |