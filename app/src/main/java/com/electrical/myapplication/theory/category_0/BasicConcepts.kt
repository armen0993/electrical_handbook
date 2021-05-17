package com.electrical.myapplication.theory.category_0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityBasicConceptsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import com.electrical.myapplication.theory.view

class BasicConcepts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingBasicConcepts = ActivityBasicConceptsBinding.inflate(layoutInflater)
        setContentView(bindingBasicConcepts.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBar?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        bindingBasicConcepts.position0.setOnClickListener(){
            Toast.makeText(this,"selected",Toast.LENGTH_SHORT).show()
            val intentShowVoltageInfo = Intent(this,VoltageShow::class.java)
            intentShowVoltageInfo.putExtra(ACTION_BAR_TITLE,bindingBasicConcepts.titleBasicConcepts0.text)
            intentShowVoltageInfo.putExtra("key",0)
            startActivity(intentShowVoltageInfo)

        }
        bindingBasicConcepts.position1.setOnClickListener(){

        }
        bindingBasicConcepts.position2.setOnClickListener(){

        }
        bindingBasicConcepts.position3.setOnClickListener(){

        }














    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->{
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}