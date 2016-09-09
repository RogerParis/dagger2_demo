package slidenerd.vivz.d2demo;

import android.app.Application;

/**
 * Created by vivz on 11/09/15.
 */
public class MyApplication extends Application{

    StorageComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerStorageComponent
                .builder()
                .storageModule(new StorageModule(this))
                .build();
    }

    public StorageComponent getComponent() {
        return component;
    }
}
