package kol1

class C(name: String, var number: Double, var age: Int) : A(name) {
    override fun toString(): String {
        return super.toString() + ": $age, $number"
    }
}