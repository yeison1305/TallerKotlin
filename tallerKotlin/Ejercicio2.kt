fun main() {

    print("Ingresa el orden de la matriz cuadrada (P): ")
    val p = readln().toInt()


    val matrizC = Array(p) { IntArray(p) }


    println("Ingresa los elementos de la matriz C:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            print("Elemento C[$i][$j]: ")
            matrizC[i][j] = readln().toInt()
        }
    }

    println("\n----------------------------------")


    println("Elementos de la diagonal principal:")
    for (i in 0 until p) {
        print("${matrizC[i][i]}\t")
    }

    println("\n\n----------------------------------")


    println("Elementos de la diagonal secundaria:")
    for (i in 0 until p) {
        print("${matrizC[i][p - 1 - i]}\t")
    }

    println("\n\n----------------------------------")


    println("Elementos de la matriz triangular superior:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            if (i <= j) {
                print("${matrizC[i][j]}\t")
            } else {
                print(" \t")
            }
        }
        println()
    }

    println("\n----------------------------------")


    println("Elementos de la matriz triangular inferior:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            if (i >= j) {
                print("${matrizC[i][j]}\t")
            } else {
                print(" \t")
            }
        }
        println()
    }
}