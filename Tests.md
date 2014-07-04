White Box Testing
==========
The purpose of these tests it to test certain lines of code within the ‘Brickles’ game.
Each test case will be relevant to a line or a few lines of code, which will be tested and compared with the expected outcome.
These tests cover most go the games functionality.

TEST 1
==========
In test 1, we will be testing to see if walls are added or removed when the appropriate radio button is true. Set the values of ‘two’ the jRadioButton for two bats, to true.
````
Public Void test1(){

two.setSelected(true);

}
````

Test 1  resulted in a success, the top wall was removed and a bat was added.

TEST 2
==========
Tests 2 will test that only one button can remain true at anyone time. they are currently in button groups to stop this but we will test regardless.

````
Public Void test2(){
one.setSelected(true);
two.setSelected(true);
four.setSelected(true);
}
````
After running this test only one of the buttons was true, button ‘four’.

TEST 3
===========
Here we test difficulties, ball speed and bat size, matches the appropriate button.

````
Public Void test3(){

Hard.setSelected(true);

if(wall.setBatSize()==10 && wall.setBallSpeed()==8){
System.out.println(“ YAY! “);

}else{
System.out.println(“ oh dear! “);

}
````
Test 3 was a success, hard was selected, visually changed and bat size and ball speed matched that of the requirements and merited the response of ‘YAY!’

TEST 4
===========
Next we test the number of balls from jSpinner1

````
Public Void test4(){

jSpinner1()=3;

if(jSpinner1()=3 && ball no =3 && ballNo.getText()==“Balls left: 3”){
System.out.println(“Pass”);
}else{
System.out.println(“Fail”);
}

}
````
This test resulted in 3 balls and hence test is passed.

TEST 5
===========
Test the other jSpinner that deals with row numbers, mostly evaluation will be visual.

````
Public Void test5(){

jSpinner()=4;


}
````
Upon running this test the jSpinner value was set to 4 and the number of rows changed visually on game panel. NOTE: required restart as expected.

TEST 6
===========
reset game: 
expected results:
-score =0
-new bricks == jSpinner
-balls left == jSpinner1

````
Public Void test6(){

yes.addActionListener(resetz);
yes.doClick();

}
````
As expected everything resets accordingly.

TEST 7
===========
High scores should be able to display whole name within the panel.

````
Public Void test7(){
h1.setText(“aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa”);

}
````
Resulted in name fitting the frame, but the frame squished the other frames and made them unreadable, this would be deemed as a failure even though it technically did what it was supposed to but it broke something else.

TEST 8
===========
Help button testing:
Does help button display appropriate text from action listener and associated classes.

````
Public Void test8(){
help.addActionListener(halp);
help.doClick();


}
````
Visually everything that is stated in code, appears within a panel in the middle of the screen.

TEST 9
===========
When bricks are cleared by the player, there is a new set that appear for the game to keep playing.

````
Public Void test9(){

jSpinner() = 3;

wall.setBrick(1,12,null);

       wall.setBrick(1,11,null);
       wall.setBrick(1,10,null);
       wall.setBrick(1,9,null);
       wall.setBrick(1,8,null);
       wall.setBrick(1,7,null);
       wall.setBrick(1,6,null);
       wall.setBrick(1,5,null);
       wall.setBrick(1,4,null);
       wall.setBrick(1,3,null);
       wall.setBrick(1,2,null);
       wall.setBrick(1,1,null);
       
       wall.setBrick(2,12,null);
       wall.setBrick(2,11,null);
       wall.setBrick(2,10,null);
       wall.setBrick(2,9,null);
       wall.setBrick(2,8,null);
       wall.setBrick(2,7,null);
       wall.setBrick(2,6,null);
       wall.setBrick(2,5,null);
       wall.setBrick(2,4,null);
       wall.setBrick(2,3,null);
       wall.setBrick(2,2,null);
       wall.setBrick(2,1,null);
       
       wall.setBrick(3,12,null);
       wall.setBrick(3,11,null);
       wall.setBrick(3,10,null);
       wall.setBrick(3,9,null);
       wall.setBrick(3,8,null);
       wall.setBrick(3,7,null);
       wall.setBrick(3,6,null);
       wall.setBrick(3,5,null);
       wall.setBrick(3,4,null);
       wall.setBrick(3,3,null);
       wall.setBrick(3,2,null);
       wall.setBrick(3,1,null);
       
       wall.setBrick(4,12,null);
       wall.setBrick(4,11,null);
       wall.setBrick(4,10,null);
       wall.setBrick(4,9,null);
       wall.setBrick(4,8,null);
       wall.setBrick(4,7,null);
       wall.setBrick(4,6,null);
       wall.setBrick(4,5,null);
       wall.setBrick(4,4,null);
       wall.setBrick(4,3,null);
       wall.setBrick(4,2,null);
       wall.setBrick(4,1,null);
       
       wall.setBrick(5,12,null);
       wall.setBrick(5,11,null);
       wall.setBrick(5,10,null);
       wall.setBrick(5,9,null);
       wall.setBrick(5,8,null);
       wall.setBrick(5,7,null);
       wall.setBrick(5,6,null);
       wall.setBrick(5,5,null);
       wall.setBrick(5,4,null);
       wall.setBrick(5,3,null);
       wall.setBrick(5,2,null);
       wall.setBrick(5,1,null);



}
````
New bricks where not repainted as expected, this fails the test.

TEST 10
===========
Does exit button require confirmation to exit game, as required?

````
Public Void test10(){

Exit.doClick();

//does program then quit at confirmation screen?
yes.doClick();

}
````

Both parts of this test pass, the panel for confirmation appears with the option, then program quits when yes is selected. Can further this test by selecting no and see if it returns the user. <— it does.
