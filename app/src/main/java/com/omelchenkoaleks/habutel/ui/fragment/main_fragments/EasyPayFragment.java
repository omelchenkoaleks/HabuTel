package com.omelchenkoaleks.habutel.ui.fragment.main_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omelchenkoaleks.habutel.R;
import com.omelchenkoaleks.habutel.utils.ConstantManager;

public class EasyPayFragment extends Fragment {
    public static final String TAG = ConstantManager.TAG_PREFIX + "Easy Pay Fragment";

    public static EasyPayFragment createEasyPayFragment () {
        EasyPayFragment fragment = new EasyPayFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_easy_pay, container, false);
    }

    // чтобы не засорять метод onCreateView можно использовать этот метод для инициализации вьюшек
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
