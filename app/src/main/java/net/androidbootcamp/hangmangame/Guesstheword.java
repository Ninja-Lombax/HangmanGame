package net.androidbootcamp.hangmangame;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class Guesstheword extends AppCompatActivity {

    //int[] alphabet = {R.drawable.a, R.drawable.b.png, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m. R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x, R.drawable.y, R.drawable.z };
    String[] alphabet = {" A"," B"," C"," D"," E"," F"," G"," H"," I"," J"," K"," L"," M"," N"," O"," P"," Q"," R"," S"," T"," U"," V"," W"," X"," Y"," Z"};

    int[] hangPerson = {R.drawable.hangmana, R.drawable.hangmanb, R.drawable.hangmanc, R.drawable.hangmand, R.drawable.hangmane, R.drawable.hangmanf};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guesstheword);
        GridView gridView = (GridView) findViewById(R.id.txtKeyboard);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alphabet);

        gridView.setAdapter(adapter);


    }




}
