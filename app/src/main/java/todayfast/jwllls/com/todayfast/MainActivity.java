package todayfast.jwllls.com.todayfast;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import todayfast.jwllls.com.todayfast.base.BaseActivity;
import todayfast.jwllls.com.todayfast.view.fragment.NewsFragment;

public class MainActivity extends BaseActivity {

    @Bind(R.id.text_title)
    TextView textTitle;
    @Bind(R.id.tv_search)
    TextView tvSearch;
    @Bind(R.id.rl_toolbar)
    RelativeLayout rlToolbar;
    @Bind(R.id.main_fragment)
    FrameLayout mainFragment;
    @Bind(R.id.bottombar)
    BottomNavigationBar bottombar;

    private NewsFragment newsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.tv_search)
    public void onViewClicked() {
    }
}
