fun main() {
    val names = arrayOf("Text", "asdas")
    val values = arrayOf(4, 3, 5, "Name", 43)
    names[0] = "New value"
//    with val we cant do that
//    names = arrayOf("sdf")
    println("first index: ${names[0]}")

    for (i in values) {
//        is to check if is int instanceof = is
        if (i is Int) {
            println(i)
        }
    }
    println(findMax(arrayOf(2, 3, 6, 7, 10, 4)))
    println(findSmallest(arrayOf(2, 3, 6, 7, 10, 4)))
    println(findMaxOrMin(arrayOf(2, 3, 6, 7, 10, 4), false))
}


fun findMaxOrMin(nums: Array<Int>, max: Boolean): Int {
    var result = nums[0]
    for (i in nums) {
        if(!max && result > i){
            result = i
        }else if(max && result < i){
            result = i
        }
    }
   return result
}

fun findMax(nums: Array<Int>): Int {
    var max = nums[0]
    for (i in nums) {
        if (i > max) max = i
    }
    return max
}


fun findSmallest(nums: Array<Int>): Int {
    var result = nums[0]
    nums.forEach { if (it < result) result = it }
    return result
}