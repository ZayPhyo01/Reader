package com.example.zay_phyo.reader.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zay_phyo.reader.R;
import com.example.zay_phyo.reader.views.holders.NewsHolder;

public class NewsAdapter extends RecyclerView.Adapter<NewsHolder> {
    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_books_view,viewGroup,false);
        return new NewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsHolder newsHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
