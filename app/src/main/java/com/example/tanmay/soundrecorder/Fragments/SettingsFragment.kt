package com.example.tanmay.soundrecorder.Fragments

import android.os.Bundle
import android.preference.PreferenceFragment
import com.example.tanmay.soundrecorder.R

class SettingsFragment : PreferenceFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addPreferencesFromResource(R.xml.preferences_fragment)

    }
}