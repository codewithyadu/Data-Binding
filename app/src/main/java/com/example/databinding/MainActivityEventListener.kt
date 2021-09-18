package com.example.databinding

import android.view.View
import android.widget.TextView

interface MainActivityEventListener {
    fun showMessage(view: View)
    fun showUserName(userName: String)
    fun changeVisibility(view: TextView)
}