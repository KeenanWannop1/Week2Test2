package com.example.admin.week2test;

import java.util.Arrays;

public class GenericArrayList<E> {
    private Object[] array;
    private int length;

    public GenericArrayList(int length){
        //create a new Object array of size(length)
        array = new Object[length];
        this.length = length;
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    //Set function, sets Object E value (e) at index in the array
    void set(int index, E e){
        if(array[length-1] == null)
        array[index] = e;
        else{
            Object[] tempArray;
            tempArray = array;
            new GenericArrayList((length*2));
            for(int i = 0; i < tempArray.length; i++){
                set(i, (E)tempArray[i]);
            }

        }
    }

    public static void createArray(){

    }

}
