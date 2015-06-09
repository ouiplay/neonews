package net.aplicacionesutiles.neonews.Clases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import net.aplicacionesutiles.neonews.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PatxiRodriguez on 7/6/15.
 */
public class NoticiasAdapter extends ArrayAdapter {

    private Context context;
    private List<Noticias> noticias;

    public NoticiasAdapter(Context context, List<Noticias> noticias) {
        super(context, R.layout.activity_hotnews, noticias);
        this.context = context;
        this.noticias = noticias;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item, null);


        ImageView logo = (ImageView) item.findViewById(R.id.logoMedioList);
        logo.setImageResource(noticias.get(position).getLogoMedio());

        TextView titular = (TextView) item.findViewById(R.id.titularlist);
        titular.setText(((Noticias) noticias.get(position)).getTitular());

        TextView noticia = (TextView) item.findViewById(R.id.noticialist);
        noticia.setText(((Noticias)noticias.get(position)).getNoticia());

        return item;
    }


}
