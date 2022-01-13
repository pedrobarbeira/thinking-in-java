package com.interfaces.pckg.exercise11;

import com.interfaces.pckg.exercise5.Interface;

abstract class Shifter{

    public abstract String shift(String input);

}

public class Swapper extends Shifter{
    public String shift(String input){
        char c;
        char[] line = input.toCharArray();
        for(int i = 0; i < line.length -1; i+=2){
            c = line[i];
            line[i] = line[i+1];
            line[i+1] = c;
        }
        return new String(line);
    }
}
