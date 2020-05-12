package com.example.portfoli

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var pref:SharedPreferences

    val TAG ="Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        Log.d(TAG, "In Oncreate")
//Shared preference area start
        pref=getSharedPreferences(RegisterActivity.PREF_NAME,Context.MODE_PRIVATE)
        val show: String? =pref.getString("usermail","")
        val showEmail:TextView?=findViewById(R.id.desc)
            if (showEmail != null) {
                showEmail.text=show
            }
//Shared prefrence area stop

//on click listener for every icon start

        imageView1a.setOnClickListener {
            val intent = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))

                val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
            startActivity(chooser)
        }
        imageView1b.setOnClickListener {
            intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/mobile/"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
            startActivity(chooser)
        }
            imageView1c.setOnClickListener {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://bitbucket.org/product")
                )
                val chooser: Intent = Intent.createChooser(intent, "Choose :" )
                if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
            }
        imageView1d.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://mobile.facebook.com/home.php"))
            if (intent.resolveActivity(packageManager) != null)
            startActivity(intent)
        }
        imageView2a.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps?hl=en"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView2b.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&source=web&rct=j&url=https://twitter.com/%3Flang%3Den&ved=2ahUKEwissuej0vjoAhVTAGMBHadDAp0QjjgwAXoECAMQAQ&usg=AOvVaw1Sd3B-_cNZOLSmhw9z2lOm"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView2c.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&source=web&rct=j&url=https://www.instagram.com/accounts/login/&ved=2ahUKEwiS4onb0vjoAhUw4YUKHY_kB9cQFjAAegQIAxAB&usg=AOvVaw0BRCgcMCVNSSLcNcVjPzsz&cshid=1587442168713"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView2d.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.google.com/url?sa=t&source=web&rct=j&url=https://m.youtube.com/&ved=2ahUKEwjP0oGx1fjoAhVqzoUKHdI6DNYQjjgwAHoECAsQAw&usg=AOvVaw1gjD0qA2OtrsxdcaNbwsxk"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
            imageView3a.setOnClickListener{
                val intent = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://dribbble.com/tags/mobile"))

                val chooser= Intent.createChooser(intent, "Open with :")
                if (intent.resolveActivity(packageManager) != null)
                    startActivity(chooser)
            }
        imageView3b.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://mobile.linkedin.com"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView3c.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse(" https://mail.google.com/mail/mu/mp/14/#tl/priority/%5Esmartlabel_personal"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView3d.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.whatsapp.com/"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView4a.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.skype.com/en/get-skype/skype-for-mobile/"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView4b.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.google.com/?gws_rd=ssl"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView4c.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
        imageView4d.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.google.com/?gws_rd=ssl"))

            val chooser= Intent.createChooser(intent, "Open with :")
            if (intent.resolveActivity(packageManager) != null)
                startActivity(chooser)
        }
    }


    private fun getText(outputName: TextView?) {

    }


//Activity life cycle area.
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "In Onstart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "In Onstop")
    }


    override fun onPause() {
        super.onPause()
        Log.d(TAG, "In Onpause")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "In Ondestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "In Onrestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "In Onresume")
    }

}
