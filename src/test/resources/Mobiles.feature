Feature: MobilePurchase

Background: common function
  Given launch the url  
  And user closes the login page
  When user clicks on mobiles

@smoke
Scenario: Apple
 Then apple should be displayed
 When user click on apple
 Then apple mobiles should be displayed
 
 @smoke
 Scenario: poco
 Then apple should be displayed
 When user click on apple
 Then apple mobiles should be displayed with one dim list 
 |poco|
 |realme|
 
 @smoke
 Scenario Outline: vivo
 #Then apple should be displayed
 #When user click on apple
 Then apple mobiles should be displayed "<mobiles>"
 
  Examples: 
 |phones|mobiles|
 |phone1|vivo|
 |phone2|realme|
 |phone3|nokia mobiles|
 
 

