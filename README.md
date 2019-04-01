# The Open-Closed Game

Rules of the game:
This game is played between two players.
One player will be the predictor.
To play the game, after a count of three the players will need to simultaneously show their hands with each hand either open or closed, and the predictor need to shout out how many hands they think will be open on total.
If the predictor is correct, they win, otherwise the other player becomes the predictor and they go again. This continues until the game is won.

## The challenge:

You need to create a program to play this game against the computer. This can just be a simple console application.
You will always be the predictor first.
The “AI” player will just do things randomly.

### Prerequisites

I have assume the human as predictor in round one and AI as not predictor. Subsequent round role will be switch between Human and AI


### Installing

Import the project in intellij, and run the App.java class


## Running the tests

From the intellij, run the test cases by clicking on the maven and selecting only test goal.

### Result of the game Played

Start the game, by running App.java class. Here is the result of the game executed.

```
Welcome to the game!
You are the predictor, what is your input?
OO3
AI : OC
You WIN!!
Do you want to play again?
Y
AI is the predictor, what is your input?
CC
AI : OC0
No winner.
You are the predictor, what is your input?
OO3
AI : CO
You WIN!!
Do you want to play again?
Y
AI is the predictor, what is your input?
CO
AI : CC1
AI WIN!!
Do you want to play again?
N
Ok, bye!
```




