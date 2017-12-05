package in.hackdayvadodara.ganyantra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //// TODO: 5/12/17 Read from here  
        Button object = (Button) findViewById(R.id.button);

        object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Long time = System.currentTimeMillis();
             showToast("Hi nIdu" + time);
            }
        });
        //// TODO: 5/12/17 End Here

    }

    public void showToast(final String toast)
    {
        runOnUiThread(new Runnable() {
            public void run()
            {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}

