package rodriguezgarcia.antoniojesus.travelersapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Locale;

import rodriguezgarcia.antoniojesus.travelersapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String idioma = Locale.getDefault().getDisplayLanguage();
        Log.d("TAG", idioma);
    }
}
