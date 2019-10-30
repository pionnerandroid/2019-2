package com.example.user.exrecyclerview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Professor> professors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("교수 목록");

        initProfessor();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ProAdapter adapter = new ProAdapter(professors, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    private void initProfessor() {
        professors.add(new Professor("이만희", "manheelee@hnu.kr", "컴퓨터공학과"));
        professors.add(new Professor("이상구", "sglee@hnu.kr", "컴퓨터공학과"));
        professors.add(new Professor("이재광", "jklee@hnu.kr", "컴퓨터공학과"));
        professors.add(new Professor("소우영", "wsoh@hnu.kr", "컴퓨터공학과"));
        professors.add(new Professor("최의인", "choi@hnu.kr", "컴퓨터공학과"));
        professors.add(new Professor("이극", "leegeuk@hnu.kr", "컴퓨터공학과"));
        professors.add(new Professor("이강수", "gslee@hnu.kr", "컴퓨터공학과"));
        professors.add(new Professor("안기영", "kyagrd@hnu.kr", "컴퓨터공학과"));
    }
}
