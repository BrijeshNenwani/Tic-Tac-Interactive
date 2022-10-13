package com.brijeshsapps.ticxtactoeo;

import android.nfc.Tag;

public class ImageTag {
    Tag t;
    String imageId;

    public ImageTag(Tag t, String imageId) {
        this.t = t;
        this.imageId = imageId;
    }

    public Tag getT() {
        return t;
    }

    public void setT(Tag t) {
        this.t = t;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
