package rj.kill_boredom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity {

    private static Button open11;
    private static Button open12;
    private static Button open13;
    private static Button open14;
    private static Button open15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        clickopen11();
    }

    public void clickopen11() {
        open11=(Button)findViewById(R.id.bopen11);
        open11.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page11");
                        startActivity(change);
                    }
                }
        );
    }
}
