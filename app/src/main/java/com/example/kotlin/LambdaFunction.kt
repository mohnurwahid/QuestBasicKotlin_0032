package com.example.kotlin


fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main(){
    uppercaseString("Hello")
    println({ string: String -> string.uppercase()}("hello"))
}