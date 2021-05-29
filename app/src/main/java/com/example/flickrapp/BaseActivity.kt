package com.example.flickrapp

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


internal const val FLICKR_QUERY = "FLICKR_QUERY"
internal const val PHOTO_TRANSFER = "PHOTO_TRANSFER"
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    private val  TAG = "BaseActivity"
    internal fun activateToolbar(enableHome : Boolean){
        Log.d(TAG,".activateToolbar")
        var toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(enableHome)
    }


}