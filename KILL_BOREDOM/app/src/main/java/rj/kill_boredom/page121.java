package rj.kill_boredom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page121 extends AppCompatActivity {

    private static Button open1211;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page121);
        clickopen1211();
    }

    public void clickopen1211() {
        open1211=(Button)findViewById(R.id.bopen1211);
        open1211.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page1211");
                        startActivity(change);
                    }
                }
        );
    }
}
