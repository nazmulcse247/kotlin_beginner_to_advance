fun main(args : Array<String>){
    var bangladeshBank : BangladeshBank // can

    bangladeshBank = IslamiBank()
    println("Prime bank given interest ${bangladeshBank.getInterest()}")

    bangladeshBank = PrimeBank()
    println("Prime bank given interest ${bangladeshBank.getInterest()}")

    bangladeshBank = BrackBank()
    println("Prime bank given interest ${bangladeshBank.getInterest()}")


}

open class BangladeshBank {
    open fun getInterest() : Int {
        return 0
    }
}

class IslamiBank : BangladeshBank() {
    override fun getInterest(): Int {
        return 10
    }
}

class PrimeBank : BangladeshBank() {
    override fun getInterest(): Int {
        return 15
    }

}

class BrackBank : BangladeshBank() {
    override fun getInterest(): Int {
        return 20
    }
}