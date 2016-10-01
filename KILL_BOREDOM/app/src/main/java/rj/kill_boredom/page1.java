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
        clickopen12();
        clickopen13();
        clickopen14();
        clickopen15();
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

    public void clickopen12() {
        open12=(Button)findViewById(R.id.bopen12);
        open12.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page12");
                        startActivity(change);
                    }
                }
        );
    }

    public void clickopen13() {
        open13=(Button)findViewById(R.id.bopen13);
        open13.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page13");
                        startActivity(change);
                    }
                }
        );
    }

    public void clickopen14() {
        open14=(Button)findViewById(R.id.bopen14);
        open14.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page14");
                        startActivity(change);
                    }
                }
        );
    }

    public void clickopen15() {
        open15=(Button)findViewById(R.id.bopen15);
        open15.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent change= new Intent("rj.kill_boredom.page15");
                        startActivity(change);
                    }
                }
        );
    }
}
