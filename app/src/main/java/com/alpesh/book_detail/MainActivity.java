package com.alpesh.book_detail;

import static com.alpesh.book_detail.R.drawable.img1;
import static com.alpesh.book_detail.R.drawable.img2;
import static com.alpesh.book_detail.R.drawable.img3;
import static com.alpesh.book_detail.R.drawable.img4;
import static com.alpesh.book_detail.R.drawable.img5;
import static com.alpesh.book_detail.R.drawable.img6;
import static com.alpesh.book_detail.R.drawable.img7;
import static com.alpesh.book_detail.R.drawable.img8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    int img[] = {img1,img2,img3,img4,img5,img6,img7,img8};

    String BookName[] = {"MODERN SPACES","A TIME TO KILL BY JOHN GRISHAM","THE HOUSE OF MIRTH BY EDITH WHARTON","EAST OF EDEN BY JOHN STEINBECK","THE SUN ALSO RISES BY ERNEST HEMINGWAY",
                            "THE SUN ALSO RISES BY ERNEST HEMINGWAY"," VILE BODIES BY EVELYN WAUGH","MOAB IS MY WASHPOT BY STEPHEN FRY"};

    String Slogans[] = {"There is nothing better than to read","Reading is all about learning","Reading is our life","We read to learn","Learning is next to reading",
                        "Reading is more than a passion","Amazing books on your way","Reading is essential"};

    String Author[] = {"Bimal Jalal","Ruskin Bond","Vinit Karnik","Preeti Shenoy","VP Venkaiah Naidu","Ex-IPS Prakash Singh","Rajnath Singh","Prof. Alok Chakrawal"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        DataAdapter adapter = new DataAdapter(BookName,Slogans,Author,img);
        listView.setAdapter((adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}