fun main() {

    print("Ingresa el número de filas (A): ")
    val a = readln().toInt()


    print("Ingresa el número de columnas (B): ")
    val b = readln().toInt()


    val matrizX = Array(a) { IntArray(b) }


    println("Ingresa los elementos de la matriz X:")
    for (i in 0 until a) {
        for (j in 0 until b) {
            print("Elemento X[$i][$j]: ")
            matrizX[i][j] = readln().toInt()
        }
    }


    val matrizTranspuesta = Array(b) { IntArray(a) }


    for (i in 0 until a) {
        for (j in 0 until b) {
            matrizTranspuesta[j][i] = matrizX[i][j]
        }
    }

    println("\n----------------------------------")


    println("La matriz original es:")
    for (i in 0 until a) {
        for (j in 0 until b) {
            print("${matrizX[i][j]}\t")
        }
        println()
    }

    println("\n----------------------------------")


    println("La matriz transpuesta es:")
    for (i in 0 until b) {
        for (j in 0 until a) {
            print("${matrizTranspuesta[i][j]}\t")
        }
        println()
    }
}