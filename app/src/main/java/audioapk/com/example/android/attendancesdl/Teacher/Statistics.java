package audioapk.com.example.android.attendancesdl.Teacher;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import audioapk.com.example.android.attendancesdl.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Statistics extends Fragment {


    public Statistics() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_statistics2, container, false);
    }

}
