package com.example.android.android_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by NITIN on 22-Jun-17.
 */


public class BodyPartFragment extends Fragment {

    private List<Integer> imgaeid;
     private int imageinex;
    ImageView imageView;

    public void setImgaeid(List<Integer> imgaeid) {
        this.imgaeid = imgaeid;
    }

    public void setImageinex(int imageinex) {
        this.imageinex = imageinex;
    }

    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_body_part, null);
        if (imgaeid != null) {
            imageView = (ImageView) view.findViewById(R.id.body_part);
            imageView.setImageResource(imgaeid.get(imageinex));

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imageinex == imgaeid.size()-1) {
                        imageinex = 0;
                        imageView.setImageResource(imgaeid.get(imageinex));
                    } else {
                        imageinex++;
                        imageView.setImageResource(imgaeid.get(imageinex));
                    }
                }
            });
        }
        return view;
    }
}
