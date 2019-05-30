package com.nd.frt.recentconversation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nd.frt.recentconversation.adapter.UsersAdapter;
import com.nd.frt.recentconversation.model.UserInfo;
import com.nd.frt.recentconversation.service.UserInfoService;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserInfoService userInfoService = new UserInfoService();
        List<UserInfo> userInfos = userInfoService.getUserInfos(this);
        RecyclerView recy_list = findViewById(R.id.recy_list);
        recy_list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        recy_list.setAdapter(new UsersAdapter(userInfos));
    }

}
