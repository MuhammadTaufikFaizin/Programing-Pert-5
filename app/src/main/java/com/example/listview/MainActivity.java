package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listview.fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ambil list view dari activity_main.xml
        ListView list=findViewById(R.id.list_view);

        //efinisikan list adapter yang kita buat
        ListAdapter adapter=new ListAdapter(this,createPersons());
 setTitle("Taufik_Shop");
        //set adapter pada list view.
        list.setAdapter(adapter);
    }

    /*
     * Untuk menambahkan data pada list
     */
    private List<fruit> createPersons(){
        List<fruit>data=new ArrayList<>();
        data.add(new fruit(R.drawable.nangka,"nangka","Rp.17000"));
        data.add(new fruit(R.drawable.salak,"salak","Rp.1500"));
        data.add(new fruit(R.drawable.kelapa_muda,"kelapa_muda","Rp12000"));
        data.add(new fruit(R.drawable.pisang,"pisang","Rp5000"));
        data.add(new fruit(R.drawable.melon,"melon","Rp10000"));


        return data;
    }
}