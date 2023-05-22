Feature: Searching Brand Names

Background:

Given  Hello from BrandSearch
@Brands
Scenario: Search Valid Brand Names
Given I launched the application
When I hovered over the Brand Tab
When I Searched for a valid BrandNames
Then I verified that brandname got searched successfully

@Brands-Invalid
Scenario: Search InValid Brand Names
Given I launched the application
When I hovered over the Brand Tab
When I Searched for a Invalid BrandNames
Then I verified that brandname got searched successfully

