package rj.changeactivity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    private static Button open2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickopen2();
    }

    public void clickopen2() {
        open2=(Button)findViewById(R.id.button);
        open2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.changeactivity1.Main2Activity");
                        startActivity(change);
                    }
                }
        );
    }
}
