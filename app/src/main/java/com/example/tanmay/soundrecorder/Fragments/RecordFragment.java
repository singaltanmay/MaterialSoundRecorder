package com.example.tanmay.soundrecorder.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tanmay.soundrecorder.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecordFragment extends Fragment {


    public RecordFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(){
        RecordFragment fragment = new RecordFragment();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_record, container, false);
    }

}
