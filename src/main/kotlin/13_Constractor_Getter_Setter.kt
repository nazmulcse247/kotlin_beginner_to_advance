fun main(args : Array<String>) {
    val student = Student()
    student.name = "MR Karim"
    student.rollNo = "101"
    println(student.rollNo + " " + student.name)

    val person = Person(name = "Karim", roll = "09")
    println(person.name)

}

//Class with basic property
class Student {
    var name : String? = null
    var rollNo : String? = null

    fun getStudent() : String {
        return "$name $rollNo"
    }
}

class Person(val name : String, val roll : String) {

}