package com.gemvietnam.timekeeper.login;

/**
 * Created by Stork on 19/09/2016.
 */
public class CowTest {
    Cow cow = new Cow("Mr.Cuong","60kg");
    System.out.println("My name is: " + cow.getmName());
    System.out.println("My weight is: " + cow.getmWeight());
    System.out.println("When i'm hungry, i make sound like: " + cow.makeSound());
}
