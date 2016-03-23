package com.example.avinashke1.card123;

/**
 * Created by avinash on 22/3/16.
 */
public class Product {
    private String imgUrl;
    private String name;
    private int age;
    public Product(){}

    public Product(String name, int age, String imgUrl){
        this.name = name;
        this.age = age;
        this.imgUrl = imgUrl;
    }

    public String getImgUrl(){
        return imgUrl;
    }

    public void setImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
    }

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


}

