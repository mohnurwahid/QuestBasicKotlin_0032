package com.example.kotlin


fun ContohList() {
    println("=== List ===")

    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
println(shape)

shape.add("Circle")
println(shape)

shape.remove("Triangle")
println(shape)

shape[0] = "Oval"
println(shape
)

val shapesLocked: List<String> = shape
println(shapesLocked)

}


fun ContohSet() {
    println()
    println("=== Set ===")

    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Rectangle")
    println(shape)

    shape.remove("Circle")
    println(shape)

    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}
