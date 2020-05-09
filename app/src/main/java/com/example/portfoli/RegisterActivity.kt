package com.example.portfoli

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class RegisterActivity : AppCompatActivity() {
        companion object {
            const val Email = "email"
            const val UserName ="username"
            const val Password = "password"
            const val UserDetails = "userDetails"
            const val PREF_NAME = "com.com.example.portfoli.SharePreference"
        }

    lateinit var usernameTv: TextView
    lateinit var emailTv: TextView
    lateinit var passwordTv: TextView
    lateinit var registerbtn: Button
    lateinit var loginText: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        usernameTv = findViewById(R.id.username)
        emailTv = findViewById(R.id.useremail)
        passwordTv = findViewById(R.id.password)
        registerbtn = findViewById(R.id.register)
        loginText = findViewById(R.id.login_text)




        loginText.setOnClickListener {
            var cockroach = Intent(this, LoginActivity::class.java)
            startActivity(cockroach)
        }
                registerbtn.setOnClickListener {
            registerFun()
        }
    }
    private fun registerFun(){
        var userName:String=usernameTv.text.toString()
        var email:String=emailTv.text.toString()
        var password:String=passwordTv.text.toString()
        val pref:SharedPreferences= getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor=pref.edit()
            editor.putString(UserName, userName)
            editor.putString(Email, email)
            editor.putString(Password, password)
            editor.putString(UserDetails, email)
            editor.apply()
        var housefly= Intent(this, LoginActivity::class.java)
            startActivity(housefly)
            finish()
            Toast.makeText(this,"Success", Toast.LENGTH_SHORT).show()


    }

        }


