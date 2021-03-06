package todayfast.jwllls.com.todayfast.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import todayfast.jwllls.com.todayfast.R;
import todayfast.jwllls.com.todayfast.base.BaseFragment;

/**
 * Created by jwllls on 2017/9/14.
 */

public class NewsFragment extends BaseFragment {


    @Bind(R.id.tablayout)
    TabLayout tablayout;
    @Bind(R.id.main_more)
    TextView mainMore;
    @Bind(R.id.main_viewpager)
    ViewPager mainViewpager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
