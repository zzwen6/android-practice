package top.hting.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public class NewsContentActivity extends AppCompatActivity {


    public static void actionStart(FragmentActivity activity, String title, String content) {


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_content);

        String newsTitle = getIntent().getStringExtra("news_title");


    }
}
