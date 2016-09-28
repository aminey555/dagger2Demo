package ha.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yuexi on 2016/9/27.
 */
@Module
public class ActivityModule {

    @Provides
    UserModel provideUserModel(){
        return new UserModel();
    }

}
