package com.brijeshsapps.ticxtactoeo;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

public class Play_Grid extends AppCompatActivity{

    ImageView[] btn= new ImageView[10];
    Model modelClass;

    GridBackyard gridBackyard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_grid);
        modelClass=new Model(null,0,9,0,this);
        gridBackyard=new GridBackyard(modelClass,this);
        IDinitialization();
    }
    private void IDinitialization(){

        btn[1]=findViewById(R.id.btn1);
        btn[2]=findViewById(R.id.btn2);
        btn[3]=findViewById(R.id.btn3);
        btn[4]=findViewById(R.id.btn4);
        btn[5]=findViewById(R.id.btn5);
        btn[6]=findViewById(R.id.btn6);
        btn[7]=findViewById(R.id.btn7);
        btn[8]=findViewById(R.id.btn8);
        btn[9]=findViewById(R.id.btn9);

       for(int i=1;i<10;++i){
           modelClass.setImageView(btn[i],i);
           modelClass.getImageView(i).setTag("");
       }

    }


    public void process(View view) {
        ImageView currView = (ImageView) view;
        if (currView.getTag().toString().equals("")){
            gridBackyard.Process(currView);
        }
    }


}