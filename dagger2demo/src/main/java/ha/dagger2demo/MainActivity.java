package ha.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.txt)
    TextView textView;

    private ActivityComponent activityComponent;

    @Inject
    UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityComponent=DaggerActivityComponent.builder()
                .activityModule(new ActivityModule()).build();
        activityComponent.inject(this);
        ButterKnife.inject(this);

        userModel.setUserName("w--t--f--");
        userModel.setUserPass("I--d'n--kn");

        textView.setText(userModel.getUserName()+"---------->"+userModel.getUserPass());
    }
}
