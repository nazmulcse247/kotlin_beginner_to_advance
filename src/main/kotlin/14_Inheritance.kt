fun main(args : Array<String>){
    val employeeSalary = EmployeeSalary("25000","Nazmul","Dhaka")
    println(employeeSalary.showEmployeeInfo())

}

open class Employee(val name : String,val address : String){
    open fun showEmployeeInfo() : String {
        return "$name $address"
    }
}

class EmployeeSalary(private val salary : String, name: String, address: String) : Employee(name,address) {
    override fun showEmployeeInfo(): String {
        return "$salary $name $address"
    }

}