Feature: Registration
As A
I want
So That

Scenario: Valid Post Confirmation
Given Jobseekers enter all valid data
When click on "Submit"
Then System send a confirmation mail
And display success message "Registration was successful"

@wip @regression
Scenario: Valid Post Reset
Given Jobseekers enter all valid data
When click on "Reset"
Then System Clear all field
