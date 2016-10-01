package rj.kill_boredom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page12 extends AppCompatActivity {

    private static Button open121;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);
        clickopen121();
    }

    public void clickopen121() {
        open121=(Button)findViewById(R.id.bopen121);
        open121.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page121");
                        startActivity(change);
                    }
                }
        );
    }
}
