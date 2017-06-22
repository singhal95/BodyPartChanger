/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.android_me.BodyPartFragment;
import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        BodyPartFragment bodyPartFragment=new BodyPartFragment();
        BodyPartFragment bodyPartFragment1=new BodyPartFragment();
        BodyPartFragment bodyPartFragment2=new BodyPartFragment();
        bodyPartFragment.setImgaeid(AndroidImageAssets.getHeads());
        bodyPartFragment.setImageinex(0);
        bodyPartFragment1.setImgaeid(AndroidImageAssets.getBodies());
        bodyPartFragment1.setImageinex(0);
        bodyPartFragment2.setImgaeid(AndroidImageAssets.getLegs());
        bodyPartFragment2.setImageinex(0);


        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.headimage,bodyPartFragment).commit();
        fragmentManager.beginTransaction().replace(R.id.midimageimage,bodyPartFragment1).commit();
        fragmentManager.beginTransaction().replace(R.id.legimage,bodyPartFragment2).commit();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

    }
}
