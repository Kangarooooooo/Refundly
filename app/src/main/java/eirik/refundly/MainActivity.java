package eirik.refundly;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            Fragment fragment = new MenuFragment();
            
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentindhold, fragment)  // tom container i layout
                    .commit();

        }
    }
}
