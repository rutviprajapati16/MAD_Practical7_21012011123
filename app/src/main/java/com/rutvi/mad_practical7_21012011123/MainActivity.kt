package com.rutvi.mad_practical7_21012011123

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebBackForwardList
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController = MediaController(this)
        val uri: Uri= Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        val myVideoView = findViewById<VideoView>(R.id.videoView2)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()
        val button: FloatingActionButton = findViewById(R.id.floatingActionButton)
        button.setOnClickListener(){
            Intent(this@MainActivity,Youtube::class.java).also { startActivity(it) }
        }
    }
}