package openClass



class Plane(name: String, color: String, engines: Int, doors: Int, var pilots: String) : Vehicle(name, color, engines, doors) {
    override fun toString(): String {
        return super.toString() + " ,$pilots"
    }
}