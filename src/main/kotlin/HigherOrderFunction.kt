fun main(args : Array<String>){

    addTwoNumber(a = 10, b = 20){
        print("Sum is $it")
    }

    subtractTwoNumber(a = 20, b = 10){
        5

    }

}

//add two number using higher order function

fun addTwoNumber(a : Int, b: Int , action : (Int) -> Unit){
    val sum = a + b
    action(sum)
}

// higher order function with return type
fun subtractTwoNumber(a : Int , b : Int , action: (Int) -> Int){
    val sub : Int = a - b
    action(sub)
    print(sub)
}