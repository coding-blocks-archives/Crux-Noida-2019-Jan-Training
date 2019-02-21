package com.codingblocks.lecture_18;

public class DynamicQueue extends Queue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int n){
        super(n);
    }

    @Override
    public boolean insert(int value) {

        if (isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i + front) % data.length];
            }

            // reset front and end
            front = 0;
            end = data.length - 1;

            data = temp;
        }


        return super.insert(value);
    }
}
