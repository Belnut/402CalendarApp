package kr.ac.suwon.it402.project.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.ac.suwon.it402.project.R;

/**
 * Created by ohj84_000 on 2016-08-02.
 */
public class Fragment3 extends Fragment {
    public Fragment3()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment3, container, false);
        return rootView;
    }
}
