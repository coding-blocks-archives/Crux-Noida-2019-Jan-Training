package com.codingblocks.lecture_18;

public class StackClient {
    public static void main(String[] args){
        Stack s1 = new Stack();
        Stack s2 = new Stack();

        s1.push(45);
        s1.push(456);

        s2.push(4563);

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


    }
}
