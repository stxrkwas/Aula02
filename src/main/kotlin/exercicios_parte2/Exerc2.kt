package exercicios_parte2

//Exercício 2: cálculo da áreaa dos triângulos: equilátero, retângulo e isósceles

//Fórmula: (b * a)/2
fun isosceles(b: Double, a: Double): Double{
    return (b * a)/2
}

// Fórmula: (lado² * √3)/ 4
fun equilatero(ladoTri: Double): Double{

    val area = ((ladoTri * ladoTri) * Math.sqrt(3.0)) / 4.0
    return area

}

//Fórmula: (cateto1 * cateto2)/2
fun triretangulo(cateto1: Double, cateto2: Double): Double{
    val area = (cateto1 * cateto2)/2
    return area
}

fun main(){

    print("De qual triângulo deseja calcular a área: \n 1 - Triângulo Isósceles \n 2 - Triangulo Equilátero \n 3 - Triângulo Retângulo \n")

    val opcao = readLine()!!.toInt()

    if (opcao == 1){

        print("Insira a base do triângulo: ")
        val base = readLine()!!.toDouble()

        println("Insira a altura do triângulo: ")
        val altura = readLine()!!.toDouble()

        val area = isosceles(base, altura)

        println("A área do triângulo isósceles é: $area")
    }

    else if (opcao == 2){

        print("Insira o tamanho do lado triângulo: ")
        val lado = readLine()!!.toDouble()

        val area = equilatero(lado)

        println("A área do triângulo equilátero é: $area")

    }

    else if(opcao == 3){

        print("Insira o valor do 1º cateto do triângulo: ")
        val cat1 = readLine()!!.toDouble()

        print("Insira o valor do 2º cateto do triângulo: ")
        val cat2 = readLine()!!.toDouble()

        val area = triretangulo(cat1, cat2)

        println("A área do triângulo retângulo é: $area")
    }

    else {
        println("Opcão inválida!")
    }
}
