package com.example.threeprojectkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.threeprojectkotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.MainScope

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Context
        //Aktivite context : this,this@MainActivity, App context: applicationContext

        Toast.makeText(this,"test",Toast.LENGTH_LONG).show()

        binding.button.setOnClickListener (object : View.OnClickListener{
            override fun onClick(p0: View?) {
                // this : annonymous inner class
                Toast.makeText(this@MainActivity,"test1",Toast.LENGTH_LONG).show()
            }
        })
        binding.button.setOnClickListener {
            // this : main activity
            Toast.makeText(this@MainActivity,"test2",Toast.LENGTH_LONG).show()
        }


    }

    fun kaydet(view:View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Kayıt Et")
        alert.setMessage("Kayıt etmek istediğinize emin misiniz?")
        alert.setPositiveButton("Evet") { dialog, which ->
            Toast.makeText(this@MainActivity,"Kayıt Edildi",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("Hayır") { dialog, which ->
            Toast.makeText(this@MainActivity,"Kayıt Edilmedi",Toast.LENGTH_LONG).show()
        }

        alert.show()
    }

}