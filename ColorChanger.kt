package com.example.przemlabyrinth

import android.widget.TextView
import androidx.core.text.HtmlCompat

fun setColor(_textView: TextView, _textView2: TextView){
    var ostatniZnak: String = _textView.text.toString()
    var _string:String = "*"
    var htmlOstatniZnak: String = ostatniZnak.replace("*","<font color='#ff0000'>$_string</font>", true)
    _textView.text = ostatniZnak
    _textView2.text = (HtmlCompat.fromHtml(htmlOstatniZnak, HtmlCompat.FROM_HTML_MODE_COMPACT))
}

