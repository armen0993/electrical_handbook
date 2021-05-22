package com.electrical.myapplication.schema

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivitySchemaBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


class SchemaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val schemaBinding = ActivitySchemaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(schemaBinding.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        val recyclerSchema: RecyclerView = schemaBinding.recyclerSchema
        val listSchema: List<SchemaData> = listOf(
            SchemaData(getString(R.string.title_schema_standard), R.drawable.ic_schema_standard),
            SchemaData(getString(R.string.title_schema_automatic_transfer_switch), R.drawable.ic_schema_automatic_transfer_switch),
            SchemaData(getString(R.string.title_schema_magnetic_switch), R.drawable.ic_schema_magnetic_switch),
            SchemaData(getString(R.string.title_schema_electric_meter), R.drawable.ic_schema_electric_meter),
            SchemaData(getString(R.string.title_schema_impulse_relay), R.drawable.ic_schema_impulse_relay),
            SchemaData(getString(R.string.title_schema_electricalComponents), R.drawable.ic_schema_electrical_components),
            SchemaData(getString(R.string.title_schema_breaker), R.drawable.ic_schema_breaker),
            SchemaData(getString(R.string.title_schema_pass_through_switch), R.drawable.ic_schema_pass_through_switch)
        )
        val adapterSchema = SchemaAdapter(this, listSchema)
        recyclerSchema.adapter = adapterSchema
        recyclerSchema.layoutManager = LinearLayoutManager(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}