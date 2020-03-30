package chapter.android.aweme.ss.com.homework.tips;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import chapter.android.aweme.ss.com.homework.R;

public class ChatRoomActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom);
        TextView position = findViewById(R.id.tv_content_info);
        Bundle bundle = getIntent().getExtras();
        position.setText("当前聊天对象是列表中的第 " + bundle.getInt("position")+" 位");

        //Intent intent = getIntent();
        TextView tv_title = findViewById(R.id.tv_with_name);
        tv_title.setText(new StringBuilder("我和"+ bundle.getString("title")+"的对话"));
    }

    public void sendMessage(View view) {
        EditText messageText = findViewById(R.id.ed_say);
        final String inputText=messageText.getText().toString();
        TextView message = findViewById(R.id.tv_content_info);
        EditText resetText = findViewById(R.id.ed_say);
        message.setText("发送的消息："+inputText);
        resetText.setText(null);
        Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    TextView reply = findViewById(R.id.tv_reply_info);
                    reply.setText("对方的回复："+inputText);
                }
            },1000);

    }
}