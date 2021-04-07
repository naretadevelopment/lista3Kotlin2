////import kotlin.math.sqrt
////
////fun main() {
////
////    var points1 = arrayOf<Array<Double>>() //[x1][y1]
////
////
////    // [x1][y1]
////
////    var points2 = arrayOf<Array<Double>>()
////
////    // [x2][y2]
////
////    // wypełniasz te tablcie
////
////
////    var tableOfDistances = createTableOfDistances(points1, points2)
////
////
////    tableOfDistances.sort(0)
////
////
////    var dist = tableOfDistances[0][0]
////    var numer1 = tableOfDistances[0][1]
////    var numer2 = tableOfDistances[0][2]
////
////
////    var x1 = points1[numer1.toInt()][0]
////    var y1 = points1[numer1.toInt()][1]
////
////    var x2 = points1[numer2.toInt()][0]
////    var y2 = points1[numer2.toInt()][1]
////
////
////    println("closesstsg $dist , point1 $x1 ")
////
////}
////
////fun calculateDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
////
////
////    var distance = x1 + x2 + y1 + y2
////
////    return distance
////
////}
////
////
////fun createTableOfDistances(points1: Array<Array<Double>>, points2: Array<Array<Double>>): Array<Array<Double>> {
////
////
////    var combiantions = points1.size * points2.size
////    var distancesBetween = arrayOf<Array<Double>>()  // zadać wymiary tablci
////
////// wypełnij zerami distancesBetween
////
////
////    var h = 0 // licznik / itrator dla distancesBetween
////
////    for (i in 0 until points1.size) {
////
////
////        for (j in 0 until points2.size) {
////
////            var x1 = points1[i][0]
////            var y1 = points1[i][1]
////
////            var x2 = points2[j][0]
////            var y2 = points2[j][1]
////
////            var distance = calculateDistance(x1, y1, x2, y2)
////
////            distancesBetween[h][0] = distance
////            distancesBetween[h][1] = i.toDouble()
////            distancesBetween[h][2] = j.toDouble()
////            h += 1
////        }
////
////    }
////
////
////    return distancesBetween
////}
//
//
//import kotlin.math.pow
//import kotlin.math.round
//import kotlin.random.Random
//
//fun main() {
//
//    println("Pierwsza tablica punktów")
//
//    var points1 = madeMatrixOfPoints(3, 2)
//    displayMatrix(points1)
//
//    println("Druga tablica punktów")
//
//    var points2 = madeMatrixOfPoints(3, 2)
//    displayMatrix(points2)
//
//    var tableOfDistances = createTableOfDistances(points1, points2)
//
//
//    //println(tableOfDistances) // tutaj też trzeba uzyc displayMatrix(matrix)
//
//    displayMatrix(tableOfDistances)
//
//    //tableOfDistances.sortBy { 0 }()
//    var iterator = sortByDistance(tableOfDistances)
//    //println(tableOfDistances)
//    //print("--------------------") // zeby wizualnie oddzielić przed i po
//    //displayMatrix(tableOfDistances)
//
//
//    var dist = tableOfDistances[iterator][0]
//    var punkt1 = tableOfDistances[iterator][1]
//    var punkt2 = tableOfDistances[iterator][2]
//
//
//    var x1 = points1[punkt1.toInt()][0]
//    var y1 = points1[punkt1.toInt()][1]
//
//    var x2 = points1[punkt2.toInt()][0]
//    var y2 = points1[punkt2.toInt()][1]
//
//
//    println("Najmniejsza odleglosc: $dist jest pomiedzy punktem ($x1, $y1) i punktem ($x2, $y2) ")
//
//}
//
//fun sortByDistance(tableOfDistances: Array<Array<Double>>): Any {
//
//
//    var iterator = 9
//    return iterator
//
//
//}
//
//fun madeMatrixOfPoints(rows: Int, columns: Int): Array<Array<Double>> {
//
//    var matrix = arrayOf<Array<Double>>()
//
//
//    for (i in 0 until rows) {
//        var array = arrayOf<Double>() //dodaje rzad
//        for (j in 0 until columns) {
//            array += round(Random.nextDouble(0.0, 9.0) * 100) / 100
//        }
//        matrix += array  //dodaje rząd do macierzy
//    }
//    return matrix
//}
//
//
///// do dopisałem. to to samo co madeMatrixOfPoints ale wypełnia 0
//
//
//fun madeMatrixOfZeroes(rows: Int, columns: Int): Array<Array<Double>> {
//
//    var matrix = arrayOf<Array<Double>>()
//
//
//    for (i in 0 until rows) {
//        var array = arrayOf<Double>() //dodaje rzad
//        for (j in 0 until columns) {
//            array += 0.0
//        }
//        matrix += array  //dodaje rząd do macierzy
//    }
//    return matrix
//}
//
//////
//
//
//fun displayMatrix(matrix: Array<Array<Double>>) {
//
//    for (row in matrix) {
//        for (column in row) {
//            print("$column  ")
//        }
//        println()
//    }
//}
//
//fun calculateDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
//
//
//    var distance = ((x2 - x1).pow(2) + (y2 - y1).pow(2)).pow(0.5)
//    return distance
//
//}
//
//
//fun createTableOfDistances(points1: Array<Array<Double>>, points2: Array<Array<Double>>): Array<Array<Double>> {
//
//
//    var combiantions = points1.size * points2.size
//    //var distancesBetween = arrayOf<Array<Double>>() // inicjalizacja
//
//
//    //  madeMatrixOfPoints(combiantions, 1)// to jest napewnoe źle i nie wiem jak to wypełnic zerami...
//
//
//    var distancesBetween = madeMatrixOfZeroes(combiantions, 3) // wypełnianie zerami
//
//
//    //dodalem
//
//
//    //
//
//    var h = 0 // licznik / itrator dla distancesBetween
//
//    for (i in 0 until points1.size) {
//
//        for (j in 0 until points2.size) {
//
//            var x1 = points1[i][0]
//            var y1 = points1[i][1]
//
//            var x2 = points2[j][0]
//            var y2 = points2[j][1]
//
//            var distance = calculateDistance(x1, y1, x2, y2)
//
//            distancesBetween[h][0] = distance
//            distancesBetween[h][1] = i.toDouble()
//            distancesBetween[h][2] = j.toDouble()
//            h += 1
//        }
//
//    }
//
//
//    return distancesBetween
//}
//
//
