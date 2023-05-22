Feature: ABC

#Scenario Outline: ABC
#Given I am A "<NameofPersons>"
#When I do B
#Then I get C
#
#Examples:
#|NameofPersons|
#|Sangi|
#|Kannan|

Scenario Outline:ABC
Given I am reading name and age
|Sangi|10|
|Kannan|20|
Given I am "<NameOfPerson>"
Examples:
|NameOfPerson|
|Arti|
|Sangi|
|Ishu|
|Sowmi|