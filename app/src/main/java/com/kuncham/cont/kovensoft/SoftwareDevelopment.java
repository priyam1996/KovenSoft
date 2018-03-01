package com.kuncham.cont.kovensoft;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by KSSSYS011 on 3/1/2018.
 */

public class SoftwareDevelopment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View mSoftwareView = inflater.inflate(R.layout.activity_software_development,null);
        return mSoftwareView;
    }
}
