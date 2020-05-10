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
            const val EMAIL = "email"
            const val USERNAME ="username"
            const val PASSWORD = "password"
            const val USERDETAILS = "userDetails"
            const val PREF_NAME = "com.example.portfoli.SharePreference"
        }

    lateinit var usernameTv: TextView
    lateinit var emailTv: TextView
    lateinit var passwordTv: TextView
    lateinit var registerbtn: Button
    lateinit var loginText: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        usernameTv = findViewById(R.id.reg_username)
        emailTv = findViewById(R.id.reg_useremail)
        passwordTv = findViewById(R.id.reg_password)
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
            editor.putString(USERNAME, userName)
            editor.putString(EMAIL, email)
            editor.putString(PASSWORD, password)
            editor.putString(USERDETAILS, email)
            editor.apply()
        var housefly= Intent(this, LoginActivity::class.java)
            startActivity(housefly)
            finish()
            Toast.makeText(this,"Success", Toast.LENGTH_SHORT).show()


    }

        }


