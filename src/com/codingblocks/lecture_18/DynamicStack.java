package com.codingblocks.lecture_18;

public class DynamicStack extends Stack {

    public DynamicStack(){
        super();
    }


    @Override
    public void push(int value) {

        if (isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        super.push(value);
    }
}
