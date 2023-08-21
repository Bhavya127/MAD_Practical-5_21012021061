package com.example.mad_practical_5_21012021061

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.provider.MediaStore.Images.Media

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openUrl(url: String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) };
    }

    fun dialPhone(number: String) {
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) };
    }

    fun callLog() {
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }
    };

    fun openGallery() {
        Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity(it) };
    }

    fun openCamera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) };

        fun openAlarm() {
            Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) };
        }

    }
}