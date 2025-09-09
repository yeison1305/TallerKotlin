fun main() {

    print("Ingresa el número de filas (M): ")
    val m = readln().toInt()
    print("Ingresa el número de columnas (N): ")
    val n = readln().toInt()


    val matrizA = Array(m) { IntArray(n) }


    println("Ingresa los elementos de la matriz A:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("Elemento A[$i][$j]: ")
            matrizA[i][j] = readln().toInt()
        }
    }


    print("Ingresa el número K para multiplicar: ")
    val k = readln().toInt()


    val matrizResultante = Array(m) { IntArray(n) }


    for (i in 0 until m) {
        for (j in 0 until n) {
            matrizResultante[i][j] = matrizA[i][j] * k
        }
    }


    println("----------------------------------")
    println("La matriz resultante es:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matrizResultante[i][j]}\t")
        }
        println() // Salto de línea para la siguiente fila
    }
}