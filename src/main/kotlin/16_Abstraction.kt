Abstraction means: Hide implementation details and show only essential behavior.

| Rule                                 | Meaning              |
| ------------------------------------ | -------------------- |
| Abstract class cannot create object  | Incomplete blueprint |
| Abstract function has no body        | Child must implement |
| Child must override abstract methods | Required             |

fun main() {

    val emp1: Employee =
        FullTimeEmployee("Nazmul",50000.0,10000.0)

    val emp2: Employee =
        PartTimeEmployee("Rahim",100,200.0)

    emp1.showName()
    println(emp1.calculateSalary())

    emp2.showName()
    println(emp2.calculateSalary())
}
    
abstract class Employee(
    val name: String
) {

    abstract fun calculateSalary(): Double

    fun showName() {
        println("Employee Name: $name")
    }
}

class FullTimeEmployee(
    name: String,
    private val salary: Double,
    private val bonus: Double
) : Employee(name) {

    override fun calculateSalary(): Double {
        return salary + bonus
    }
}

class PartTimeEmployee(
    name: String,
    private val hours: Int,
    private val rate: Double
) : Employee(name) {

    override fun calculateSalary(): Double {
        return hours * rate
    }
}
