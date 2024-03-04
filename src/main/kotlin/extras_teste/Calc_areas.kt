package extras_teste

//Teste: todos os códigos em um só, baseado no exercício 2;

//Opção 1 - Retângulo
fun retangulo(b: Double, a: Double): Double {
    return b * a
}

// Opção 2.1 - Triângulo Isósceles
fun isosceles(b: Double, a: Double): Double{
    return (b * a)/2
}

//Opção 2.2 - Triângulo Equilátero
fun equilatero(ladoTri: Double): Double{

    val area = (ladoTri * ladoTri * Math.sqrt(3.0) / 4.0)
    return area

}

//Opção 2.3 - Triângulo Retângulo
fun triretangulo(cateto1: Double, cateto2: Double): Double{
    val area = (cateto1 * cateto2)/2
    return area
}

//Opção 3 - Círculo
fun circunferencia(raio: Double): Double{
    val circ = Math.PI * (raio * raio)
    return circ
}

//Opção 4 - Losango
fun losango(dmaior: Double, dmenor: Double): Double{
    val area = (dmaior * dmenor)/2
    return area
}

//Opção 5 - Trapézio
fun trapezio(a: Double, b: Double, h: Double): Double{
    val area = ((a + b) * h)/2
    return area
}
fun main() {

    print("Qual área deseja calcular: \n 1 - Retângulo \n 2 - Triângulo  \n 3 - Circulo \n 4 - Losango \n 5 - Trapézio \n")

    val opcao = readLine()!!.toInt()

    //Opção 1 - Retângulo
    if (opcao == 1) {

        print("Insira a base do retângulo: ")
        val base = readLine()!!.toDouble()

        println("Insira a altura do retângulo: ")
        val altura = readLine()!!.toDouble()

        val area = exercicios_parte2.retangulo(base, altura)

        println("A área do retângulo é: $area")

    }

    //Opção 2 - Triângulo
    else if (opcao == 2) {

        println("De qual triângulo deseja calcular a área: \n 2.1 - Triângulo Isósceles \n 2.2- Triangulo Equilátero \n 2.3 - Triângulo Retângulo \n")
        val subopcao = readLine()!!.toDouble()

        //2.1 - Triângulo Isósceles
        if (subopcao == 2.1){

            print("Insira a base do triângulo: ")
            val base = readLine()!!.toDouble()

            println("Insira a altura do triângulo: ")
            val altura = readLine()!!.toDouble()

            val area = exercicios_parte2.isosceles(base, altura)

            println("A área do triângulo isósceles é: $area")
        }

        //2.2- Triangulo Equilátero
        else if (subopcao == 2.2){

            print("Insira o tamanho do lado triângulo: ")
            val lado = readLine()!!.toDouble()

            val area = exercicios_parte2.equilatero(lado)

            println("A área do triângulo equilátero é: $area")

        }

        //2.3 - Triângulo Retângulo
        else if(subopcao == 2.3){

            print("Insira o valor do 1º cateto do triângulo: ")
            val cat1 = readLine()!!.toDouble()

            print("Insira o valor do 2º cateto do triângulo: ")
            val cat2 = readLine()!!.toDouble()

            val area = exercicios_parte2.triretangulo(cat1, cat2)

            println("A área do triângulo retângulo é: $area")

        }

        else{
            println("Opção inválida!")
        }

    }

    //Opção 3 - Círculo
    else if (opcao == 3) {

        print("Informe o valor do raio do círculo:")
        val r = readLine()!!.toDouble()

        val area = exercicios_parte2.circunferencia(r)
        println("A área da circunferência é: $area")

    }

    //Opção 4 - Losango
    else if (opcao == 4) {

        println("Insira o valor da diagonal maior: ")
        val demaior = readLine()!!.toDouble()

        println("Insira o valor da diagonal menor: ")
        val demenor = readLine()!!.toDouble()

        val area = exercicios_parte2.losango(demaior, demenor)
        println("A área do losango é: $area")

    }

    //Opção 5 - Trapézio
    else if (opcao == 5) {

        println("Insira o valor da base maior do trapézio: ")
        val bmaior = readLine()!!.toDouble()

        println("Insira o valor da base menor do trapézio: ")
        val bmenor = readLine()!!.toDouble()

        println("Insira o valor da altura do trapézio: ")
        val altura = readLine()!!.toDouble()

        val Area = exercicios_parte2.trapezio(bmaior, bmenor, altura)
        println("A área do trapézio é igual a: $Area")

    }

    else {
        println("Opcão inválida!")
    }
}