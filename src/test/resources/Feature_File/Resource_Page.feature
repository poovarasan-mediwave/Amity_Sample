Feature: Test the Resource functionality

  Background: 
    When user enter the "<CreatorUser>" and "<CreatorPassword>"
    And user click the Login button in creator crendentials
    Then user should navigate to resource page and user click the create new resource option

  Scenario: Test the Creator create resources and Approver gives error message
    And user should select the article in resource type
    And user enter the resource title and then user should select the topic
    And user should select the ageGroup
    And user add the content link and then click the save button
    And user enter tags and then click the list of current tags
    And user click the publisher option
    And user should select the approvers list and then click the submit for approval button
    And user take screenshot and then click the profile option
    And user click the logout option in creator crendentials
    And user should enters the ApprovaerEmail "<ApproverUser>" and ApproverPassword"<ApproverPass>"
    And user click the Login button and then click the my Notification option
    And user click the newly added resources name
    And user click the flag for review button and then enter notes after click the submit button
    And user should take screenshot and then click the profile option
    And user click the logout option in approver credentials
    When user enter the "<CreatorUser>" and "<CreatorPassword>" and then user click the Login button
    And user click the my notification button in creator login and then user take screenshot

  Scenario: Test the Creator create resources and Approver approve and then publish
    And user should  select the video in Resources Type
    And user should  enter the resource title and then user should select the topic
    And user select the ageGroup
    And user enter the video caption "<caption>" and then user click the video source
    And user add the  video content link in creator page and then click the save button
    And user enter tags and then click the list of current tags in that click add tag button
    And user should click the publisher option
    And user select the approvers list and then click the submit for approval button
    And user take screenshot and then click profile option
    And user click the logout option in creator credentials
    And user should enter the ApproverEmailAddress "<ApproverUser>" and ApproverPassword"<ApproverPass>" in approvers credentials
    And user click the Login button in approver credentials and user click the Mynotification
    And user click the newly added resources and then click the approve button
    And users click the profile and users click logout button in approver credential
    And user should enters the creator credential "<CreatorUser>" and  "<CreatorPassword>" and login the creator page
    And user click the my Notification by creater in that user click the newly added resource
    And user click the publish button in creator credentials
    And user cick newest one and also click unpublish
    And user logout the creator credentials

  #And user enters the TrustEmail "<TrustUser>" and TrustPassword "<TrustPassword>" and user login the trust admin
  #And user click the Mynotification option and user search the already create contentor name and click the newest one
  #And user take screenshot for present creator

  Scenario: Test the Creator create resources insert image and approver approve, creator publish and unpublish
    And user select the video in Resources Type
    And user should enter the resource title and user should select the Topic
    And user select ageGroup
    And user enter video caption in image "<CaptionImage>" and user click the video source button
    And user insert the image page in video content option
    And user enter the tags
    And user should click the publisher button
    And user should select the approvers and also click the submit for approval button
    And user click the profile option and then user click the logout button in creator
    And user should enter the "<ApproverUser>" and "<ApproverPass>" and user click the Login button in approver credentials
    And user should click the Mynotification option and user click the newly added resources
    And users click the approve button
    And users click the profile and users click logout button approver credential
    And user should enters the "<CreatorUser>" and  "<CreatorPassword>" and login the creator page
    And user click the my Notification by creater and user click the newly added resource
    And user click the publish button and user logout the creator credentials
    And user enters the "<TrustUser>" and "<TrustPassword>" in trust admin and user click login button
    And user should click the Mynotification option and user search the already create contentor name and click the newest one
    And user should take screenshot for present creator
