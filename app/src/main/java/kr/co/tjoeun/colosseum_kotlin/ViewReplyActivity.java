package kr.co.tjoeun.colosseum_kotlin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.colosseum_kotlin.databinding.ActivityViewReplyBinding;

public class ViewReplyActivity extends BaseActivity {

    ActivityViewReplyBinding binding;
    int replyId = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_reply);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        replyId = getIntent().getIntExtra("replyId", -1);
        if(replyId != -1 ) {
//            서버에서 의견의 상세 정보를 불러오자.
            getReplyDataFromServer();
        }

    }

    void getReplyDataFromServer() {


    }
}

