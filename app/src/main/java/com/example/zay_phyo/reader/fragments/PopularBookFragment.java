package com.example.zay_phyo.reader.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zay_phyo.reader.R;

public class PopularBookFragment extends Fragment {

    public static PopularBookFragment newInstance() {
        PopularBookFragment popularBookFragment = new PopularBookFragment();
        return popularBookFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular_book,container,false);
        return view;
    }
}
