package in.hackdayvadodara.ganyantra;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    int splashTime = 1000;
    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView = (TextView) findViewById(R.id.equalsTx);
        textView1 = (TextView) findViewById(R.id.text);

        Typeface customTypeFace =  Typeface.createFromAsset(getAssets(),"fonts/Lato-Bold.ttf");
        textView1.setTypeface(customTypeFace);
        splashThread();

    }

    public void splashThread(){}

    {
//
        Thread thread = new Thread() {
            @Override
            public void run() {
                int waitedTime = 0;
                try {
                    while (waitedTime < splashTime) {
                        sleep(100);
                        waitedTime = waitedTime + 100;
                    }
                } catch (Exception e) {

                } finally {
                    Intent intent = new Intent(SplashActivity.this, CalculateAcitivity.class);
//                    ActivityOptionsCompat options = ActivityOptionsCompat.
//                            makeSceneTransitionAnimation(getParent(), (View)textView, "profile");
//                    startActivity(intent,options.toBundle());
                    startActivity(intent);
                    finish();
                }
                super.run();

            }
        };

        thread.start();
    }
}
