class SingeltonClass private constructor() {
    companion object {
        private var instance: SingeltonClass? = null
        fun getInstance(): SingeltonClass {
            if (instance == null) {
                instance = SingeltonClass()
            }
            return instance!!
        }
    }
}
// This is how you should do it
object SingleObject {
    init{
        println("SingleObject created...")
    }
}