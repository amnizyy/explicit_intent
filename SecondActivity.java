package mobile.example.labtask2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends Activity{
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        TextView tv = new TextView(this);
        tv.setText("Second Activity");
        setContentView(R.layout.second_activity);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");

        Toast.makeText(getApplicationContext(),"Values are :\n First value:" +value1+"\n Second Value: " +value2,Toast.LENGTH_LONG).show();
        Button button1 = (Button)findViewById(R.id.button01);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}
