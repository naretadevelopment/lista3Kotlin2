import kotlin.Array

fun main() {


    val matrix1 = createRandomMatrix(2, 3)
    print("1st ")
    displayMatrix(matrix1)


    val matrix2 = createRandomMatrix(3, 2)
    print("2nd ")
    displayMatrix(matrix2)


    var matrix3 = multiplyMatrices(matrix1, matrix2)
    print("multiplied ")
    displayMatrix(matrix3)
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

private fun createZeroesMatrix(rows: Int, columns: Int): Array<Array<Int>> {

    var matrix = arrayOf<Array<Int>>()


    for (i in 0 until rows) {
        var array = arrayOf<Int>() //dodaje rzad
        for (j in 0 until columns) {
            array += 0
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


fun multiplyMatrices(matrix1: Array<Array<Int>>, matrix2: Array<Array<Int>>): Array<Array<Int>> {

    var rows1 = matrix1.size
    var columns1 = matrix1[0].size

    var rows2 = matrix2.size
    var columns2 = matrix2[0].size

    var multipliedMatrix: Array<Array<Int>>

    if (columns1 == rows2) {
        var rows3 = rows1
        var columns3 = columns2

        multipliedMatrix = createZeroesMatrix(rows3, columns3)


        for (i in multipliedMatrix.indices) {  // Returns the range of valid indices for the array
            for (j in multipliedMatrix[i].indices) {
                for (k in matrix2.indices)
                    multipliedMatrix[i][j] = multipliedMatrix[i][j] + (matrix1[i][k] * matrix2[k][j])
            }
        }


    } else {
        println("wrong matrices")
        multipliedMatrix = createZeroesMatrix(0, 0)
    }


    return multipliedMatrix


}







//
//fun main() {
//    val code=scanCode()
//    //println("Tekst po deszyfracji to: ${code(Code)}")
//    val codedCode=code(code)
//    for (i in 0 until codedCode.size){
//        print(codedCode[i])
//    }
//
//
//}
//
//// 1 wprowadzenie tekstu do deszyfracji
//fun scanCode (): String{
//    println("Wpisz szyfr...")
//    val code = readLine().toString().toUpperCase()
//    println("Wczytany szyfr to:        $code")
//
//    return code
//}
//
//// 2 metoda
//fun code(code: String): CharArray {
//
//    var correctText = CharArray(code.length)
//
//    val alphabetA: Array<Char> = arrayOf('A','Ą','B','C','Ć','D','E','Ę','F','G','H','I','J','K','L','Ł','M','N','Ń','O','Ó','P','R','S','Ś','T','U','W','Y','Z','Ź','Ż')
//    val alphabetB: Array<Char> = arrayOf('C','Ć','D','E','Ę','F','G','H','I','J','K','L','Ł','M','N','Ń','O','Ó','P','R','S','Ś','T','U','W','Y','Z','Ź','Ż','A','Ą','B')
//
//    val letterInCode=code.toCharArray()
//
//    for(letter in letterInCode) {
//        for (i in alphabetA.indices) {
//
//            if (letter == alphabetA[i]) {
//                correctText += alphabetB[i]
//
//            }
//        }
//    }
//
//    return correctText
//}