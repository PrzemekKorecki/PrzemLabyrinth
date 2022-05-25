package com.example.przemlabyrinth

var _counter = 0
var poleWynik: Pole = Pole('S', x=1, y= 1, hasChildren = false)
var tablica2: Array<Array<Pole>> = Array(8){Array<Pole>(8){Pole('u', hasChildren = false)} }

fun mazeTest(tab: Array<Array<Pole>>, tab2: Array<Array<Pole>>){

    for (i in 0 until tab.size){
        for (j in 0 until tab[0].size){
            tab2[i][j] = tab[i][j]
            if (tab[i][j].sign == '*' ){ poleWynik = tab[i][j]}
        }
    }

    var polePoczatkowe: Pole

    LOOP@for (i in 1 until tab.size-1){
        for (j in 1 until tab[0].size-1){

            val present: Pole = tab[i][j]

            if (present.sign == '*'){
                polePoczatkowe = present
                polePoczatkowe.visited = true


                val west: Pole = tab[polePoczatkowe.x][polePoczatkowe.y-1]
                val east: Pole = tab[polePoczatkowe.x][polePoczatkowe.y+1]
                val north: Pole = tab[polePoczatkowe.x-1][polePoczatkowe.y]
                val south: Pole = tab[polePoczatkowe.x+1][polePoczatkowe.y]

                when {
                    west.sign == '0' && north.sign == '0' && east.sign == '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'

                        north.sign = '*'
                        //                                      west north east south
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign != '0' && north.sign == '0' && east.sign == '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        north.sign = '*'
//                                                              north east south
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign == '0' && north.sign != '0' && east.sign == '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        west.sign = '*'
//                                                              west east south
                        _counter++
                        west.licz = _counter
                        break@LOOP
                    }
                    west.sign == '0' && north.sign == '0' && east.sign != '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        north.sign = '*'
//                                                              west north south
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign == '0' && north.sign == '0' && east.sign == '0' && south.sign != '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        north.sign = '*'
//                                                              west north east
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign != '0' && north.sign != '0' && east.sign == '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        east.sign = '*'
//                                                              east south
                        _counter++
                        east.licz = _counter
                        break@LOOP
                    }
                    west.sign == '0' && north.sign != '0' && east.sign != '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.sign = 'n'
                        west.sign = '*'
//                                                              west south
                        _counter++
                        west.licz = _counter
                        break@LOOP
                    }
                    west.sign == '0' && north.sign != '0' && east.sign == '0' && south.sign != '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.sign = 'n'
                        west.sign = '*'
//                                                              west east
                        _counter++
                        west.licz = _counter
                        break@LOOP
                    }
                    west.sign == '0' && north.sign == '0' && east.sign != '0' && south.sign != '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        north.sign = '*'
//                                                              west north
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign != '0' && north.sign == '0' && east.sign != '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        north.sign = '*'
//                                                              north south
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign != '0' && north.sign == '0' && east.sign == '0' && south.sign != '0' -> {
                        polePoczatkowe.hasChildren = true
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        north.sign = '*'
//                                                              north east
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign == '0' && north.sign != '0' && east.sign != '0' && south.sign != '0' -> {
                        polePoczatkowe.hasChild++

                        polePoczatkowe.sign = 'n'
                        west.sign = '*'
//                                                              west
                        _counter++
                        west.licz = _counter
//                        poleWynik = west
                        break@LOOP
                    }
                    west.sign != '0' && north.sign == '0' && east.sign != '0' && south.sign != '0' -> {
                        polePoczatkowe.hasChild++

                        polePoczatkowe.sign = 'n'
                        north.sign = '*'
//                                                              north
                        _counter++
                        north.licz = _counter
                        break@LOOP
                    }
                    west.sign != '0' && north.sign != '0' && east.sign == '0' && south.sign != '0' -> {
                        polePoczatkowe.hasChild++

                        polePoczatkowe.sign = 'n'
                        east.sign = '*'
//                                                              east
                        _counter++
                        east.licz = _counter
                        break@LOOP
                    }
                    west.sign != '0' && north.sign != '0' && east.sign != '0' && south.sign == '0' -> {
                        polePoczatkowe.hasChild++
                        polePoczatkowe.sign = 'n'
                        south.sign = '*'
//                                                              south
                        _counter++
                        south.licz = _counter
                        break@LOOP
                    }
//                    west.sign != '0' && north.sign != '0' && east.sign != '0' && south.sign != '0' -> poleWynik = present
                }
            }
        }
    }
}