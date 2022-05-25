package com.example.przemlabyrinth

import android.provider.Settings.Secure.getString
import android.text.Html
import android.widget.TextView
import androidx.core.graphics.toColorInt
import java.lang.Exception
import kotlin.math.sign

fun wypiszTab(tab: Array<Array<Pole>>, _textView: TextView) {
    for (i in 0 until tab.size) {
        for (j in 0 until tab[0].size){
            _textView.append(tab[i][j].toString()+" \n")
        }
        _textView.append("\n")
    }
}

fun wypiszTabZnak(tab: Array<Array<Pole>>, _textView: TextView) {
    _textView.append("\n")
    for (i in 0 until tab.size) {
        for (j in 0 until tab[0].size){
            _textView.append(tab[i][j].sign.toString()+"    ")
        }
        _textView.append("\n")
    }
}

fun wypiszTabLicz(tab: Array<Array<Pole>>, _textView: TextView){
    _textView.append("\n")
    try {
        for (i in 0 until tab.size){
            for (j in 0 until tab[0].size){
                _textView.append(tab[i][j].licz.toString()+"    ")
            }
            _textView.append("\n")
        }
    }catch (e: Exception){
        _textView.text = e.toString()+"\n"
    }
}

fun wypiszTabHasChildren(tab: Array<Array<Pole>>, _textView: TextView){
    _textView.append("\n")
    try {
        for (i in 0 until tab.size){
            for (j in 0 until tab[0].size){
                _textView.append(tab[i][j].hasChildren.toString()+"    ")
            }
            _textView.append("\n")
        }
    }catch (e: Exception){
        _textView.text = e.toString()+"\n"
    }
}

fun wypiszTabHasChild(tab: Array<Array<Pole>>, _textView: TextView){
    _textView.append("\n")
    try {
        for (i in 0 until tab.size){
            for (j in 0 until tab[0].size){
                _textView.append(tab[i][j].hasChild.toString()+"    ")
            }
            _textView.append("\n")
        }
    }catch (e: Exception){
        _textView.text = e.toString()+"\n"
    }
}