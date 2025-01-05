Feature:Verify filtered agent information

  Scenario:User searches for an agent and verifies filtered information

    Given Go to the "homepageUrl"
    Then Click on the "Find an Agent" button
    Then Select "ALABAMA"
    Then Click on the Find button
    Then verify that the filtered agent information is correct