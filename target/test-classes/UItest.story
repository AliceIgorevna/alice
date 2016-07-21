Sample story
#Story for UI test
#Creator Alisa Demennikova
#Date 20/07/2016
Meta:

Narrative:
As a user
I want to go to main Google page
So that I can write search queries

Scenario:  Check email login with correct data input
Given Url <url>
When write <searchWord> in search box
Then this text is visible

Examples:
|url|searchWord|
|https://google.com|Hello World|
