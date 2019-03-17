package com.kkaty.mvpdagger.view;

import android.app.Application;
import android.content.Context;

import com.kkaty.mvpdagger.di.component.AppComponent;

public class InitApplication extends Application {

    private AppComponent component;

    public static InitApplication get(Context context) {
        return (InitApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();}}