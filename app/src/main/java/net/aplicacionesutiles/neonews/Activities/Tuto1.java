package net.aplicacionesutiles.neonews.Activities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import net.aplicacionesutiles.neonews.R;

public class Tuto1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Hide title bar
        //requestWindowFeature(Window.FEATURE_NO_TITLE);


        /*OnLeftSwipe(){
            Intent ident = new Intent(YourActivity.this, DetailedActivity.class);
            ident.putExtra("id", this.getIntent().getExtra("id") - 1);
            startActivity(ident);
        }*/
    }

    public void clickPasoDos(View v){
        Intent ident = new Intent(getApplicationContext(), Tuto2.class);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        startActivity(ident);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menus , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.search_button) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
