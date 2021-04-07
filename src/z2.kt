fun main() {


    var matrix = createIrregularMatrix(5, 5)
    displayIrregularMatrix(matrix)

    var elements = howManyElements(matrix)
    println("matrix contains $elements elements")

    var sumOfRows = sumOfRows(matrix)
    print("sum of rows ")
    displayArray(sumOfRows)

}

fun createIrregularMatrix(rows: Int, columns: Int): Array<Array<Int>> {

    var matrix = arrayOf<Array<Int>>()

    var r = rows - 1
    var c = r

    for (i in r downTo 0) {
        var array = arrayOf<Int>()
        for (j in 0..c - i) {
            array += (1..10).random()
        }
        matrix += array
    }

    return matrix

}

fun displayIrregularMatrix(matrix: Array<Array<Int>>) {

    for (array in matrix) {
        for (value in array) {
            print("$value ")
        }
        println()
    }

}


fun howManyElements(matrix: Array<Array<Int>>): Int {

    var elements = 0

    for (i in 0 until matrix.size) {
        elements += matrix[i].size
    }

    return elements
}

fun sumOfRows(matrix: Array<Array<Int>>): IntArray {

    var rows = matrix.size

    var sumOfRows = IntArray(rows)
    var sum = 0

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            sum += matrix[i][j]
        }
        sumOfRows[i] = sum
        sum = 0
    }

    return sumOfRows
}


private fun displayArray(array: IntArray) {
    println("array")
    for (i in 0 until array.size) {
        var number = array[i]
        print("$number ")
    }
    println()
}
