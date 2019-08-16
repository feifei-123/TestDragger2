package com.example.testdragger2.search;

public class FlowerBean {
    public FlowerBean(String n,String c){
        this.name = n;
        this.color = c;
    }
    public String name;
    public String color;

    @Override
    public String toString(){
        return "name:"+name+",color:"+color;
    }
}
