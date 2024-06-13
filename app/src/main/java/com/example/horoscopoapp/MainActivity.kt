package com.example.horoscopoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val horoscopeList: List<Horoscope> = listOf(
        Horoscope("aries", "Aries", R.drawable.aries_icon),
        Horoscope("aries", "Taurus", R.drawable.taurus_icon),
        Horoscope("aries", "Gemini", R.drawable.gemini_icon),
        Horoscope("aries", "Cancer", R.drawable.cancer_icon),
        Horoscope("aries", "Leo", R.drawable.leo_icon),
        Horoscope("aries", "Virgo", R.drawable.virgo_icon),
        Horoscope("aries", "Libra", R.drawable.libra_icon),
        Horoscope("aries", "Scorpio", R.drawable.scorpio_icon),
        Horoscope("aries", "Sagittarius", R.drawable.sagittarius_icon),
        Horoscope("aries", "Capricorn", R.drawable.capricorn_icon),
        Horoscope("aries", "Aquarius", R.drawable.aquarius_icon),
        Horoscope("aries", "Pisces", R.drawable.pisces_icon),

    )

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val adapter = HoroscopeAdapter(horoscopeList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        getDrawable(R.drawable.aries_icon)
        getDrawable(R.drawable.taurus_icon)
    }
}