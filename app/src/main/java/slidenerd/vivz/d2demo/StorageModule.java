package slidenerd.vivz.d2demo;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RogerParis on 09/09/16.
 */
@Module
public class StorageModule {
    private final MyApplication application;

    public StorageModule(MyApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }


}
