package org.ilyasse.Java_OPP.Encapsulation.Example_1;

public class A{
    protected int num;
    String name;
    int [] arr;

    public A ( int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }
    public int getNum (){
        return  num;
    }
    public void setNum (int num){
        this.num = num;
    }

}
