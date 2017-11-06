package com.wizardev.mvppattern;

/**
 * Created by wizardev on 17-11-6.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
