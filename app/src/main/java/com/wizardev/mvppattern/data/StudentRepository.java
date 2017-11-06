package com.wizardev.mvppattern.data;

import com.wizardev.mvppattern.data.Student;
import com.wizardev.mvppattern.data.StudentDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wizardev on 17-11-6.
 */

public class StudentRepository implements StudentDataSource{
    private List<Student> mStudents = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        mStudents.add(student);
    }
}
