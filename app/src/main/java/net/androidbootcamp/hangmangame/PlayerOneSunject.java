package net.androidbootcamp.hangmangame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PlayerOneSunject extends AppCompatActivity {

    String[] animals = {"TIGER","LION","WOLF","HIPPOPOTAMUS","AARDVARK","SNAKE","BIRD","DRAGON","SHARK"};
    String[] plants = {"FLOWERS","IVY","HYDROPONICS","GARDENING","GARDEN","TREES","FOREST","MUSHROOMS","GRASS","LEAVES"};
    String[] food = {"SPAGHETTI","PIZZA","RAMEN","TACOS","BIRYANI","CHICKEN","TURKEY","STEAK","LASAGNA","HAMBURGER"};
    String[] drinks = {"WATER","SODA","BEER","WINE","SAKE","COFFEE","MILK","SHAKE","WHISKEY","JUICE"};
    String[] allWords = {"TIGER","LION","WOLF","HIPPOPOTAMUS","AARDVARK","SNAKE","BIRD","DRAGON","SHARK","FLOWERS","IVY","HYDROPONICS","GARDENING","GARDEN","TREES","FOREST","MUSHROOMS","GRASS","LEAVES","SPAGHETTI","PIZZA","RAMEN","TACOS","BIRYANI","CHICKEN","TURKEY","STEAK","LASAGNA","HAMBURGER","WATER","SODA","BEER","WINE","SAKE","COFFEE","MILK","SHAKE","WHISKEY","JUICE"};

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_one_sunject);
    }
}
