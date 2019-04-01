Feature: User is sigin 

Scenario Outline:  user is able to login
Given user launches browser and navigates to www.facebook.com
When user enter username "<user>"


Examples:
|user|
|mona|
|sona|