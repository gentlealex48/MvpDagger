

package com.kkaty.mvpdagger.di.module;


import com.kkaty.mvpdagger.model.Model;
import com.kkaty.mvpdagger.presenter.MainPresenterImpl;
import com.kkaty.mvpdagger.view.MainContract;


import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {

    private MainContract.ViewCallBack viewCallBack;

    public MvpModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Provides
    public MainContract.ViewCallBack provideView() {
        return viewCallBack;
    }

    @Provides
    public MainContract.PresenterCallBack providePresenter(MainContract.ViewCallBack view, Model model) {
        return new MainPresenterImpl(view, model);
    }
}
