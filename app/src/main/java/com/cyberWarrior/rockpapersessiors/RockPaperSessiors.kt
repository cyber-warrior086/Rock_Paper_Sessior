package com.cyberWarrior.rockpapersessiors


fun main() {
    println("Welcome to Rock, Paper, Scissors")
    println("Enter you name -:")
    val playerName = readlnOrNull()
    println("Please enter your choice: Rock, Paper, or Scissors")
    val playerInput = readLine()?.uppercase()
    var computerChoice = ""

    val randomNumber = (1..3).random()

    if (randomNumber == 1) {
        computerChoice = "ROCK"
    } else if (randomNumber == 2) {
        computerChoice = "PAPER"
    } else if (randomNumber == 3) {
        computerChoice = "SCISSORS"
    } else {
        println("Invalid Input")
    }

    if (playerInput != "ROCK" || playerInput != "PAPER" || playerInput != "SCISSORS") {
        println("Invalid Input!! Please try again.")
        return
    }

    println("Computer chose $computerChoice")

    val winner = when {
        playerInput == computerChoice -> "Tie" //if both the choices are same
        playerInput == "ROCK" && computerChoice == "SCISSORS" -> playerName
        playerInput == "PAPER" && computerChoice == "ROCK" -> playerName
        playerInput == "SCISSORS" && computerChoice == "PAPER" -> playerName

        else -> {
            "Computer" //if none of the above conditions are met, computer wins
        }
    }

    when (winner) {
        "Tie" -> {
            println("It's a tie!")
        }

        playerName -> {
            println("Congratulations, $playerName! You win!")
        }

        else -> {
            println("Sorry, you lose. Better luck next time!")
        }
    }

}