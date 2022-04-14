Feature: Automation Practice form
@Regression @Sanity
Scenario Outline: Fill entire practice form
Given user navigates to Automation practice form
When  I enter first name "<First Name>"
And I enter last name "<Last Name>"
And I enter Email "<Email>"
And I enter Phone Number "<Phone Number>"
And I enter "<DateDob>","<MonthDob>","<YearDob>"
And I enter Address "<Address>"
Then I click on Submit button
Examples:
|First Name|Last Name|Email                   |Phone Number|DateDob|MonthDob|YearDob|Address                                                |
|Ankit     |Bajaj    |ankitbajaj1991@gmail.com|9711339450  | 22    |5       |1991   | House No. 260 Sector 12 Part 2 Karnal Haryana , 132001|
|Anika     |Miglani  |anika0403@gmail.com     |8053805253  |  4    |2       |1991   | House No. 260 Sector 12 Part 2 Karnal Haryana , 132001|

@Regression
Scenario: Fill entire practice form
Given user navigates to Automation practice form
Then Fillup the form
     |Brock     |Lesnar    |suplexcitybitch@gmail.com|9711339450  | 22    |7      |1973   | Saskactchwan , Canada|
     
@Sanity1    
Scenario: Fill entire practice form
Given user navigates to Automation practice form
Then Fillup the form for Automation
     |FirstName     |LastName | PhoneNumber|
     |Brock         |Lesnar   | 9711339450 |
     