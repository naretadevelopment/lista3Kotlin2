import kotlin.Array

fun main() {

    val matrix = createRandomMatrix(3, 2)
    displayMatrix(matrix)


    val transposedMatrix = transpose(matrix)
    print("transposed ")
    displayMatrix(transposedMatrix)

    val sumOfRows = calculateSumInRows(matrix)
    print("sum of rows  ")
    displayArray(sumOfRows)

    val sumOfColumns = calculateSumInColumns(matrix)
    print("sum of columns  ")
    displayArray(sumOfColumns)

    val multipliedMatrix = multiplyBy(matrix, 2)
    print("multiplied ")
    displayMatrix(multipliedMatrix)

}


private fun createZeroesMatrix(rows: Int, columns: Int): Array<Array<Int>> {

    var matrix = arrayOf<Array<Int>>()


    for (i in 0 until rows) {
        var array = arrayOf<Int>() //dodaje rzad
        for (j in 0 until columns) {
            array = array + 0
        }
        matrix += array  //dodaje rząd do macierzy
    }

    return matrix

}


private fun createRandomMatrix(rows: Int, columns: Int): Array<Array<Int>> {

    var matrix = arrayOf<Array<Int>>()

    for (i in 0 until rows) {
        var array = arrayOf<Int>() //dodaje rzad
        for (j in 0 until columns) {
            array += (0..9).random()
        }
        matrix += array  //dodaje rząd do macierzy
    }
    return matrix
}

private fun displayMatrix(matrix: Array<Array<Int>>) {

    println("matrix")
    for (row in matrix) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}

private fun displayArray(array: IntArray) {
    println("array")
    for (i in 0 until array.size) {
        var number = array[i]
        print("$number ")
    }
    println()
}


fun transpose(matrix: Array<Array<Int>>): Array<Array<Int>> {

    var rows = matrix.size
    var columns = matrix[0].size

    var transpose = createZeroesMatrix(columns, rows)

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            transpose[j][i] = matrix[i][j]
        }
    }
    return transpose
}

fun calculateSumInRows(matrix: Array<Array<Int>>): IntArray {

    var rows = matrix.size
    var columns = matrix[0].size


    var sumOfRows = IntArray(rows)
    var sum = 0

    for (i in 0 until rows) {

        for (j in 0 until columns) {
            sum += matrix[i][j]
        }
        sumOfRows[i] = sum
        sum = 0
    }


    return sumOfRows

}

fun calculateSumInColumns(matrix: Array<Array<Int>>): IntArray {

    var rows = matrix.size
    var columns = matrix[0].size


    var sumOfColumns = IntArray(columns)
    var sum = 0

    for (i in 0 until columns) {

        for (j in 0 until rows) {
            sum += matrix[j][i]
        }
        sumOfColumns[i] = sum
        sum = 0
    }


    return sumOfColumns

}

fun multiplyBy(matrix: Array<Array<Int>>, number: Int): Array<Array<Int>> {

    var rows = matrix.size
    var columns = matrix[0].size

    var multipliedMatrix = createZeroesMatrix(rows, columns)

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            multipliedMatrix[i][j] = number * matrix[i][j]
        }
    }
    return multipliedMatrix
}


