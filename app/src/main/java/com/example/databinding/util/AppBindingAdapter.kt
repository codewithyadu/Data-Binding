package com.example.databinding

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) {
    Glide.with(view.context)
        .load(url)
        .into(view)
}

@BindingAdapter(value = ["bind:anotherView", "bind:count"])
fun changeVisibility(view: ImageView, anotherView: TextView,count: Int) {
    if (count == 1) {
        view.visibility = View.GONE
        anotherView.visibility = View.GONE
    }
}
