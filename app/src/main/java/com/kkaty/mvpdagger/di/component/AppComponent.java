package com.kkaty.mvpdagger.di.component;


import android.content.Context;

import com.kkaty.mvpdagger.di.module.AppModule;
import com.kkaty.mvpdagger.di.module.ContextModule;
import com.kkaty.mvpdagger.di.module.DataModule;
import com.kkaty.mvpdagger.view.InitApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, ContextModule.class})
public interface AppComponent {
    void inject(InitApplication initApplication);

    Context getContext();}
