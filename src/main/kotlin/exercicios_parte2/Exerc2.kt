package exercicios_parte2

import kotlin.math.sqrt

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

/* Fórmula de Heron: A = √p(p-a)(p-b)(p-c)

   - a, b, c: comprimento dos lados
   - p = (a + b + c) / 2 é o semiperimetro do triângulo
   - Semi Perimetro: soma dos lados dividida por 2

*/
fun escaleno(la: Double, lb: Double, lc: Double): Double{
    val sP = (la + lb + lc) / 2.0
    val area = Math.sqrt(sP * (sP - la) * (sP - lb) * (sP - lc))
    return area
}

fun main(){

    print(message = "De qual triângulo deseja calcular a área: \n 1 - Triângulo Isósceles \n 2 - Triangulo Equilátero \n 3 - Triângulo Retângulo \n 4 - Triângulo Escaleno \n")

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

    //Opção 4 - Triângulo Escaleno (correta)
    else if(opcao == 4){

        print("Insira o valor do lado A do triângulo: ")
        val a = readLine()!!.toDouble()

        println("Insira o valor do lado B do triângulo: ")
        val b = readLine()!!.toDouble()

        println("Insira o valor do lado C do triângulo: ")
        val c = readLine()!!.toDouble()

        val area = escaleno(a, b, c)

        println("A área do triângulo escaleno é: $area")

    }

    else {
        println("Opcão inválida!")
    }
}
