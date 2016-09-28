package ha.dagger2demo;

import dagger.Component;

/**
 * Created by yuexi on 2016/9/27.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
