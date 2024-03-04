package exercicios_parte2

//Exercício 3: cálculo nda área da circunferência

/*Fórmula: area = π * raio²

  - Utlizar a constante Math.PI
*/

fun circunferencia(raio: Double): Double{
    val circ = Math.PI * (raio * raio)
    return circ
}

fun main(args: Array<String>){

    print("Informe o valor do raio do círculo:")
    val r = readLine()!!.toDouble()

    val area = circunferencia(r)
    println("A área da circunferência é: $area")

}