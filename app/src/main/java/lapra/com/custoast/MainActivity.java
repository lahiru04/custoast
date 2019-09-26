package lapra.com.custoast;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import lapra.toast.custoast.CusToast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CusToast.makeText(MainActivity.this,"Sample Toast",CusToast.LENGTH_SHORT,R.drawable.xcon).show();

            }
        });

    }
}
