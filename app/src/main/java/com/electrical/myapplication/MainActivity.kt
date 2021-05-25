package com.electrical.myapplication

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.electrical.myapplication.databinding.ActivityMainBinding
import com.electrical.myapplication.schema.SchemaActivity
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

import com.electrical.myapplication.theory.TheoryActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageExit.setOnClickListener {

            supportFragmentManager
                .beginTransaction()
                .addToBackStack("exit")
                .add(R.id.container, ExitFragment())
                .commit()
        }
        binding.imageSchema.clipToOutline



        binding.imageCalc.setOnClickListener {
            Toast.makeText(this, "Selected", Toast.LENGTH_SHORT).show()
        }
        binding.imageSchema.setOnClickListener {
            val intentSchema = Intent(this, SchemaActivity::class.java)
            intentSchema.putExtra(ACTION_BAR_TITLE,binding.textSchema.text)
            startActivity(intentSchema)
        }
        binding.imageTheory.setOnClickListener() {
            val intentTheory = Intent(this, TheoryActivity::class.java)
            startActivity(intentTheory)
        }

    }


    // Create Menu Bar..
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_items, menu)
        return true
    }

    @SuppressLint("QueryPermissionsNeeded")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_send_to_mail -> {
                val intentMail = Intent(Intent.ACTION_SEND).apply {
                    Uri.parse("mailto:")
                    putExtra(
                        Intent.EXTRA_EMAIL, resources
                            .getStringArray(R.array.mail_address_programmers)
                    )
                    type = "message/rfc822"
                }
                if (intentMail.resolveActivity(packageManager) != null) {
                    startActivity(intentMail)
                } else {
                    Toast.makeText(this, R.string.errorSend, Toast.LENGTH_SHORT).show()
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