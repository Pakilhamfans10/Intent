package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {
    val btnDialPhone:Button=
        findViewById(R.id.btn_dial_number)
    val btnMoveWithDataActivity: Button=
        findViewById(R.id.btn_move_activity_data)
    val btnMoveActivity: Button =
        findViewById(R.id.btn_move_activity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDialPhone.setOnClickListener(this)
        btnMoveActivity.setOnClickListener(this)
           btnMoveWithDataActivity.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity ->{
                val moveIntent = Intent(this@MainActivity,
                MoveActivity::class.java)
                startActivity(moveIntent)


            }
            R.id.btn_move_activity_data->{
                val moveWithDataIntent = Intent(this@MainActivity,
                    MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademyBoy")
                startActivity(moveWithDataIntent)
            }

            R.id.btn_dial_number-> {
                val phoneNumber ="0812213457"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent);



                 }

            }
        }
    }
