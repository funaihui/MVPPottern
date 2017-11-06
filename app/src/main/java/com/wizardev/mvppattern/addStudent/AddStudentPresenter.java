package com.wizardev.mvppattern.addStudent;

import com.wizardev.mvppattern.data.StudentRepository;
import com.wizardev.mvppattern.data.Student;
import com.wizardev.mvppattern.data.StudentDataSource;

/**
 * Created by wizardev on 17-11-6.
 */

public class AddStudentPresenter implements AddStudentContract.Presenter {
    private AddStudentContract.View mAddStudentView;
    private StudentDataSource addStudentRepository;

    public AddStudentPresenter(AddStudentContract.View view) {
        mAddStudentView = view;
        addStudentRepository = new StudentRepository();
    }

    @Override
    public void saveStudent() {
        Student student = new Student();
        student.setAge(20);
        student.setName("wizardev");
        addStudentRepository.addStudent(student);
        mAddStudentView.showSaveSuccess();
    }
}
