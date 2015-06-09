package net.aplicacionesutiles.neonews.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import net.aplicacionesutiles.neonews.R;

import static android.support.v4.app.ActivityCompat.startActivity;

public class DetalleNoticia extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_noticia);

        String url = getIntent().getStringExtra("url");

        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.setWebViewClient(new WebViewClient());

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);


    }


}
