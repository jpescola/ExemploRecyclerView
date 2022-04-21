package com.example.exemplorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // cria o objeto RecyclerView
        var r = findViewById<RecyclerView>(R.id.rv)
        // define a classe atual como gerenciadora do layout
        r.layoutManager = LinearLayoutManager(this)
        // cria um vetor de strings
        var arr = Array<String>(100){"$it"}
        // define o adaptador
        var adapter = CustomAdapter(arr)
        // vincula a lista RecyclerView ao adaptador definido na linha anterior
        r.adapter = adapter
    }
}