package org.zerock.test;

import java.util.Arrays;

public class Box {

    private String[] notes;
    private int current;

    public Box(int num){
        this.current = 0;
        this.notes = new String[num];

        int idx = (int)(Math.random() * num);

        for (int i = 0; i < num; i++) {
            if(i == idx){
                notes[i] ="당첨";
                continue;
            }
            notes[i] ="꽝";
        }

        System.out.println(Arrays.toString(notes));
    }

    public String getOne(){
        String result = notes[current];

        System.out.println("getOne...: " + current);

        current++;

        return result;
    }

}