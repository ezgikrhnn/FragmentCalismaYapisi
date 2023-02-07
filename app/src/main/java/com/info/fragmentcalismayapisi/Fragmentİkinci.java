package com.info.fragmentcalismayapisi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class Fragmentİkinci extends Fragment {

    private Button buttonYap;
    private TextView textViewSonuc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_ikinci_layout,container,false);

        buttonYap = rootView.findViewById(R.id.buttonYap); //butonu bagladim
        textViewSonuc = rootView.findViewById(R.id.textViewSonuc);

        buttonYap.setOnClickListener(new View.OnClickListener() {  //butona basma ozelliği ekliyorum.
            @Override
            public void onClick(View view) {

                textViewSonuc.setText("merhaba fragment");  //butona tıkladıgım anda textView'de merhaba fragment yazısı görünecek.

            }
        });


        return rootView; // bu asamayi yapmam lazim aksi halde tasarimi yukleyemem.
    }
}
