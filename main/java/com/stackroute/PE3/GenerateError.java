package com.stackroute.PE3;

public class GenerateError {
    public static void main(String[] args) {
        String temp="";
        try{
            throw new NegativeArraySizeException();
        }
        catch(NegativeArraySizeException e1){
            temp=e1.toString();
        }

        try{
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e2){
            temp=e2.toString();
        }

        try{
            throw new NullPointerException();
        }
        catch(NullPointerException e3){
            temp=e3.toString();
        }
    }
}
