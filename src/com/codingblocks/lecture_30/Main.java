package com.codingblocks.lecture_30;

public class Main {
    public static void main(String[] args) {
        Singleton item = Singleton.getInstance();

        System.out.println(item.hashCode());

        Singleton second = Singleton.getInstance();

        System.out.println(second.hashCode());

        Logger.getInstance().log("Hello i am here");

        Logger.getInstance().log("Hello i am here again");

        Logger.getInstance().log("Koi deewana kahta hai koi pagal ");

    }
}
