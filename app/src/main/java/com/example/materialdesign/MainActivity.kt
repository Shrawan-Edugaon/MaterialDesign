package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var coordinatorLayout:CoordinatorLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coordinatorLayout = findViewById(R.id.coordinatorContainer)

        val BtnFab:FloatingActionButton  = findViewById(R.id.fabButton)
        BtnFab.setOnClickListener {
            Snackbar.make(coordinatorLayout,"Floating  ActionButton Clicked",Snackbar.LENGTH_LONG).show()
        }
    }
}