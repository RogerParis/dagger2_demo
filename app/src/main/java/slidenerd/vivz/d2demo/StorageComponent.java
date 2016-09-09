package slidenerd.vivz.d2demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by RogerParis on 09/09/16.
 */
@Singleton
@Component(modules = StorageModule.class)
public interface StorageComponent {
    void inject(FragmentA fragmentA);

    void inject(FragmentB fragmentB);
}
