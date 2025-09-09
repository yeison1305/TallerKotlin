fun main() {

    print("Ingresa el número de filas (N): ")
    val n = readln().toInt()
    print("Ingresa el número de columnas (M): ")
    val m = readln().toInt()


    println("Ingresa los elementos de la Matriz A:")
    val matrizA = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            print("Elemento A[$i][$j]: ")
            matrizA[i][j] = readln().toInt()
        }
    }


    println("Ingresa los elementos de la Matriz B:")
    val matrizB = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            print("Elemento B[$i][$j]: ")
            matrizB[i][j] = readln().toInt()
        }
    }

    println("\n----------------------------------")


    println("Matriz resultante de la suma (A + B):")
    val matrizSuma = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j]
            print("${matrizSuma[i][j]}\t")
        }
        println()
    }

    println("\n----------------------------------")


    println("Matriz resultante de la multiplicación (A * B):")

    if (m == n) {
        val matrizMultiplicacion = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            for (j in 0 until n) {
                var sumaProducto = 0
                for (k in 0 until m) {
                    sumaProducto += matrizA[i][k] * matrizB[k][j]
                }
                matrizMultiplicacion[i][j] = sumaProducto
                print("${matrizMultiplicacion[i][j]}\t")
            }
            println()
        }
    } else {
        println("La multiplicación no es posible porque el número de columnas de la primera matriz ($m) no coincide con el número de filas de la segunda ($n).")
    }
}