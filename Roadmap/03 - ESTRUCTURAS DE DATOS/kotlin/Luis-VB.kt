/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar, y a continuación
 *   los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no númericos y con más de 11 dígitos.
 *   (o el número de dígitos que quieras)
 * - También se debe proponer una operación de finalización del programa.
 */

// List
fun myDataStructures () {
    var myList = listOf<>("Ahoj","Ja jsem","Dobre","Itiak")
    println(myList)
    println("Number of elements: ${myList.size}")
    println("Third word is ${myList.get(2)}")
    println("Index of element \"Ja jsem\" ${myList.indexOf("Ja jsem")}")

    var myEditList = mutableListOf<>(1,2,3,4)
    println(myEditList)
    println(myEditList.add(5))
    println(myEditList.removeAt(2))
    println(myEditList[0])
    println(myEditList.shuffle())

    var mySet = setOf<>(1,2,3,4,5)
    print(mySet)

    var myEditSet = mutableSetOf<>()
}

fun main () {

    myDataStructures()
}