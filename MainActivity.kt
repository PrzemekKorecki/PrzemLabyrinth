package com.example.przemlabyrinth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.FileInputStream
import java.lang.Exception

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val file = File(applicationContext.getExternalFilesDir(null), "labyrinth.txt")
         file.writeText("xxxxxxxx")
        file.appendText("x*000xxx")
        file.appendText("xxxx0xxx")
        file.appendText("xxxx000x")
        file.appendText("xxx00xxx")
        file.appendText("xxx0xxxx")
        file.appendText("xxx00xxx")
        file.appendText("xxxx0xxx")


        val file2 = File(applicationContext.getExternalFilesDir(null), "labyrinth2.txt")

        val readResult = FileInputStream(file).bufferedReader().use { it.readText() }
        var editText = findViewById<EditText>(R.id.editText)


        var tablica: Array<Array<Pole>> = Array(8){Array<Pole>(8){Pole('n', hasChildren = false)} }

        fun wypelnijTablice(tab: Array<Array<Pole>>){
            var licznik = 0
            for( i in 0 until tab.size){
                for(j in 0 until tab[0].size){
                    tab[i][j].sign = readResult[licznik]
                    tab[i][j].x = i
                    tab[i][j].y = j
                    licznik++
                }
            }
        }

        fun wypiszKoordynaty(tab: Array<Array<Pole>>, _textView: TextView){
            try {
                for (i in 0 until tab.size){
                    for (j in 0 until tab[0].size){
                        if (tab[i][j].sign == editText.text.first()){
                            _textView.append("coordinates of * (x = $i, y = $j)  ")
                        }
                    }
                    _textView.append("\n")
                }
            }catch (e: Exception){
                _textView.text = e.toString()
                _textView.append("\n")
            }
        }

        button.setOnClickListener(){
            wypelnijTablice(tablica)
        }

        button2.setOnClickListener(){
            mazeTest(tablica, tablica2)
        }

        button3.setOnClickListener(){
            wypiszKoordynaty(tablica, textView)
            textView.append("\n Wynik (x = ${poleWynik.x}, y = ${poleWynik.y})")
        }

        button4.setOnClickListener(){
            textView.text = ""
            wynik(tablica, poleWynik, textView)
            wypiszTabZnak(tablica, textView)
//            wypiszTabHasChildren(tablica, textView)
//            wypiszTabHasChild(tablica, textView)
//            wypiszTabZnak(tablica2, textView)
//            wypiszTabLicz(tablica2, textView)
//            wypiszKoordynaty(tablica, textView)
//            textView.append("Wynik (x = ${poleWynik.x}, y = ${poleWynik.y})")
        }

        button5.setOnClickListener(){
            signFinder(textView, "*")
//            textView.append(startSign.toString())
            setTextColor(textView, startSign-1, startSign, "#ff0000".toColorInt())
//            setColor(textView, textView2)
        }
    }
}