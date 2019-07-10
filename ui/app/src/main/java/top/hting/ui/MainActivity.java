package top.hting.ui;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Msg> msgs = new ArrayList<>();

    EditText input;

    Button send;

    RecyclerView recyclerView;

    MsgAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化一些消息，用于显示发送和接收
        initList();

        // 主界面的两个控件用于发消息的
        send = findViewById(R.id.send);
        input = findViewById(R.id.input);
        adapter = new MsgAdapter(msgs);
        recyclerView = findViewById(R.id.recycler);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        send.setOnClickListener(v -> {
            String content = input.getText().toString();
            if (!"".equals(content)) {

                Msg data = new Msg(content, Msg.TYPE_SEND);
                msgs.add(data);
                adapter.notifyItemInserted(msgs.size() - 1);

                recyclerView.scrollToPosition(msgs.size() - 1);
                input.setText("");
            }

        });
    }

    private void initList() {

        msgs.add(new Msg("hello", Msg.TYPE_RECEIVED));
        msgs.add(new Msg("Hi", Msg.TYPE_SEND));
        msgs.add(new Msg("how old r u", Msg.TYPE_RECEIVED));
        msgs.add(new Msg("18, and you?", Msg.TYPE_SEND));


    }
}
