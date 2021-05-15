package com.electrical.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import com.electrical.myapplication.databinding.ActivityMainBinding
import com.electrical.myapplication.theory.TheoryActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageCalc.setOnClickListener {
            val toast = Toast.makeText(this,"Selected",Toast.LENGTH_SHORT).show()
        }
        binding.imageTheory.setOnClickListener(){


            val intentTheory = Intent(this,TheoryActivity::class.java)
            startActivity(intentTheory)
        }



    }



    // Create Menu Bar..
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items,menu)
        return true
    }
    @SuppressLint("QueryPermissionsNeeded")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_send_to_mail -> {
                val intentMail = Intent(Intent.ACTION_SEND).apply {
                    Uri.parse("mailto:")
                    putExtra(
                        Intent.EXTRA_EMAIL, resources
                        .getStringArray(R.array.mail_address_programmers))
                    type = "message/rfc822"
                }
                if (intentMail.resolveActivity(packageManager) != null){
                    startActivity(intentMail)
                }else{
                    Toast.makeText(this,R.string.errorSend, Toast.LENGTH_SHORT).show()
                }
            }
            R.id.menu_share_app -> {
                //  val intentSend = Intent(Intent.ACTION_SEND)
                //  startActivity(intentSend)
            }
            R.id.menu_like -> {
                //
            }
            R.id.menu_settings -> {
            }
        }
        return true
    }
}