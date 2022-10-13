package com.brijeshsapps.ticxtactoeo;



import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;

import android.widget.ImageView;
import android.widget.Toast;


public class GridBackyard extends Activity {
    Model modelClass;
    MediaPlayer mp;
    Context context;

    public GridBackyard(Model modelClass,Context context) {
        this.modelClass = modelClass;
        this.context=context;
    }

          public void checkLinearity ( String s1, String s2, String s3){
              if (s1.equals(s2) && s2.equals(s3) && !s1.equals("")) {
                  Toast.makeText(modelClass.getContext(), s1+" won", Toast.LENGTH_SHORT).show();
                  newGame();
              }

          }
          public void newGame () {
              modelClass.setMoveCount(9);
              setTagAndResource();
              Toast.makeText(modelClass.getContext(),"Starting new game",Toast.LENGTH_SHORT).show();
          }

          public void setTagAndResource () {
              for (int i = 1; i < 10; ++i) {
                  modelClass.getImageView(i).setImageResource(R.drawable.grid_bg_2);
                  modelClass.getImageView(i).setTag("");
              }
          }


    public void Process(ImageView currView){

        if (modelClass.getFlag() == 0) {
            mp= MediaPlayer.create(modelClass.getContext(),R.raw.tap_1);
            mp.setVolume(0.4f,0.4f);
            mp.start();
            currView.setTag("X");
            currView.setImageResource(R.drawable.cross);
            modelClass.setFlag(1);
        } else if (modelClass.getFlag() == 1) {
            mp=MediaPlayer.create(modelClass.getContext(),R.raw.tap_2);
            mp.start();
            currView.setTag("O");
            currView.setImageResource(R.drawable.circle);
            modelClass.setFlag(0);
        }
        modelClass.decreamentMoveCount(1);

        if (modelClass.getMoveCount() < 5) {

            for(int i=1;i<10;++i) modelClass.setS(modelClass.getImageView(i).getTag().toString(),i);


            //Conditions
            for(int i=1;i<10;++i){
                checkLinearity(modelClass.getS(i),modelClass.getS(i+1),modelClass.getS(i+2));
                i+=2;
            }
            for(int i=1;i<4;++i){
                checkLinearity(modelClass.getS(i),modelClass.getS(i+3),modelClass.getS(i+6));
            }
            checkLinearity(modelClass.getS(3),modelClass.getS(5),modelClass.getS(7));
            checkLinearity(modelClass.getS(1),modelClass.getS(5),modelClass.getS(9));

            if(modelClass.getMoveCount()==0){
                Toast.makeText(context,"No One Won",Toast.LENGTH_SHORT).show();
               newGame();
            }
        }
    }
}


