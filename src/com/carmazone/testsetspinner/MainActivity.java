package com.carmazone.testsetspinner;

import com.carmazone.testsetspinner.utils.Utils;
import com.example.testsetspinner.R;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

	private Spinner spinnerSemana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        spinnerSemana = (Spinner) findViewById(R.id.sp_semana);
        //Rellenar spinner con datos de ejemplo
        String[] valores = {"lunes","martes","miercoles","jueves","viernes","sábado", "domingo"};
        spinnerSemana.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));
        
        //Seleccionar valor del spinner
        spinnerSemana.setSelection(Utils.getIndexSpinner(spinnerSemana, "jueves"));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
