package com.fernandomoraes.androidatc_lesson_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,getString(R.string.toast_onCreate),Toast.LENGTH_LONG).show()
    }

    fun go2SecondActivity(view: View) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name",txtName.text.toString())
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        var toast : Toast = Toast.makeText(this,R.string.toas_OnStart,Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP, 0, 800)
        toast.show()
    }

    fun onClicked(view: View) {
        var toast = Toast.makeText(this,R.string.draft_toast, Toast.LENGTH_SHORT)
            //toast.setGravity(Gravity.TOP, 0, 800)
        toast.setGravity(Gravity.NO_GRAVITY, 0,400)
            toast.show()
    }
}