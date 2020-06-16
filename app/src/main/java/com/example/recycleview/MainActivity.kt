package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<ItemOfList>(
            ItemOfList(
                R.drawable.img1,
                "Coronavirus",
                "Statistics on 21.04.2020 10:00" +
                        "Confirmed: 2 478 948" +
                        "Recovered: 652 046" +
                        "Deaths: 170 399"
            ),
            ItemOfList(
                R.drawable.img2,
                "Sales of Corona beer fell due to coronavirus",
                "Some people in USA associate Corona beer and COVID-19. That caused sales to fall by 40 percent."
            ),
            ItemOfList(
                R.drawable.img3,
                "Oil prices drop",
                "The price of oil became negative for the first time in history."
            ),
            ItemOfList(
                R.drawable.img4,
                "New Microsoft Edge...",
                "The updated Microsoft Edge took the second place in popularity among browsers. First place is still holded by Google Chrome."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("OBJECT_INTENT", it)
            startActivity(intent)
        }

    }
}
