package exercicios_parte2

//Exercício 4: calcular a área do losango

/*Fórmula: Area = (D (diagonal maior) x d (diagonal menor)) / 2

  - Diagonais de um losango: segmentos de reta que unem dois vértices não consecutuivos.
  - Vértices: pontos de encontro dos lados de cada forma geométrica, ou seja, são os ângulos.

*/

fun losango(dmaior: Double, dmenor: Double): Double{
    val area = (dmaior * dmenor)/2
    return area
}

fun main(args: Array<String>){

    println("Insira o valor da diagonal maior: ")
    val demaior = readLine()!!.toDouble()

    println("Insira o valor da diagonal menor: ")
    val demenor = readLine()!!.toDouble()

    val area = losango(demaior, demenor)
    println("A área do losango é: $area")

}