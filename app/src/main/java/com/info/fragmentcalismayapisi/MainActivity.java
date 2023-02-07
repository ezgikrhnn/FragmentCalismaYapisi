package com.info.fragmentcalismayapisi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();  //diyerek nesnemi olusturuyorum
        FragmentTransaction ft = fm.beginTransaction();    //yani gecise basla

        ft.add(R.id.fragment_tutucu1, new FragmentBirinci());  //fragment_tutucu1 e fragment birinciyi yerlestir.
        ft.add(R.id.fragment_tutucu2, new Fragmentİkinci());

        ft.commit(); //yani calistir.
    }
}