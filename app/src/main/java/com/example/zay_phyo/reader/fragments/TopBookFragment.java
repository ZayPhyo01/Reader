package com.example.zay_phyo.reader.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zay_phyo.reader.R;

public class TopBookFragment extends Fragment {

    public static TopBookFragment newInstance() {
        TopBookFragment topBookFragment = new TopBookFragment();
        return topBookFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top_book,container,false);
        return view;
    }
}
