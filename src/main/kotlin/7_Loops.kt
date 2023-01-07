fun main(args : Array<String>){

    // For loops

    for (i in 1..5 step 1){
        print("$i")
    }

    println()

    for (i in 5 downTo 1 step 1){
        print("$i")
    }
    println()
    val numberList = listOf(1,2,3,4,5)
    for (number in numberList){
        println(number)
    }


}