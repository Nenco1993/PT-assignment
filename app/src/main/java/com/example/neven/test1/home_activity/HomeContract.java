package com.example.neven.test1.home_activity;

import com.example.neven.test1.base.base_presenter.BasePresenter;
import com.example.neven.test1.base.base_view.BaseView;
import com.example.neven.test1.home_activity.models.PagerStuff;

import java.util.List;

/**
 * Created by Neven on 5.9.2017..
 */

public interface HomeContract {

    interface View extends BaseView {

        void showMyData(List<PagerStuff> listPagerStuff);

    }

    interface Presenter extends BasePresenter {

    }
}
