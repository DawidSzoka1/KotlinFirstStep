fun main() {
    val text: String? = "Text"
    // cant use string methods on String? variable
//    println(text.length)
//    first we need to check if value isnt null
    if(text != null) {
        println(text.length)
    }
//    one line check if value is null
    println(text?.length)
// This will throw error when value is null instead of returning null
    println(text!!.length)

//    if text is null then text2 = "this is text" else text2 = text
    val text2 = text ?: "this is text"
    println(text2)
}