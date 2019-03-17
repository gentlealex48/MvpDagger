package com.kkaty.mvpdagger.di.module;

import com.kkaty.mvpdagger.view.InitApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private InitApplication initApplication;

    public AppModule(InitApplication initApplication) {
        this.initApplication = initApplication;
    }

    @Provides
    @Singleton
    public InitApplication provideApplication() {
        return initApplication;
    }
}