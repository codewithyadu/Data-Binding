package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.model.User
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), MainActivityEventListener {

    private lateinit var binding: ActivityMainBinding
    private var count = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            user = User()
            event = this@MainActivity
        }
    }

    override fun showMessage(view: View) {
        Toast.makeText(this, (view as TextView).text, Toast.LENGTH_LONG).show()
    }

    override fun showUserName(userName: String) {
        TODO("Not yet implemented")
    }

    override fun changeVisibility(view: TextView) {
        if (count == 1) {
            view.visibility = View.GONE
            count++
        } else {
            view.visibility = View.VISIBLE
            count--
        }
    }


//    /**
//     * 1st way of event handling
//     */
//    fun showMessage(view: View) {
//       if (view is Button) {
//            Toast.makeText(this, view.text, Toast.LENGTH_LONG).show()
//        }
//    }
//
//    fun showMessageAnotherWay(view: TextView) {
//        Toast.makeText(this, view.text, Toast.LENGTH_LONG).show()
//    }
//
//    /**
//     * 2nd way of event handling
//     */
//    fun showUserName(userName: String, price: String) {
//        Toast.makeText(this, "$userName $price", Toast.LENGTH_LONG).show()
//    }
}