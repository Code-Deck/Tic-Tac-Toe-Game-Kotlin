var row1: Array<String> = Array(3, {"Unclaimed"})
var row2: Array<String> = Array(3, {"Unclaimed"})
var row3: Array<String> = Array(3, {"Unclaimed"})
var playerName: String = String()
var opponentName: String = String()

fun printGame() {
    print("Row 1: ")
    for (i in row1.indices) {
        print(row1[i] + " ")
    }

    println()

    print("Row 2: ")
    for (i in row2.indices) {
        print(row2[i] + " ")
    }

    println()

    print("Row 3: ")
    for (i in row3.indices) {
        print(row3[i] + " ")
    }

    println()
}

fun claimPosition(playerName: String, row1: Array<String>, row2: Array<String>, row3: Array<String>) {
    println("Here is the up to date Tic Tac Toe map!")
    printGame()

    println()

    println("Please select a row (1, 2, or 3)")
    val selectedRow: Int = readLine()!!.toInt()

    print("Please select a position (1, 2, or 3)")
    val selectedPosition: Int = readLine()!!.toInt()

    when (selectedRow) {
        1 ->
            if (row1[selectedPosition - 1] == "Unclaimed") {
                row1[selectedPosition - 1] = playerName
            }
            else if (row1[selectedPosition - 1] != "Unclaimed") {
                println("Sorry. The position you have selected is already claimed. It is now your opponent's turn to play.")
            }
        2 ->
            if (row2[selectedPosition - 1] == "Unclaimed") {
                row2[selectedPosition - 1] = playerName
            }
            else if (row2[selectedPosition - 1] != "Unclaimed") {
                println("Sorry. The position you have selected is already claimed. It is now your opponent's turn to play.")
            }
        3 ->
            if (row3[selectedPosition - 1] == "Unclaimed") {
                row3[selectedPosition - 1] = playerName
            }
            else if (row3[selectedPosition - 1] != "Unclaimed") {
                println("Sorry. The position you have selected is already claimed. It is now your opponent's turn to play.")
            }
    }

}

fun main(Args: Array<String>) {

    println("Would you like to play as 'X' or 'O'?")
    playerName = readLine().toString()

    if (playerName == "X") {
        opponentName = "O"
    }
    else if (playerName == "O") {
        opponentName = "X"
    }

    while (row1.contains("Unclaimed") || row2.contains("Unclaimed") || row3.contains("Unclaimed")) {
        claimPosition(playerName, row1, row2, row3)
        if (row1.contains("Unclaimed") == false && row2.contains("Unclaimed") == false && row3.contains("Unclaimed") == false) {
            println("Game Over.")
            break
        }

        if (row1[0] == "X" && row1[1] == "X" && row1[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row2[0] == "X" && row2[1] == "X" && row2[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row3[0] == "X" && row3[1] == "X" && row3[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row1[0] == "X" && row2[1] == "X" && row3[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row3[0] == "X" && row2[1] == "X" && row1[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }

        if (row1[0] == "O" && row1[1] == "O" && row1[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row2[0] == "O" && row2[1] == "O" && row2[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row3[0] == "O" && row3[1] == "O" && row3[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row1[0] == "O" && row2[1] == "O" && row3[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row3[0] == "O" && row2[1] == "O" && row1[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }

        claimPosition(opponentName, row1, row2, row3)

        if (row1.contains("Unclaimed") == false && row2.contains("Unclaimed") == false && row3.contains("Unclaimed") == false) {
            println("Game Over.")
            break
        }

        if (row1[0] == "X" && row1[1] == "X" && row1[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row2[0] == "X" && row2[1] == "X" && row2[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row3[0] == "X" && row3[1] == "X" && row3[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row1[0] == "X" && row2[1] == "X" && row3[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }
        if (row3[0] == "X" && row2[1] == "X" && row1[2] == "X") {
            println("Game Over. Player X is the winner.")
            break
        }

        if (row1[0] == "O" && row1[1] == "O" && row1[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row2[0] == "O" && row2[1] == "O" && row2[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row3[0] == "O" && row3[1] == "O" && row3[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row1[0] == "O" && row2[1] == "O" && row3[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
        if (row3[0] == "O" && row2[1] == "O" && row1[2] == "O") {
            println("Game Over. Player O is the winner.")
            break
        }
    }
}
