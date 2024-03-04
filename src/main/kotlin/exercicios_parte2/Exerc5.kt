package exercicios_parte2

//Exercício 5: calcular a área do trapézio;

/*Fórmula: A = (a + b) h / 2

    - a ou B: base maior
    - b: base menor
    - h = altura

*/

fun trapezio(a: Double, b: Double, h: Double): Double{
    val area = ((a + b) * h)/2
    return area
}

fun main(args: Array<String>){

    println("Insira o valor da base maior do trapézio: ")
    val bmaior = readLine()!!.toDouble()

    println("Insira o valor da base menor do trapézio: ")
    val bmenor = readLine()!!.toDouble()

    println("Insira o valor da altura do trapézio: ")
    val altura = readLine()!!.toDouble()

    val Area = trapezio(bmaior, bmenor, altura)
    println("A área do trapézio é igual a: $Area")

}