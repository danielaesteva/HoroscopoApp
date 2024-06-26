package com.example.horoscopoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.example.horoscopoapp.R.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_HOROSCOPE_ID = "HOROSCOPE_ID"
    }

    lateinit var horoscope: Horoscope

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_detail)

        val id: String = intent.getStringExtra(EXTRA_HOROSCOPE_ID)!!

        horoscope = HoroscopeProvider.findById(id)!!

        findViewById<TextView>(R.id.detailsDescriptionTextview).setText(horoscope.name)
        findViewById<ImageView>(R.id.logoImageView).setImageResource(horoscope.logo)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_activity_detail, menu)
        return true
    }

 override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_favorite -> {
                Log.i("MENU", "He hecho click en el menu de favorito")
                true
            }
            R.id.menu_share -> {
                Log.i("MENU", "He hecho click en el menu de compartir")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}