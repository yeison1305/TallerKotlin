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


    val matriz = Array(n) { DoubleArray(m) }
    var sumaTotal = 0.0

    println("Ingresa los elementos de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until m) {
            print("Elemento [$i][$j]: ")
            val elemento = readln().toDouble()
            matriz[i][j] = elemento
            sumaTotal += elemento
        }
    }

    println("\n----------------------------------")

    // a) Señalar si la matriz es cuadrada
    if (n == m) {
        println("La matriz es cuadrada.")
    } else {
        println("La matriz no es cuadrada.")
    }

    // b) Determinar y mostrar el promedio de los N x M números
    val totalElementos = n * m
    val promedioGeneral = if (totalElementos > 0) sumaTotal / totalElementos else 0.0
    println("El promedio de todos los números es: %.2f".format(promedioGeneral))

    println("\n----------------------------------")

    // c) Determinar y mostrar el promedio por fila
    println("Promedio por fila:")
    for (i in 0 until n) {
        var sumaFila = 0.0
        for (j in 0 until m) {
            sumaFila += matriz[i][j]
        }
        val promedioFila = if (m > 0) sumaFila / m else 0.0
        println("Fila $i: %.2f".format(promedioFila))
    }

    println("\n----------------------------------")

    // d) Determinar y mostrar el promedio por columna
    println("Promedio por columna:")
    for (j in 0 until m) {
        var sumaColumna = 0.0
        for (i in 0 until n) {
            sumaColumna += matriz[i][j]
        }
        val promedioColumna = if (n > 0) sumaColumna / n else 0.0
        println("Columna $j: %.2f".format(promedioColumna))
    }
}