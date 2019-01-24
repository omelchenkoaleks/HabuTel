package com.omelchenkoaleks.habutel.ui.fragment.main_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omelchenkoaleks.habutel.R;
import com.omelchenkoaleks.habutel.utils.ConstantManager;

public class WorldwideFragment extends Fragment {
    static final String TAG = ConstantManager.TAG_PREFIX + "Worldwide Fragment";

    public static WorldwideFragment createWorldwideFragment() {
        WorldwideFragment fragment = new WorldwideFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_worldwide,  null);
        return view;
    }

    // чтобы не засорять метод onCreateView можно использовать этот метод для инициализации вьюшек
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}


