import java.util.Scanner

fun main(args: Array<String>) {

    println("Give your marks")
    val input = Scanner(System.`in`)
    val marks = input.nextInt()
    val number: Int = 0
    val outstanding = 80..100
    val excelent = 75..79
    val veryGood = 70..74
    val good = 65..69
    val satisfactory = 60..64
    val average = 55..59
    val bellowAvarage = 50..54
    val pass = 40..44

    if (outstanding.contains(marks)) {
        println("You Got A+ \uD83D\uDE00")

    }
    else if (excelent.contains(marks)){
        println("You Got A \uD83D\uDE03 ")
    }
    else if (veryGood.contains(marks)){
        println("You Got A-\uD83D\uDE00")
    }
    else if (good.contains(marks)){
        println("You Got B+\uD83D\uDE00")
    }
    else if (satisfactory.contains(marks)){
        println("You Got B\uD83D\uDE00")
    }
    else if (bellowAvarage.contains(marks)){
        println("You Got B-\uD83D\uDE00")
    }
    else if (pass.contains(marks)){
        println("You Got C+\uD83D\uDE00")
    }

    else{
        println("You Fail \uD83D\uDE2D ")
    }
}