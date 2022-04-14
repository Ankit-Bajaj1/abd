Feature: Google Search

Scenario Outline: Type text in search bar

Given To launch Google url
When  search bar visible
Then Enter text "<texts>" 
And user closes the browser
Examples:
|texts|
|ankit|
|anika|
