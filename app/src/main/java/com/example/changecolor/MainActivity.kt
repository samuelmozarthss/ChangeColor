package com.example.changecolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.checkBox1) {
            valideColor()
        }
    }

    private fun valideColor() {

        if (checkBox1.isChecked) {
            androidIcon.setColorFilter(resources.getColor(R.color.purple_500))
        } else {
            return androidIcon.setColorFilter(resources.getColor(R.color.black))
        }

    }
}