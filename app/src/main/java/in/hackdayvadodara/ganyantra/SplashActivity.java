package in.hackdayvadodara.ganyantra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    int splashTime = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashThread();
    }

    public void splashThread(){}{

        Thread thread = new Thread(){
            @Override
            public void run() {
                int waitedTime = 0;
                try{
                    while (waitedTime<splashTime){
                        sleep(100);
                        waitedTime = waitedTime +100;
                    }
                }catch (Exception e){

                }finally {
                    Intent intent = new Intent(SplashActivity.this,CalculateAcitivity.class);
                    startActivity(intent);
                    finish();
                }
                super.run();

            }
        };

        thread.start();
    }
}
