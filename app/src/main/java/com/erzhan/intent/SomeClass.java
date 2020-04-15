package com.erzhan.intent;

import android.widget.ImageView;


import java.io.Serializable;

public class SomeClass implements Serializable {
    String title;
    String description;
    ImageView image;

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public ImageView getImage() {
          return image;
     }

     public void setImage(ImageView image) {
          this.image = image;
     }
}

