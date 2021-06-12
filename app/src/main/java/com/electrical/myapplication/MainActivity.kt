package com.electrical.myapplication

import android.annotation.SuppressLint

import android.content.Intent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.electrical.myapplication.databinding.ActivityMainBinding
import com.electrical.myapplication.installation_of_wiring_in_house.InstallationOfWiringInHouseActivity
import com.electrical.myapplication.schema.SchemaActivity
import com.electrical.myapplication.table.TableActivity
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

        binding.imageCalc.setOnClickListener {

        }
        binding.imageSchema.setOnClickListener {
            val intentSchema = Intent(this, SchemaActivity::class.java)
            intentSchema.putExtra(ACTION_BAR_TITLE, binding.textSchema.text)
            startActivity(intentSchema)
        }
        binding.imageTheory.setOnClickListener {
            val intentTheory = Intent(this, TheoryActivity::class.java)
            intentTheory.putExtra(ACTION_BAR_TITLE, binding.textTheory.text)
            startActivity(intentTheory)
        }
        binding.imageTable.setOnClickListener {
            val intentTable = Intent(this, TableActivity::class.java)
            intentTable.putExtra(ACTION_BAR_TITLE, binding.textTable.text)
            startActivity(intentTable)
        }
        binding.imageInstallationOfWiringInHouse?.setOnClickListener {
            val intentWiringInHouse = Intent(this, InstallationOfWiringInHouseActivity::class.java)
            intentWiringInHouse.putExtra(
                ACTION_BAR_TITLE,
                binding.textInstallationOfWiringInHouse.text
            )
            startActivity(intentWiringInHouse)
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

    override fun onPause() {
        super.onPause()
        overridePendingTransition(
            R.anim.activity_down_up_close_enter,
            R.anim.activity_down_up_close_exit
        )

    }
}