Feature: Display balance
   Scenario: User checks the balance of an account in credit
      Given my account has been credited with $500
      When I check my balance
      Then I should see that my balance is $500