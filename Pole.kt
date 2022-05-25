package com.example.przemlabyrinth

data class Pole(
    var sign: Char,
    var x: Int = 0,
    var y: Int = 0,
    var visited: Boolean = false,
    var hasChildren: Boolean,
    var hasChild: Int = 0,
    var licz: Int =0
){}

