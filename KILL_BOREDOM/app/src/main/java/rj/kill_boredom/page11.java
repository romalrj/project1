package rj.kill_boredom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page11 extends AppCompatActivity {

    private static Button open111;
    private static Button open112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        clickopen111();
        clickopen112();
    }

    public void clickopen111() {
        open111=(Button)findViewById(R.id.bopen111);
        open111.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page111");
                        startActivity(change);
                    }
                }
        );
    }


    public void clickopen112() {
        open112=(Button)findViewById(R.id.bopen112);
        open112.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page112");
                        startActivity(change);
                    }
                }
        );
    }
}
