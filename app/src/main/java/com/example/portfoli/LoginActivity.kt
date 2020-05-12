 package com.example.portfoli

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.Telephony.Carriers.PASSWORD
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.portfoli.RegisterActivity.Companion.PREF_NAME


 class LoginActivity : AppCompatActivity() {

//Declaration of variables.

     lateinit var emailEdt:EditText
     lateinit var passwordEdt:EditText
     lateinit var loginBtn: Button
     lateinit var signUpTxt: TextView

     /*private val sharedPrefFile = "ktsharedprefrence"*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
// Find view by i.d area.
         emailEdt=findViewById(R.id.log_usermail)
         passwordEdt=findViewById(R.id.log_password)
         loginBtn=findViewById(R.id.loginBtn)
         signUpTxt=findViewById(R.id.signUpText)

//on click listener area

         signUpTxt.setOnClickListener{
             var frog = Intent(this, RegisterActivity::class.java)
             startActivity(frog)
         }
         loginBtn.setOnClickListener{
             loginFun()
         }}

         private fun loginFun() {
             var email:String = emailEdt.text.toString()
             var password:String = passwordEdt.text.toString()
             var pref:SharedPreferences =
                 getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
             var getEmail:String? = pref.getString(RegisterActivity.EMAIL, null)
             var getPassword: String? = pref.getString(RegisterActivity.PASSWORD, null)

             var editor: SharedPreferences.Editor = pref.edit()
             editor.putString("usermail", getEmail)

             editor.apply()
             var frog = Intent(this, MainActivity::class.java)
             startActivity(frog)
             finish()
             Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

         }
         }
        /*val btnLogin = findViewById<Button>(R.id.register)
        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPrefFile,
            Context.MODE_PRIVATE)
        btnLogin.setOnClickListener {

            val sharedNameValue = sharedPreferences.getString("name_key","defaultname")
            val sharedPValue = sharedPreferences.getString("password_key","defaultpassword")
            if(sharedPValue.equals("defaultpassword") && sharedNameValue.equals("defaultname")){
                *//*outputName.setText("default name: ${sharedNameValue}").toString()
                outputId.setText("default id: ${sharedIdValue.toString()}")*//*
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            }else{
                *//*outputName.setText(sharedNameValue).toString()
                outputId.setText(sharedIdValue.toString())*//*
                val toast = Toast.makeText(applicationContext, "Wrong Details",Toast.LENGTH_SHORT)
                toast.show()
            }

        }
    }*/

