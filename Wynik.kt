package com.example.przemlabyrinth

import android.widget.TextView

fun wynik(tab: Array<Array<Pole>>, poleWynik: Pole, _textView: TextView){
    if (poleWynik.x == 0 || poleWynik.y == 0 || poleWynik.x == 7 || poleWynik.y == 7 ){
        _textView.text = "KONIEC - "
        _textView.append("potrzebujesz ${poleWynik.licz} kroków do wyjścia z labiryntu")
    } else if(poleWynik.hasChild < 1){
//        poleWynik.sign = 'n'
        for (i in 0 until tab.size){
            for (j in 0 until tab[0].size){
                if (tab[i][j].hasChildren == true ){
                    tab[i][j].sign = '*'

                    poleWynik.sign = 'Z'
                }
            }
        }
    }
}