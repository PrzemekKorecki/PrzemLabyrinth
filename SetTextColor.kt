package com.example.przemlabyrinth

import android.graphics.Typeface
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.core.graphics.toColorInt

fun setTextColor(_textView: TextView, startPosition:Int, endPosition: Int, color:Int){
    val spannableStr = SpannableString(_textView.text)

    val underlineSpan = UnderlineSpan()
    spannableStr.setSpan(
        underlineSpan,
        startPosition,
        startPosition,
        Spanned.SPAN_INCLUSIVE_EXCLUSIVE
    )

    val backgroundColorSpan = ForegroundColorSpan("#ff0000".toColorInt())
    spannableStr.setSpan(
        backgroundColorSpan,
        startPosition,
        endPosition,
        Spanned.SPAN_INCLUSIVE_EXCLUSIVE
    )

    val styleSpanItalic = StyleSpan(Typeface.BOLD)
    spannableStr.setSpan(
        styleSpanItalic,
        startPosition,
        endPosition,
        Spanned.SPAN_INCLUSIVE_EXCLUSIVE
    )

    _textView.text = spannableStr
}
