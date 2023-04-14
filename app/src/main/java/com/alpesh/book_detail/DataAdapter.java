package com.alpesh.book_detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DataAdapter extends BaseAdapter {

    String BookName[];

    String Slogans[];

    String Author[];

    int img[];

    public DataAdapter(String[] Author, String[] bookName, String[] slogans, int[] img) {
    this.BookName=bookName;
    this.Slogans = slogans;
    this.img = img;
    }


    @Override
    public int getCount() {
        return BookName.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,viewGroup,false);
        ImageView Back = view.findViewById(R.id.Back);
        TextView BookName = view.findViewById(R.id.BookName);
        TextView Slogans = view.findViewById(R.id.Slogans);
        TextView Author = view.findViewById(R.id.Author);
        TextView AuthorNAme = view.findViewById(R.id.AuthorNAme);
        TextView BookDes = view.findViewById(R.id.BookDes);
        Glide.with(viewGroup.getContext()).load(img[i]).into(Back);
        BookName.setText(BookName[i]);


        return null;
    }
}
