fun main() {

    var n: Int
    do {
        print("Ingresa el orden de la matriz cuadrada (N): ")
        n = readln().toInt()
        if (n <= 0) {
            println("Error: N debe ser un número positivo. Intenta de nuevo.")
        }
    } while (n <= 0)


    val matriz = Array(n) { IntArray(n) }
    println("Ingresa los elementos de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readln().toInt()
        }
    }

    println("\n----------------------------------")


    println("Matriz original:")
    imprimirMatriz(matriz)


    for (i in 0 until n) {
        for (j in 0 until n) {
            if (matriz[i][j] < 0) {
                matriz[i][j] = 0
            } else if (matriz[i][j] > 0) {
                matriz[i][j] = 9
            }
        }
    }

    println("\n----------------------------------")


    println("Matriz con los cambios (negativos a 0, positivos a 9):")
    imprimirMatriz(matriz)
}


fun imprimirMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        for (elemento in fila) {
            print("$elemento\t")
        }
        println()
    }
}