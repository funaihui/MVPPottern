package com.wizardev.mvppattern.addStudent;

import com.wizardev.mvppattern.BasePresenter;
import com.wizardev.mvppattern.BaseView;

/**
 * Created by wizardev on 17-11-6.
 */

public interface AddStudentContract {
    interface Presenter extends BasePresenter {
        void saveStudent();

    }

    interface View extends BaseView<Presenter> {
        void showSaveSuccess();
    }

}
