package com.binar.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Membuat arrayList of MyContact sebaai Daftar Kontak kita
        val listContact = arrayListOf(
            MyContact("Rizqi", "08975601600"),
            MyContact("Rizqi", "08975601600"),
            MyContact("Rizqi", "08975601600"),
            MyContact("Rizqi", "08975601600"),
            MyContact("Rizqi", "08975601600"),
            MyContact("Rizqi", "08975601600"),
            MyContact("Rizqi", "08975601600")
        )

        //Membuat Adapter
        val adapter = ContactAdapter(listContact)

        //Menyiapkan Layout Manager
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //Set Layout Manager pada Recycler
        recyclerView_main_activity.layoutManager = layoutManager

        //Set Adapter pada RecyclerView
        recyclerView_main_activity.adapter = adapter
    }
}