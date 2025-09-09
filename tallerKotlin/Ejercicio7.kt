fun main() {

    var n: Int
    var m: Int
    do {
        print("Ingresa el número de filas (N): ")
        n = readln().toInt()
        print("Ingresa el número de columnas (M): ")
        m = readln().toInt()
        if (n <= 0 || m <= 0) {
            println("Error: N y M deben ser números positivos. Intenta de nuevo.")
        }
    } while (n <= 0 || m <= 0)


    val matriz = Array(n) { IntArray(m) }
    println("Ingresa los elementos de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until m) {
            print("Elemento [$i][$j]: ")
            matriz[i][j] = readln().toInt()
        }
    }


    var filaAEliminar: Int
    do {
        print("\nIngresa la fila (x) a eliminar (de 0 a ${n - 1}): ")
        filaAEliminar = readln().toInt()
        if (filaAEliminar < 0 || filaAEliminar >= n) {
            println("Error: La fila a eliminar no es válida. Intenta de nuevo.")
        }
    } while (filaAEliminar < 0 || filaAEliminar >= n)

    val matrizSinFila = Array(n - 1) { IntArray(m) }
    var nuevaFila = 0
    for (i in 0 until n) {
        if (i != filaAEliminar) {
            matrizSinFila[nuevaFila] = matriz[i]
            nuevaFila++
        }
    }
    println("Matriz sin la fila $filaAEliminar:")
    imprimirMatriz(matrizSinFila)


    var columnaAEliminar: Int
    do {
        print("\nIngresa la columna (y) a eliminar (de 0 a ${m - 1}): ")
        columnaAEliminar = readln().toInt()
        if (columnaAEliminar < 0 || columnaAEliminar >= m) {
            println("Error: La columna a eliminar no es válida. Intenta de nuevo.")
        }
    } while (columnaAEliminar < 0 || columnaAEliminar >= m)

    val matrizSinColumna = Array(n) { IntArray(m - 1) }
    for (i in 0 until n) {
        var nuevaColumna = 0
        for (j in 0 until m) {
            if (j != columnaAEliminar) {
                matrizSinColumna[i][nuevaColumna] = matriz[i][j]
                nuevaColumna++
            }
        }
    }
    println("Matriz sin la columna $columnaAEliminar:")
    imprimirMatriz(matrizSinColumna)


    var filaAInsertar: Int
    do {
        print("\nIngresa la posición (x) para insertar una nueva fila (de 0 a $n): ")
        filaAInsertar = readln().toInt()
        if (filaAInsertar < 0 || filaAInsertar > n) {
            println("Error: La posición no es válida. Intenta de nuevo.")
        }
    } while (filaAInsertar < 0 || filaAInsertar > n)

    println("Ingresa los $m elementos de la nueva fila:")
    val nuevaFilaMatriz = IntArray(m) {
        print("Elemento de la nueva fila: ")
        readln().toInt()
    }

    val matrizConFila = Array(n + 1) { IntArray(m) }
    var filaOriginal = 0
    for (i in 0 until n + 1) {
        if (i == filaAInsertar) {
            matrizConFila[i] = nuevaFilaMatriz
        } else {
            matrizConFila[i] = matriz[filaOriginal]
            filaOriginal++
        }
    }
    println("Matriz con la nueva fila en la posición $filaAInsertar:")
    imprimirMatriz(matrizConFila)


    var columnaAInsertar: Int
    do {
        print("\nIngresa la posición (y) para insertar una nueva columna (de 0 a $m): ")
        columnaAInsertar = readln().toInt()
        if (columnaAInsertar < 0 || columnaAInsertar > m) {
            println("Error: La posición no es válida. Intenta de nuevo.")
        }
    } while (columnaAInsertar < 0 || columnaAInsertar > m)

    println("Ingresa los $n elementos de la nueva columna:")
    val nuevaColumnaMatriz = IntArray(n) {
        print("Elemento de la nueva columna: ")
        readln().toInt()
    }

    val matrizConColumna = Array(n) { IntArray(m + 1) }
    for (i in 0 until n) {
        var columnaOriginal = 0
        for (j in 0 until m + 1) {
            if (j == columnaAInsertar) {
                matrizConColumna[i][j] = nuevaColumnaMatriz[i]
            } else {
                matrizConColumna[i][j] = matriz[i][columnaOriginal]
                columnaOriginal++
            }
        }
    }
    println("Matriz con la nueva columna en la posición $columnaAInsertar:")
    imprimirMatriz(matrizConColumna)
}


fun imprimirMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        for (elemento in fila) {
            print("$elemento\t")
        }
        println()
    }
}