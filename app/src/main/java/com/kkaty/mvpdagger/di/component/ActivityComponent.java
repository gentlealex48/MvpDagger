package com.kkaty.mvpdagger.di.component;


import com.kkaty.mvpdagger.di.module.MvpModule;
import com.kkaty.mvpdagger.di.scope.ActivityScope;
import com.kkaty.mvpdagger.view.MainActivity;
import com.kkaty.mvpdagger.view.MainContract;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MvpModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    MainContract.PresenterCallBack getMainPresenter();
}