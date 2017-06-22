package com.example.android.android_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by NITIN on 22-Jun-17.
 */

public class BodyPartFragment extends Fragment {
    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_body_part,null);
        ImageView imageView= (ImageView) view.findViewById(R.id.body_part);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return view;
    }
}
