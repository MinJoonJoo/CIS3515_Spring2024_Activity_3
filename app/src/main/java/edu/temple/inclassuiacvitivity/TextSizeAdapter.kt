package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.content.Context
import android.widget.TextView

class TextSizeAdapter (private val context: Context, private val textSize: Array<Int>) :BaseAdapter(){

    override fun getCount(): Int {

        return textSize.size
    }

    override fun getItem(position: Int): Any {

        return textSize[position]
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return (getDropDownView(position, convertView, parent) as TextView).apply{
            textSize = 30.0f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val tempTextView : TextView
        if (convertView != null){
            tempTextView = convertView as TextView
        }else{
            tempTextView = TextView(context)
            tempTextView.setPadding(5,10,0,10)
        }

        tempTextView.text = textSize[position].toString()
        tempTextView.textSize = textSize[position].toFloat()

        return tempTextView
    }

}