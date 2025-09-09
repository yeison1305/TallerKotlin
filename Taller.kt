package com.ucaldas.tallerkotlin


import android.util.Log

object TallerMatrices {
    private const val TAG = "TallerMatrices"

    // 11. Horas trabajadas y sueldos
    fun ejercicio11() {
        val empleados = listOf(
                        Triple(1, 40, 5),
            Triple(2, 35, 10)
        )
        Log.d(TAG, "Ejercicio 11 - Informe de empleados:")
        for (emp in empleados) {
            val cod = emp.first
            val normal = emp.second
            val sobre = emp.third
            val sueldoNormal = normal * 2350
            val sueldoSobre = sobre * 3500
            val total = sueldoNormal + sueldoSobre
            Log.d(TAG, "Código: $cod")
            Log.d(TAG, "  Horas normales: $normal, Sueldo normales: $$sueldoNormal")
            Log.d(TAG, "  Horas sobretiempo: $sobre, Sueldo sobretiempo: $$sueldoSobre")
            Log.d(TAG, "  Total sueldo: $$total")
            Log.d(TAG, "")
        }
    }

    // 12. Matriz con valores impares (ejemplo N=5)
    fun ejercicio12() {
        val n = 5
        val matriz = Array(n) { IntArray(n) { 4 } } // Fondo con 4
        for (j in 1 until n - 1) {
            matriz[0][j] = 1
            matriz[n - 2][j] = 1
        }
        Log.d(TAG, "Ejercicio 12 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 13. Matriz con bordes de 1 y interior 0 (ejemplo N=5)
    fun ejercicio13() {
        val n = 5
        val matriz = Array(n) { IntArray(n) { 0 } }
        for (i in 0 until n) {
            matriz[0][i] = 1
            matriz[n - 1][i] = 1
            matriz[i][0] = 1
            matriz[i][n - 1] = 1
        }
        Log.d(TAG, "Ejercicio 13 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 14. Matriz espiral (ejemplo N=5)
    fun ejercicio14() {
        val n = 5
        val matriz = Array(n) { IntArray(n) }
        var num = 1
        var left = 0
        var right = n
        var top = 0
        var bottom = n
        while (left < right && top < bottom) {
            for (col in left until right) matriz[top][col] = num++
            top++
            for (row in top until bottom) matriz[row][right - 1] = num++
            right--
            if (top < bottom) for (col in right - 1 downTo left) matriz[bottom - 1][col] = num++
            bottom--
            if (left < right) for (row in bottom - 1 downTo top) matriz[row][left] = num++
            left++
        }
        Log.d(TAG, "Ejercicio 14 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 15. Matriz espiral inversa (ejemplo N=5)
    fun ejercicio15() {
        val n = 5
        val matriz = Array(n) { IntArray(n) }
        var num = n * n
        var left = 0
        var right = n
        var top = 0
        var bottom = n
        while (left < right && top < bottom) {
            for (col in left until right) matriz[top][col] = num--
            top++
            for (row in top until bottom) matriz[row][right - 1] = num--
            right--
            if (top < bottom) for (col in right - 1 downTo left) matriz[bottom - 1][col] = num--
            bottom--
            if (left < right) for (row in bottom - 1 downTo top) matriz[row][left] = num--
            left++
        }
        Log.d(TAG, "Ejercicio 15 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 16. Matriz con patrón específico (ejemplo N=5)
    fun ejercicio16() {
        val n = 5
        val matriz = arrayOf(
            intArrayOf(1, 6, 10, 13, 15),
            intArrayOf(0, 2, 7, 11, 14),
            intArrayOf(0, 0, 3, 8, 12),
            intArrayOf(0, 0, 0, 4, 9),
            intArrayOf(0, 0, 0, 0, 5)
        )
        Log.d(TAG, "Ejercicio 16 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 17. Matriz con diagonal de 1's (ejemplo N=5)
    fun ejercicio17() {
        val n = 5
        val matriz = Array(n) { IntArray(n) { 0 } }
        for (i in 0 until n) {
            matriz[i][i] = 1
        }
        Log.d(TAG, "Ejercicio 17 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 18. Matriz con patrón específico (ejemplo N=5)
    fun ejercicio18() {
        val n = 5
        val matriz = arrayOf(
            intArrayOf(5, 0, 0, 0, 0),
            intArrayOf(6, 4, 0, 0, 0),
            intArrayOf(7, 3, 0, 0, 12),
            intArrayOf(8, 2, 0, 11, 13),
            intArrayOf(9, 1, 10, 14, 15)
        )
        Log.d(TAG, "Ejercicio 18 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 19. Matriz espiral inversa (ejemplo N=5)
    fun ejercicio19() {
        val n = 5
        val matriz = Array(n) { IntArray(n) }
        var num = 25 // Comienza desde 25 y decrece hasta 1
        var left = 0
        var right = n
        var top = 0
        var bottom = n

        while (left < right && top < bottom) {
            // Fila superior (de derecha a izquierda)
            for (col in right - 1 downTo left) {
                if (top < n && col < n) matriz[top][col] = num--
            }
            top++
            // Columna derecha (de abajo hacia arriba)
            for (row in bottom - 1 downTo top) {
                if (right - 1 < n && row < n) matriz[row][right - 1] = num--
            }
            right--
            // Fila inferior (de izquierda a derecha, si queda)
            if (top < bottom) {
                for (col in left until right) {
                    if (bottom - 1 < n && col < n) matriz[bottom - 1][col] = num--
                }
                bottom--
            }
            // Columna izquierda (de arriba hacia abajo, si queda)
            if (left < right) {
                for (row in top until bottom) {
                    if (left < n && row < n) matriz[row][left] = num--
                }
                left++
            }
        }

        Log.d(TAG, "Ejercicio 19 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // 20. Matriz espiral estándar (ejemplo N=5)
    fun ejercicio20() {
        val n = 5
        val matriz = Array(n) { IntArray(n) }
        var num = 1 // Comienza desde 1 y aumenta hasta 25
        var left = 0
        var right = n
        var top = 0
        var bottom = n

        while (left < right && top < bottom) {
            // Fila superior (de izquierda a derecha)
            for (col in left until right) {
                if (top < n && col < n) matriz[top][col] = num++
            }
            top++
            // Columna derecha (de arriba hacia abajo)
            for (row in top until bottom) {
                if (right - 1 < n && row < n) matriz[row][right - 1] = num++
            }
            right--
            // Fila inferior (de derecha a izquierda, si queda)
            if (top < bottom) {
                for (col in right - 1 downTo left) {
                    if (bottom - 1 < n && col < n) matriz[bottom - 1][col] = num++
                }
                bottom--
            }
            // Columna izquierda (de abajo hacia arriba, si queda)
            if (left < right) {
                for (row in bottom - 1 downTo top) {
                    if (left < n && row < n) matriz[row][left] = num++
                }
                left++
            }
        }

        Log.d(TAG, "Ejercicio 20 - Matriz para N=$n:")
        for (fila in matriz) {
            Log.d(TAG, fila.joinToString(" "))
        }
    }

    // Función para ejecutar todos los ejercicios
    fun ejecutarTodos() {
        ejercicio11()
        ejercicio12()
        ejercicio13()
        ejercicio14()
        ejercicio15()
        ejercicio16()
        ejercicio17()
        ejercicio18()
        ejercicio19()
        ejercicio20()
    }
}