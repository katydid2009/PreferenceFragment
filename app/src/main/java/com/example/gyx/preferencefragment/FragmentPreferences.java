package com.example.gyx.preferencefragment;

import android.preference.PreferenceFragment;
import android.os.Bundle;

public class FragmentPreferences extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}



