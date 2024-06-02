

/*
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
*/

fun countNum(x: String, y:String): Int {
    var count = 0
    for (index in 1..100) {
        val divisibleBy3 = index % 3 == 0
        val divisibleBy5 = index % 5 == 0
        if (divisibleBy3 && divisibleBy5) {
            println("$x $y")
        } else if (divisibleBy3) {
            println("$x")
        } else if (divisibleBy5) {
            println("$y")
        } else {
            println(index)
            count++
        }

    }
    return count
}
fun main() {
    var num = countNum("My", "Function")
    println("Amount of times printed numbers is $num")
}


// Fizz buzz
for (i in 1..100) {
    println(
        when {
            i % 15 == 0 -> "fizzbuzz"
            i % 3 == 0 -> "fizz"
            i % 5 == 0 -> "buzz"
            else -> i.toString()
        }
    )
}
// Another Fizz buzz
println()
for (index in 1..100) {
    val divisibleBy3 = index % 3 == 0
    val divisibleBy5 = index % 5 == 0
    if (divisibleBy3 && divisibleBy5) {
        println("fizzbuzz")
    } else if (divisibleBy3) {
        println("buzz")
    } else if (divisibleBy5) {
        println("fizz")
    } else {
        println(index)
    }
}