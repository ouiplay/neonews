package net.aplicacionesutiles.neonews.Activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import net.aplicacionesutiles.neonews.Clases.Noticias;
import net.aplicacionesutiles.neonews.Clases.NoticiasAdapter;
import net.aplicacionesutiles.neonews.R;

import java.util.ArrayList;

public class Hotnews extends ActionBarActivity {

    private ArrayList<Noticias> noticias = new ArrayList<Noticias>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotnews);

        rellenarArrayList();

        ListView lista = (ListView) findViewById(R.id.listViewNoticias);

        NoticiasAdapter adapter;
        adapter = new NoticiasAdapter(this, noticias);

        lista.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }


    private void rellenarArrayList() {
        noticias.add(new Noticias(R.drawable.dn, "Mi titular", "Esta es la noticia", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular1", "Esta es la noticia1", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular2", "Esta es la noticia2", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular3", "Esta es la noticia3", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular4", "Esta es la noticia4", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular5", "Esta es la noticia5", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular", "Esta es la noticia", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular1", "Esta es la noticia1", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular2", "Esta es la noticia2", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular3", "Esta es la noticia3", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular4", "Esta es la noticia4", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular5", "Esta es la noticia5", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular", "Esta es la noticia", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular1", "Esta es la noticia1", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular2", "Esta es la noticia2", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular3", "Esta es la noticia3", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular4", "Esta es la noticia4", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular5", "Esta es la noticia5", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular", "Esta es la noticia", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular1", "Esta es la noticia1", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular2", "Esta es la noticia2", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular3", "Esta es la noticia3", "http://google.es" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular4", "Esta es la noticia4", "http://aplicacionesutiles.net" ));
        noticias.add(new Noticias(R.drawable.dn, "Mi titular5", "Esta es la noticia5", "http://aplicacionesutiles.net" ));


    }
}
