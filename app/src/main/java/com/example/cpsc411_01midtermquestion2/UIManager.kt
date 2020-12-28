// Question 2 - CPSC 411-01 Midterm
// Ernesto Hooghkirk
// CWID: 887409282

package com.example.cpsc411_01midtermquestion2

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.Log
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class UIManager (val ctx : Context) {
    fun createFullScreen() : View {
        val lLayoutObj = LinearLayout(ctx)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        lLayoutObj.setBackgroundColor(Color.GRAY)
        lLayoutObj.layoutParams = lp
        lLayoutObj.orientation = LinearLayout.VERTICAL

        var lObj = createSingleSidedTextView(Color.YELLOW)
        var llp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        llp.weight = 1.0F
        lObj.layoutParams = llp
        lLayoutObj.addView(lObj)

        lObj = createSideBySideTextView(Color.GREEN)
        llp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        llp.weight = 1.0F
        lObj.layoutParams = llp
        lLayoutObj.addView(lObj)

        lObj = createThreeSidedTextView(Color.YELLOW)
        llp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        llp.weight = 1.0F
        lObj.layoutParams = llp
        lLayoutObj.addView(lObj)

        lObj = createFourSidedTextView(Color.GREEN)
        llp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        llp.weight = 1.0F
        lObj.layoutParams = llp
        lLayoutObj.addView(lObj)

        return lLayoutObj
    }

    fun createSingleSidedTextView(col1 : Int) : View {
        val lLayoutObj = LinearLayout(ctx)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lLayoutObj.setBackgroundColor(Color.WHITE)
        lLayoutObj.layoutParams = lp
        lLayoutObj.orientation = LinearLayout.HORIZONTAL

        var tv = createTextView("1", col1)
        var vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F

        // I used 2.5 instead of 5 for the margin widths in order to make the distance between margins add up to 5, this is how I interpreted the question
        val npx :Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
            2.5F, ctx.getResources().getDisplayMetrics()).toInt()
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        return lLayoutObj
    }

    fun createSideBySideTextView(col : Int) : View {
        val lLayoutObj = LinearLayout(ctx)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lLayoutObj.setBackgroundColor(Color.WHITE)
        lLayoutObj.layoutParams = lp
        lLayoutObj.orientation = LinearLayout.HORIZONTAL

        var tv = createTextView("2", col)
        var vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F

        // I used 2.5 instead of 5 for the margin widths in order to make the distance between margins add up to 5, this is how I interpreted the question
        val npx :Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
            2.5F, ctx.getResources().getDisplayMetrics()).toInt()
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        tv = createTextView("2", col)
        vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        return lLayoutObj
    }

    fun createThreeSidedTextView(col : Int) : View {
        val lLayoutObj = LinearLayout(ctx)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lLayoutObj.setBackgroundColor(Color.WHITE)
        lLayoutObj.layoutParams = lp
        lLayoutObj.orientation = LinearLayout.HORIZONTAL

        var tv = createTextView("3", col)
        var vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        // I used 2.5 instead of 5 for the margin widths in order to make the distance between margins add up to 5, this is how I interpreted the question
        val npx :Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
            2.5F, ctx.getResources().getDisplayMetrics()).toInt()
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        tv = createTextView("3", col)
        vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        tv = createTextView("3", col)
        vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)
        return lLayoutObj
    }

    fun createFourSidedTextView(col : Int) : View {
        val lLayoutObj = LinearLayout(ctx)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lLayoutObj.setBackgroundColor(Color.WHITE)
        lLayoutObj.layoutParams = lp
        lLayoutObj.orientation = LinearLayout.HORIZONTAL

        var tv = createTextView("4", col)
        var vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        // I used 2.5 instead of 5 for the margin widths in order to make the distance between margins add up to 5, this is how I interpreted the question
        val npx :Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
            2.5F, ctx.getResources().getDisplayMetrics()).toInt()
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        tv = createTextView("4", col)
        vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        tv = createTextView("4", col)
        vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        tv = createTextView("4", col)
        vlp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT)
        vlp.weight = 1.0F
        vlp.setMargins(npx, npx, npx, npx)
        tv.layoutParams = vlp
        lLayoutObj.addView(tv)

        return lLayoutObj
    }


    fun createTextView(content : String, col : Int) : View {
        lateinit var tv : TextView
        // Create the TextView widget object
        tv = TextView(ctx)
        tv.text = content
        tv.setTextColor(Color.BLACK)
        tv.setBackgroundColor(col)
        // Converted font size
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        // Font Type
        tv.setTypeface(Typeface.create("monospace", Typeface.BOLD_ITALIC))
        // Centered
        tv.gravity = Gravity.CENTER
        return tv
    }
}