package kotlin_class

fun main() {

    val person = Person("Nazmul",27)
    person.displayPersonInfo()

    val employee = Employee("Mr X",50)
    println(employee.showEmployee())

    val employee1 = Employee()
    employee1.showEmployee()
}