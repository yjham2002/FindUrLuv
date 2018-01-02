package kr.co.picklecode.findurluv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import bases.BaseActivity;

public class MainActivity extends BaseActivity {

    private static final int PAGE_COUNT = 5;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    private ImageView menu_home;
    private ImageView menu_finder;
    private ImageView menu_chat;
    private ImageView menu_log;
    private ImageView menu_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.menu_home:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.menu_love:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.menu_chat:
                mViewPager.setCurrentItem(2);
                break;
            case R.id.menu_log:
                mViewPager.setCurrentItem(3);
                break;
            case R.id.menu_setting:
                mViewPager.setCurrentItem(4);
                break;
        }
    }

    private void initView(){
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        menu_home = findViewById(R.id.menu_home);
        menu_finder = findViewById(R.id.menu_love);
        menu_chat = findViewById(R.id.menu_chat);
        menu_log = findViewById(R.id.menu_log);
        menu_setting = findViewById(R.id.menu_setting);

        setClick(menu_home, menu_finder, menu_chat, menu_log, menu_setting);
    }

    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position){
                case 0: // Home
                    fragment = new HomeFragment();
                    break;
                case 1: // Finder
                    fragment = new FinderFragment();
                    break;
                case 2: // Chat
                    fragment = new ChatFragment();
                    break;
                case 3: // Log
                    fragment = new LogFragment();
                    break;
                case 4: // Setting
                    fragment = new SettingFragment();
                    break;
            }

            return fragment;
//            Fragment temp;
//            Bundle args = new Bundle();
//            args.putInt("key", position);
//            temp = new TutorialFragment();
//            temp.setArguments(args);
//            return temp;
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title = "";
            return title;
        }
    }

}
