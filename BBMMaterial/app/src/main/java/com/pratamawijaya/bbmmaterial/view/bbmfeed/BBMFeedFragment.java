package com.pratamawijaya.bbmmaterial.view.bbmfeed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pratamawijaya.bbmmaterial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BBMFeedFragment extends Fragment {

  public BBMFeedFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_bbmfeed, container, false);
  }
}
