Rock, Paper, Scissors Game

Overview

This is a simple command-line implementation of the classic game Rock, Paper, Scissors written in Kotlin. The user competes against the computer in a single round to see who wins based on their choices.

How to Play

Start the Game:

Run the program in a Kotlin-supported environment (e.g., IntelliJ IDEA or the command line).

Provide Your Name:

The game will ask you to enter your name. This will personalize the experience.

Make Your Choice:

You will be prompted to enter your choice: Rock, Paper, or Scissors.

The Computer Makes Its Choice:

The computer will randomly select Rock, Paper, or Scissors.

The Winner is Determined:

The program will compare your choice against the computer's and declare the winner:

Rock beats Scissors.

Paper beats Rock.

Scissors beats Paper.

The game ends in a tie if both choices are the same.

Invalid Input:

If you enter something other than Rock, Paper, or Scissors, the game will display an error message and terminate.

Features

Random Computer Choice: The computer's choice is generated using a random number.

Case-Insensitive Input: The game accepts inputs like rock, Rock, or ROCK.

Personalized Gameplay: The user's name is used in the output messages.

Single Round: The game executes a single round per play.

Code Structure

Main Components:

Input Handling:

The player's name and choice are taken using readlnOrNull() for safe, nullable input handling.

Validation:

The player's input is validated to ensure it's either Rock, Paper, or Scissors (case-insensitive).

Game Logic:

A when statement is used to determine the winner based on the player's and computer's choices.

Output:

Results are displayed, including whether the player won, lost, or tied with the computer.

Example Outputs

Scenario 1: User Wins

Welcome to Rock, Paper, Scissors
Enter your name:
John
Please enter your choice: Rock, Paper, or Scissors
rock
Computer chose: SCISSORS
Congratulations, John! You win!

Scenario 2: Tie

Welcome to Rock, Paper, Scissors
Enter your name:
Alice
Please enter your choice: Rock, Paper, or Scissors
paper
Computer chose: PAPER
It's a tie!

Scenario 3: User Loses

Welcome to Rock, Paper, Scissors
Enter your name:
Bob
Please enter your choice: Rock, Paper, or Scissors
scissors
Computer chose: ROCK
Sorry, you lose. Better luck next time!

Scenario 4: Invalid Input

Welcome to Rock, Paper, Scissors
Enter your name:
Charlie
Please enter your choice: Rock, Paper, or Scissors
hello
Invalid input. Please enter Rock, Paper, or Scissors.

Prerequisites

Kotlin compiler or IDE (e.g., IntelliJ IDEA).

JDK installed on your system.

How to Run

Clone or copy the code into a Kotlin project in your preferred IDE.

Compile and run the program.

Follow the on-screen instructions to play the game.

Potential Enhancements

Replay Option:

Allow the user to play multiple rounds without restarting the program.

Score Tracking:

Add a feature to track the player's and computer's scores over multiple rounds.

Enhanced Input Handling:

Provide more detailed feedback for invalid inputs.
