fun main(args : Array<String>){

    val islamiBanks = IslamiBanks()
    println(islamiBanks.getInterest())

}

abstract class CentralBank() {
    abstract fun getInterest() : Int
}

class IslamiBanks : CentralBank() {
    override fun getInterest(): Int {
        return 10
    }

}

class PrimeBanks : CentralBank() {
    override fun getInterest(): Int {
        return 15
    }

}

class AsiaBank : CentralBank() {
    override fun getInterest(): Int {
        return 20
    }
}