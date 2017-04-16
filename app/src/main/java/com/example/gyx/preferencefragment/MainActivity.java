package com.example.gyx.preferencefragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;

public class MainActivity extends Activity {
    private static final int menu_setting = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentPreferences fragmentPreferences = new FragmentPreferences();

        transaction.replace(android.R.id.content, fragmentPreferences);
        transaction.addToBackStack(null);
        transaction.commit();

    }
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, menu_setting, 1, "设置");
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        return true;
    }
}
