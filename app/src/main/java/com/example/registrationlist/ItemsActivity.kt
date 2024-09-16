package com.example.registrationlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "statuette_owl", "Statuette Owl", "Beautiful statuette of owl", "Full description statuette of owl", 400 ))
        items.add(Item(2, "statuette_cat", "Statuette Cat", "Beautiful statuette of cat","Full description statuette of cat",  300 ))
        items.add(Item(3, "statuette_elephant", "Statuette Elephant", "Beautiful statuette of elephant","Full description statuette of elephant",  359 ))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}