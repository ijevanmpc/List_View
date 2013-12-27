package com.mpci.list_view;


public class Contact {



    //private variables
    int _id;
    String _name;
    String _age;
    int _img;

    // Empty constructor
    public Contact(){

    }
    // constructor
    public Contact(int id, String name, String age, int img){
        this._id = id;
        this._name = name;
        this._age = age;
        this._img = img;
    }

    // constructor
    public Contact(String name, String age, int img){
        this._name = name;
        this._age = age;
        this._img = img;
    }
    // getting ID
    public int getID(){
        return this._id;
    }

    // setting id
    public void setID(int id){
        this._id = id;
    }

    // getting name
    public String getName(){
        return this._name;
    }

    // setting name
    public void setName(String name){
        this._name = name;
    }

    // getting age
    public String getAge(){
        return this._age;
    }

    // setting age
    public void setAge(String age){
        this._age = age;
    }
    // getting image
    public int getImg(){
        return this._img;
    }

    // setting image
    public void setImg(int img){
        this._img = img;
    }

}