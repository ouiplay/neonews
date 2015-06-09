package net.aplicacionesutiles.neonews.Activities;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import net.aplicacionesutiles.neonews.Clases.Noticias;
import net.aplicacionesutiles.neonews.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private LinearLayout noticia, noticia2 ;
    private RelativeLayout contenedor;
    private int pasos, totalPasos;
    private Point sizePantalla;
    private Integer contador;
    private List<Noticias>  noti = new ArrayList<Noticias>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        rellenarArrayList();

        TypedValue tv = new TypedValue();
        this.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true);
        int actionBarHeight = getResources().getDimensionPixelSize(tv.resourceId);

        WindowManager wm = (WindowManager) this.getSystemService(this.WINDOW_SERVICE);
        Display display1 = wm.getDefaultDisplay();

        sizePantalla = new Point();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {

            display1.getSize(sizePantalla);
            int width1 = sizePantalla.x;
            int height1 = sizePantalla.y;

        } else {
            int width1 = sizePantalla.x;
            int height1 = sizePantalla.y;
        }

        ////Noticia
        noticia = (LinearLayout) findViewById(R.id.noticia);

        int alto = noticia.getLayoutParams().height;

        TranslateAnimation animacionArriba = new TranslateAnimation(0, 0, sizePantalla.y-(alto+25), 0);
        animacionArriba.setDuration(3000);
        noticia.startAnimation(animacionArriba);


        noticia2 = (LinearLayout) findViewById(R.id.noticia2);

        TranslateAnimation animacionArriba2 = new TranslateAnimation(0, 0, sizePantalla.y-(alto+25), 0);
        animacionArriba2.setStartOffset(7000);
        animacionArriba2.setDuration(3000);
        animacionArriba2.setRepeatCount(99999);

        noticia2.startAnimation(animacionArriba2);

        noticia2.setLayoutAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {



            }

            @Override
            public void onAnimationEnd(Animation animation) {



                noticia2.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }


    public void clickHotnews(View v){
        Intent hotIntent = new Intent().setClass(this, Hotnews.class);
        startActivity(hotIntent);
    }


    public void clickNoticia(View v) {
        Intent detalleInt = new Intent().setClass(this, DetalleNoticia.class);
        detalleInt.putExtra("url", "http://google.es");
        startActivity(detalleInt);
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


        return super.onOptionsItemSelected(item);
    }

    private void rellenarArrayList() {

        noti.add(new Noticias(R.drawable.dn, "Mi titular", "Esta es la noticia", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular1", "Esta es la noticia1", "http://google.es" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular2", "Esta es la noticia2", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular3", "Esta es la noticia3", "http://google.es" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular4", "Esta es la noticia4", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular5", "Esta es la noticia5", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular", "Esta es la noticia", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular1", "Esta es la noticia1", "http://google.es" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular2", "Esta es la noticia2", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular3", "Esta es la noticia3", "http://google.es" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular4", "Esta es la noticia4", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular5", "Esta es la noticia5", "http://aplicacionesutiles.net" ));
        noti.add(new Noticias(R.drawable.dn, "Mi titular", "Esta es la noticia", "http://aplicacionesutiles.net" ));



    }
}