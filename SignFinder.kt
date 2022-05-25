package com.example.przemlabyrinth

import android.widget.TextView

var startSign = 0
fun signFinder(_textView: TextView, sign: String){
    var counter = 0
    for (i in _textView.text.toString()){
        counter++
        if (i.toString() == sign){
            startSign = counter
        }
    }
}