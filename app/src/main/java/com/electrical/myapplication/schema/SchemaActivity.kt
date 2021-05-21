package com.electrical.myapplication.schema

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivitySchemaBinding



class SchemaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
      val schemaBinding = ActivitySchemaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(schemaBinding.root)
//        title = "Схемы"
//        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
//        actionBarShow?.apply {
//            setHomeButtonEnabled(true)
//            setDisplayHomeAsUpEnabled(true)
//        }

        val recyclerSchema :RecyclerView= schemaBinding.recyclerSchema
        val listSchema :List<SchemaData> = listOf(
            SchemaData("\n" +
                    "Условные обозначения ГОСТ в электрических схемах\n",R.drawable.calc)
        )
        val adapterSchema = SchemaAdapter(this, listSchema)
        recyclerSchema.adapter = adapterSchema
        recyclerSchema.layoutManager = LinearLayoutManager(this)


    }



}