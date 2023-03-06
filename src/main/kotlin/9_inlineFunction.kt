
/*
An Inline function is a kind of function that is declared with the keyword "inline" just before the function declaration.
Once a function is declared inline, the compiler does not allocate any memory for this function, instead the compiler copies the piece of code virtually at the calling place at runtime
*/
fun main(args : Array<String>){

    sum(
        20,
        10,
        sum = {
            println("sum : $it")
        },
        sub = {
            println("sub : $it")
        }

    )
}

inline fun sum(firstNum: Int, secondNum: Int, sum: (Int) -> Unit, sub: (Int) -> Unit) {

    val sumTotal = firstNum + secondNum
    val subTotal = firstNum - secondNum
    sum(sumTotal)
    sub(subTotal)
}