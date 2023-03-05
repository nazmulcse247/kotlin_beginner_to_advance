fun main(args : Array<String>){

    sum(
        10,
        20,
        {
            println("sum : $it")
        },
        {
            println("sub : $it")
        }

    )
}

fun sum(firstNum: Int, secondNum: Int, sum: (Int) -> Unit, sub: (Int) -> Unit) {

    val sumTotal = firstNum + secondNum
    val subTotal = firstNum - secondNum
    sum(sumTotal)
    sub(subTotal)
}