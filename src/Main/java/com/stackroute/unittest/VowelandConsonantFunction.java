package com.stackroute.unittest;

public class VowelandConsonantFunction {
    public String vowelConsonant(String s){
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U'|| s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u')
            {
                temp+= "vowel"+" ";
            }
            else
            {
                temp+="consonant"+" ";
            }
        }
        return temp;
    }
}
