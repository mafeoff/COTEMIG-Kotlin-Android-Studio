package com.example.atividade_paises

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rec: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rec = findViewById(R.id.recy)
        rec.layoutManager = LinearLayoutManager(this)
        rec.adapter = adapterPais(::change)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.favorito){


            var intentvar: Intent = Intent(this,favoritos::class.java)
            startActivity(intentvar)
            return true;
        }
        return super.onOptionsItemSelected(item)
    }

    fun change(flag: Int, name: String){
        var intentvar: Intent = Intent(this,ActivityPais::class.java)
        intentvar.putExtra("flag", flag)
        intentvar.putExtra("name", name)
        startActivity(intentvar)
    }
}