package com.lee.jirayut.authorizefirebase;

/**
 * Created by macbook on 15/3/2018 AD.
 */

public class ViewSingleItem {
    private String Image_URL, Image_Title;

    public ViewSingleItem(){

    }

    public ViewSingleItem(String url, String title){
        this.Image_URL = url;
        this.Image_Title = title;
    }

    public String getImage_URL(){
        return this.Image_URL;
    }

    public void setImage_URL(String image_URL){
        Image_URL = image_URL;
    }

    public String getImage_Title(){
        return this.Image_Title;
    }

    public void setImage_Title(String image_Title) {
        Image_Title = image_Title;
    }
}
