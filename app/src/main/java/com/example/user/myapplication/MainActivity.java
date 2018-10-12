package com.example.user.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    ArrayList<Item> items;
    CustomAdapter adapter;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.lvItems);
        items = new ArrayList<>();

        items.add(new Item(R.drawable.wllimg,"first"));
        items.add(new Item(R.drawable.lckscrn,"second"));

        adapter = new CustomAdapter(this, R.layout.custo_row, items);
        lvItems.setAdapter(adapter);
        lvItems.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
