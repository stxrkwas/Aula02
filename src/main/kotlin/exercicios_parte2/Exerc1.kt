package exercicios_parte2

//Exercício 1: calcular a área do retângulo

// Fórmula: A = b x h; A é a área, b a base, e h a altura.

fun retangulo(b: Double, a: Double): Double {
    return b * a
}
fun main (args: Array<String>){

    print("Insira a base do retângulo: ")
    val base = readLine()!!.toDouble()

    println("Insira a altura do retângulo: ")
    val altura = readLine()!!.toDouble()

    val area = retangulo(base, altura)

    println("A área do retângulo é: $area")
}