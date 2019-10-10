package com.example.etiquetas_predictivas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    /*private static final String[] CIUDADES = new String[]{
            "Burgos", "Soria", "Barcelona", "Sevilla", "Santander", "Alicante", "Almería"
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, CIUDADES);

        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        textView.setAdapter(adapter);*/

        ArrayAdapter<CharSequence> adaper = ArrayAdapter.createFromResource(this,
                R.array.nombre_ciudades,android.R.layout.simple_spinner_item);
        AutoCompleteTextView textView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        textView.setAdapter(adaper);
    }
}
