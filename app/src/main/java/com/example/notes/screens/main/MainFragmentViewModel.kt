package com.example.notes.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notes.utilits.REPOSITORY

class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes

    fun sighOut() {
        REPOSITORY.sighOut()
    }
}