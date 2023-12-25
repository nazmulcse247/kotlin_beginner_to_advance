package kotlin_class

class Employee {

    var name : String? = null
    var age : Int? = null

    constructor()

    constructor(name : String){
        this.name = name
    }

    constructor(name : String,age : Int){
        this.name = name
        this.age = age
    }

    fun showEmployee() : String {
        return "$name $age"
    }


}