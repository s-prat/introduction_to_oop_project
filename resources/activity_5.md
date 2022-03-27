# Activity 5
## Introduction to Interfaces

## Exercise 5.1 - Introductory Reading - Interfaces

### What is 'Multiple inheritance'?

Multiple inheritance is a programming concept where a subclass can inherit from more than one parent class. This can be useful as there might be many subclasses, that want some or all of various parent classes members or behaviours. However! Be aware! This can lead to something called the **Diamond Problem** where the same state or behaviour is defined in multiple parent classes, so the subclass doesn't know which one to inherit from. 🐛

**Java doesn't support multiple inheritance. A subclass can only inherit from one base class.**

### What is an 'Interface'?

**Interfaces were invented as a way of defining the things an object can do i.e. their jobs**
- Interfaces are a way of getting round the Diamond of Death issue. If there is behaviour you would like many classes to implement, you can create an interface.

- Interfaces were invented as a way of defining the things an object can do i.e. their jobs. Another benefit is it lets unrelated classes do the same job.

- For example, if we had a `Person` class and subclasses of `Mum`, `Developer`, `Chef` and they are unrelated; but we wanted all of them to be able to sing then we can make an interface containing the method name for `sing()`. It is up to the `Mum`, `Developer` and `Chef` to sing in their own ways.

- This essentially means any class that implements an interface *must* implement *all* of the members defined in the interface. A 'contract' is also a term used to describe interfaces. This means that developers can have a higher degree of control on setting restrictions on what the classes implementing an interface must do.

**A class can only inherit from a *single* base class, but a class can implement *many* interfaces.**

- Interfaces can help keep code D.R.Y (don't repeat yourself)
If many classes share a behaviour, you can abstract this class into an interface. This saves repetition in your code.

---

## Exercise 5.1 - Representing interfaces in Unified Modelling Language (UML) diagrams

- Can you do some research to find out how to represent interfaces in UML diagrams?

- Draw a diagram to show the `Bird` class implementing the interface `Dance`

- The `Dance` interface contains the following methods that classes implementing the interface will provide an implementation for:

- Spin
- DoTheCaterpillar
- Jump

You can use pen and paper or any digital drawing tool you prefer.

An example solution to the diagram is available [here](../solutions/activity_5_exercise_5.1.png).

---

## Exercise 5.2 - Create an interface `Dance`

Let's use an interface to add some cool dance moves functionality to our existing `Bird` class so that all the subclasses that inherit `Bird` class can do some dancing too.

In your Java Console (Command Line) Application Project:

- Add an interface called `Dance`

```java

public interface Dance {

    void spin();
    void doTheCaterpillar();
    void jump();

}

```

## Exercise 5.3 - Implement the interface `Dance` in Bird

Let's make our existing `Bird` class implement the interface `Dance`.

- Implement `Dance` in the `Bird` class

```java

public abstract class Bird implements Dance {

    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public abstract void speak();

    public void fly() {
        System.out.println("Hi there! I can fly.");
    }

    public void spin() {
        System.out.println(name + " spin!");
    }

    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    public void jump() {
        System.out.println(name + " jump in the air!");
    }
}

```

---

## Exercise 5.4 - Run your console application

- Add the following code to the `main` method in the `Main` class beneath your existing code for pippa the `Pigeon`.

```java

pippa.spin();
pippa.doTheCaterpillar();
pippa.jump();

```

- Add the following code to the `main` method in the `Main` class beneath your existing code for pingu the `Penguin`.

```java

pingu.spin();
pingu.doTheCaterpillar();
pingu.jump();

```

- Run your console application. You should see the following output to your console.

```

Yo! I'm Pippa and I'm a Grey pigeon.
Hi there! I can fly.
Delicious pizza!
Pippa spin!
Pippa do the wriggly woo!
Pippa jump in the air!
Hi! I'm Pingu and I'm a Black & White penguin.
Whoops, I can't fly. Waddle waddle.
Pingu spin!
Pingu do the wriggly woo!
Pingu jump in the air!

```
---

### What's next?

Your learning journey doesn't stop here! Feel free to head back to review the concepts again. We encourage you to do some of your own research and experimentation in your own time to explore these concepts further.

---

### Key Study Notes

- *Interfaces* - invented as a way of defining the things objects can do i.e. their jobs. Any class that implements an interface must implement all of the members defined in the interface.