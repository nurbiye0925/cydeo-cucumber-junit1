Feature: Library app login feature
  user story :
  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Scenario: Login as Librarian
  When user enters librarian username
  And user enters  librarian password
  Then user should  see the dashboard

