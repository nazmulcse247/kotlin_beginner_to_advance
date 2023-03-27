fun main(args: Array<String>) {

    val arrayUtil = ArrayUtil(arrayOf(1, 2, 3, 4, 5))
    arrayUtil.findElement(3) { index, element ->
        println("Index: $index")
        println("Element: $element")
    }

}

class ArrayUtil<T>(private val array: Array<T>) {

    fun findElement(element: T, foundElement: (index: Int, element: T?) -> Unit) {
        for (i in array.indices) {
            if (array[i] == element) {
                foundElement(i, array[i])
                return
            }
        }
        foundElement(-1, null)
        return
    }

}