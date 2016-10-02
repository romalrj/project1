package rj.kill_boredom;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class page1211 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1211);
        TextView t1 = (TextView)findViewById(R.id.result);
    }


    public void oncheckClick(View v) {
        EditText n11 = (EditText)findViewById(R.id.n11);
        EditText n12 = (EditText)findViewById(R.id.n12);
        EditText n13 = (EditText)findViewById(R.id.n13);
        EditText n14 = (EditText)findViewById(R.id.n14);
        EditText n21 = (EditText)findViewById(R.id.n21);
        EditText n22 = (EditText)findViewById(R.id.n22);
        EditText n23 = (EditText)findViewById(R.id.n23);
        EditText n24 = (EditText)findViewById(R.id.n24);
        EditText n31 = (EditText)findViewById(R.id.n31);
        EditText n32 = (EditText)findViewById(R.id.n32);
        EditText n33 = (EditText)findViewById(R.id.n33);
        EditText n34 = (EditText)findViewById(R.id.n34);
        EditText n41 = (EditText)findViewById(R.id.n41);
        EditText n42 = (EditText)findViewById(R.id.n42);
        EditText n43 = (EditText)findViewById(R.id.n43);
        EditText n44 = (EditText)findViewById(R.id.n44);



        int a11 = Integer.parseInt(n11.getText().toString());
        int a12 = Integer.parseInt(n12.getText().toString());
        int a13 = Integer.parseInt(n13.getText().toString());
        int a14 = Integer.parseInt(n14.getText().toString());
        int a21 = Integer.parseInt(n21.getText().toString());
        int a22 = Integer.parseInt(n22.getText().toString());
        int a23 = Integer.parseInt(n23.getText().toString());
        int a24 = Integer.parseInt(n24.getText().toString());
        int a31 = Integer.parseInt(n31.getText().toString());
        int a32 = Integer.parseInt(n32.getText().toString());
        int a33 = Integer.parseInt(n33.getText().toString());
        int a34 = Integer.parseInt(n34.getText().toString());
        int a41 = Integer.parseInt(n41.getText().toString());
        int a42 = Integer.parseInt(n42.getText().toString());
        int a43 = Integer.parseInt(n43.getText().toString());
        int a44 = Integer.parseInt(n44.getText().toString());


        if ((a11==4)&&(a21==1)&&(a31==3)&&(a41==2)&&(a12==2)&&(a22==3)&&(a32==4)&&(a42==1)&&(a13==1)&&(a23==4)&&(a33==2)&&(a43==3)&&(a14==3)&&(a24==2)&&(a34==1)&&(a44==4)){
            Context context = getApplicationContext();
            CharSequence text = "WELL DONE!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "INCORRECT. KEEP GOING..";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }



    }
}
