package com.example.recyclerview.view;

import com.example.recyclerview.base.BaseView;
import com.example.recyclerview.presenter.MainPresenter;

/**
 * Created by 혜림 on 2016-11-14.
 */

public interface MainView extends BaseView<MainPresenter> {
    void makeToast(String message);
}
