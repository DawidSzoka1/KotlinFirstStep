package kol1

class B(name: String, var age: Int) : A(name) {
    override fun toString(): String {
        return super.toString() + ": $age"
    }
}