package com.voole.thirdpart2voole30;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.voole.thirdpart2voole30.ThirdPartActionUtil.ACTION_EXTRA_DATA;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextMessage;

    public Button mSearch;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearch = (Button) findViewById(R.id.button_search);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mSearch.setOnClickListener(this);
        Button button_collection = (Button) findViewById(R.id.button_collection);
        button_collection.setOnClickListener(this);
        Button button_play_history = (Button) findViewById(R.id.button_play_history);
        button_play_history.setOnClickListener(this);
        Button button_programlist = (Button) findViewById(R.id.button_programlist);
        button_programlist.setOnClickListener(this);
        Button button_programlist2 = (Button) findViewById(R.id.button_programlist2);
        button_programlist2.setOnClickListener(this);
        Button button_programlist3 = (Button) findViewById(R.id.button_programlist3);
        button_programlist3.setOnClickListener(this);
        Button button_ranking = (Button) findViewById(R.id.button_ranking);
        button_ranking.setOnClickListener(this);
        Button button_home = (Button) findViewById(R.id.button_home);
        button_home.setOnClickListener(this);
        Button button_order = (Button) findViewById(R.id.button_order);
        button_order.setOnClickListener(this);
        Button button_detail = (Button) findViewById(R.id.button_detail);
        button_detail.setOnClickListener(this);
        Button button_mine = (Button) findViewById(R.id.button_mine);
        button_mine.setOnClickListener(this);

        Button button_division = (Button) findViewById(R.id.button_division);
        button_division.setOnClickListener(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mSearch != null) {
                    mSearch.requestFocus();
                }
            }
        },1500);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        Bundle bundle;
        switch (v.getId()) {
            case R.id.button_search:
                intent = new Intent();
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[16]);
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_collection:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[15]);
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_play_history:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[14]);
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_programlist:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[11]);
//                bundle.putString(ThirdPartActionUtil.NAVIGATOR_COLUMN_ID,"1519");
                bundle.putString(ThirdPartActionUtil.NAVIGATOR_COLUMN_ID,"2331");
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_programlist2:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[11]);
                bundle.putString(ThirdPartActionUtil.NAVIGATOR_COLUMN_ID,"1519");
                bundle.putString(ThirdPartActionUtil.NAVIGATOR_COLUMN_NAME,"全部电视剧");
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_programlist3:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[11]);
                bundle.putString(ThirdPartActionUtil.NAVIGATOR_COLUMN_ID,"2333");
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_ranking:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[17]);
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_home:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);

                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.ACTION_HOME);
                bundle.putString(ACTION_EXTRA_DATA,"1497");
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_order:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[13]);
                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            //1177421106
            case R.id.button_detail:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[12]);
                bundle.putString("aid","1177421106");

                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_mine:
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.ACTION_HOME);
                bundle.putString(ACTION_EXTRA_DATA,"userinfo");

                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
            case R.id.button_division:
                // 专题 1388711323
                intent = new Intent();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setAction(ThirdPartActionUtil.ACTION_MAIN);
                bundle = new Bundle();
                bundle.putString("Data",ThirdPartActionUtil.actions[12]);
                bundle.putString("aid","1388711323");

                intent.putExtras(bundle);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);
                break;
        }
    }

    private void test() {
        Intent intent = new Intent();
        intent.setAction("lh.oslauncher.action.main");
        Bundle bundle = new Bundle();
        bundle.putString("Data","programlistdetail");
        bundle.putString("aid","1177421106");
        intent.putExtras(bundle);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
    private void test2() {
        Intent intent = new Intent();
        intent.setAction("lh.oslauncher.action.main");
        Bundle bundle = new Bundle();
        bundle.putString("Data","programlist");
        bundle.putString("navigator_column_id","1519");
        intent.putExtras(bundle);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
    private void test3() {
        Intent intent = new Intent();
        intent.setAction("com.upotv.vod.action.main");
        Bundle bundle = new Bundle();
        bundle.putString("Data","collection");
        intent.putExtras(bundle);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
    private void test4() {
        Intent intent = new Intent();
        intent.setAction("com.upotv.vod.action.main");
        Bundle bundle = new Bundle();
        bundle.putString("Data","watchhistory");
        intent.putExtras(bundle);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
    private void test5() {
        Intent intent = new Intent();
        intent.setAction("com.upotv.vod.action.main");
        Bundle bundle = new Bundle();
        bundle.putString("Data","search");
        intent.putExtras(bundle);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
    private void test6() {
        Intent intent = new Intent();
        intent.setAction("com.upotv.vod.action.main");
        Bundle bundle = new Bundle();
        bundle.putString("Data","ranking");
        intent.putExtras(bundle);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
    private void test7() {
        Intent intent = new Intent();
        intent.setAction("com.upotv.vod.action.main");
        Bundle bundle = new Bundle();
        bundle.putString("Data","home");
        bundle.putString("EXTRA_DATA","1497");
        intent.putExtras(bundle);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }

}
