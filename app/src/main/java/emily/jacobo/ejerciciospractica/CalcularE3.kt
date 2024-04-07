package emily.jacobo.ejerciciospractica

class CalcularE3 {
    fun calcular(numero: Int): String {
        return if (numero % 2 == 0) {
            "El número es par"
        } else {
            "El número es impar"
        }
    }
}