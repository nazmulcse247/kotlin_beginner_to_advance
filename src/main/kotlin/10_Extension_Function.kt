
/*
*  Kotlin Extension function provides a facility to "add" methods to class without inheriting a class or using any type of design pattern.
*  The created extension functions are used as a regular function inside that class.
*  The extension function is declared with a prefix receiver type with method name.
* */

fun main(args : Array<String>){
    val s1 = "Hello"
    val s2 = "World"

    val num1  = 10
    val num2  = 20

    println(s1.add(s1, s2))
    println(num1.sum(num1,num2))
}

fun String.add(s1 : String , s2 : String) : String {
    return s1 + s2
}

fun Int.sum(num1 : Int, num2 : Int) : Int{
    return num1 + num2
}