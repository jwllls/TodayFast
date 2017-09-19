package todayfast.jwllls.com.todayfast;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

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
        initView();

    }

    private void initView() {
        bottombar
                .addItem(new BottomNavigationItem(R.mipmap.tab_home, "Home"))
                .addItem(new BottomNavigationItem(R.mipmap.tab_home, "video"))
                .addItem(new BottomNavigationItem(R.mipmap.tab_home, "dynamic"))
                .addItem(new BottomNavigationItem(R.mipmap.tab_home, "me"))
                .initialise();
        bottombar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener(){
            @Override
            public void onTabSelected(int position) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
                        break;
                }
            }
            @Override
            public void onTabUnselected(int position) {
            }
            @Override
            public void onTabReselected(int position) {
            }
        });

    }

    @OnClick(R.id.tv_search)
    public void onViewClicked() {
    }
}
