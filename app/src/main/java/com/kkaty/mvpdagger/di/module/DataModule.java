package com.kkaty.mvpdagger.di.module;

import com.kkaty.mvpdagger.model.Model;

import dagger.Module;
import dagger.Provides;
@Module
public class DataModule {

    @Provides
    public Model provideModelClass() {
        return new Model();
    }
}