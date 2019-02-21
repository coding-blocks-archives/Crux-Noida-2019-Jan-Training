package com.codingblocks.lecture_18;

public class StackClient {
    public static void main(String[] args){
        Stack s1 = new DynamicStack();
        Stack s2 = new DynamicStack();

        for (int i = 0; i < 100; i++) {
            s1.push(i);
        }

        System.out.println(s1);

        try {

//            int a =  7/0;
            System.out.println(s1.pop());
            System.out.println(s1.pop());

            System.out.println(s1.pop());
            System.out.println("Kya ye hoga");

        } catch (ArithmeticException e){
            System.out.println("Ja math seekh ke aa");
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Ye bhi hona hai");

        System.out.println(s1);


    }
}
