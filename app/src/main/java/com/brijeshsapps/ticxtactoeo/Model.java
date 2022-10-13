package com.brijeshsapps.ticxtactoeo;

import android.content.Context;
import android.widget.ImageView;

public class Model {
    String[] s=new String[10];
    int moveCount,flag;

    ImageView[] imageView=new ImageView[10];
    Context context;


    public Model(String ss, int i, int moveCount, int flag,Context context) {
        this.s[i] = ss;
        this.moveCount = moveCount;
        this.flag = flag;
        this.context=context;
    }

    public String getS(int i) {
        return s[i];
    }

    public void setS(String s, int pos) {
        this.s[pos] = s;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public void decreamentMoveCount(int decreament) { this.moveCount=moveCount-decreament; }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public ImageView getImageView(int i) {
        return imageView[i];
    }

    public void setImageView(ImageView imageView,int i) {
        this.imageView[i] = imageView;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
