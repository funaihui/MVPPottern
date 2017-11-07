package com.wizardev.mvppattern.addStudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.wizardev.mvppattern.R;

public class AddStudentActivity extends AppCompatActivity implements AddStudentContract.View {
    private AddStudentContract.Presenter mPresenter;
    private Button mAddStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
        setPresenter(new AddStudentPresenter(this));
        mAddStudent = findViewById(R.id.addStudent);
        mAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.saveStudent();
            }
        });
    }

    @Override
    public void setPresenter(AddStudentContract.Presenter presenter) {
        if (presenter != null) {
            mPresenter = presenter;
        }
    }

    @Override
    public void showSaveSuccess() {
        Toast.makeText(this,"添加成功！",Toast.LENGTH_SHORT).show();
    }
}
