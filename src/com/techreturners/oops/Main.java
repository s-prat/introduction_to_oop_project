package com.techreturners.oops;

public class Main {

    public static void main(String[] args) {

        /* Activity 1 */
        Bird myBird = new Bird("Tweety", "Yellow");
        myBird.speak();
        myBird.fly();

        /* Activity 2 */
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();

    }
}
