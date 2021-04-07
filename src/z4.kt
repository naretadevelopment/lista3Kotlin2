import java.math.RoundingMode
import kotlin.Array
import kotlin.math.round


fun main() {

    val matrix = createRandomMatrix(5, 4)
    displayMatrix(matrix)

    var moviesAvgRating1: DoubleArray = calculateAvgRating(matrix)
    displayArray(moviesAvgRating1)


    var moviesAvgRating2: DoubleArray = calculateAvgRatingWithoutReviewer(matrix, 1)
    displayArray(moviesAvgRating2)



    showMoviesWithRatingUp(moviesAvgRating2, 3.0)


}


fun calculateAvgRating(matrix: Array<Array<Int>>): DoubleArray {


    var moviesAvgRating = DoubleArray(matrix.size - 1) // ilosc wierszy/filmow
    var sum = 0.0
    for (i in matrix[0].indices) {
        for (j in matrix.indices) {
            sum += (matrix[j][i]).toDouble()

        }
        moviesAvgRating[i] = round((sum / matrix.size.toDouble()) * 100) / 100
        sum = 0.0
    }
    println("avg movies rating ")

    return moviesAvgRating
}

fun calculateAvgRatingWithoutReviewer(matrix: Array<Array<Int>>, numberOfReviewer: Int): DoubleArray {


    var moviesAvgRating = DoubleArray(matrix.size - 1)
    var sum = 0.0
    for (i in matrix[0].indices) {
        for (j in matrix.indices) {

            if (j == (numberOfReviewer - 1)) {
                sum = sum
            } else {
                sum += (matrix[j][i]).toDouble()
            }

        }
        moviesAvgRating[i] = round(sum / (matrix.size.toDouble() - 1) * 100) / 100
        sum = 0.0
    }
    println("avg movies rating without reviever no. $numberOfReviewer ")
    return moviesAvgRating
}


private fun createRandomMatrix(rows: Int, columns: Int): Array<Array<Int>> {

    var matrix = arrayOf<Array<Int>>()

    for (i in 0 until rows) {
        var array = arrayOf<Int>() //dodaje rzad
        for (j in 0 until columns) {
            array += (1..5).random()
        }
        matrix += array  //dodaje rząd do macierzy
    }
    return matrix
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

private fun displayMatrix(matrix: Array<Array<Int>>) {

    // println("matrix")
    for (row in matrix) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}

private fun displayArray(array: DoubleArray) {
    //println("array")
    for (i in 0 until array.size) {
        var number = array[i]
        print("$number ")
    }
    println()
}


fun showMoviesWithRatingUp(moviesAvgRating: DoubleArray, avg: Double) {


    var listOfMovies: MutableList<Int> = mutableListOf()

    for (i in 0 until moviesAvgRating.size) {
        var movieAvg = moviesAvgRating[i]
        if (movieAvg >= avg) {
            listOfMovies.add(i + 1)
        } else {

        }

    }

    if (listOfMovies.size > 0) {
        for (i in 0 until listOfMovies.size) {

            println(listOfMovies[i])

        }
    } else {
        println("no movies with this avg ")
    }
}










