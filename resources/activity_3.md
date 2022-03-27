# Activity 3
## Introduction to Inheritance

## Exercise 3.1 - Introductory Reading - Inheritance

### Pillar 3 - What is 'Inheritance'?

When modelling classes using Object-Oriented Programming, we may want to have a class inherit attributes/behaviour from another class. This concept is called **inheritance**.

Just like bear cubs can inherit traits from their parents; it is the same when modelling systems. We call the (parent) class the **base** or **superclass** and any particular (child) class that inherits (i.e. extends) from this base class the **subclass**. It is often the case that the base class constitutes the most common attributes and behaviours shared by the subclasses.

In the Animal Kingdom, we can have a class hierarchy like the following:

```
Animal -> Bird -> Pigeon
```

The `Animal` class is highest in the hierarchy, so it contains the blueprint for what it means to be an `Animal`. 

The `Bird` class is a type of `Animal`, but is more **specific** and defines the attributes and behaviours most common to Birds. A `Pigeon` is a type of `Bird` and it's even more specific.

---

## Exercise 3.2 - Representing inheritance in class diagrams & the Unified Modelling Language (UML)

- Can you do some research to find out how to represent inheritance in Class Diagrams?

- Draw a diagram to show a `Pigeon` subclass extending the base class `Bird`

- The `Pigeon` class will inherit the following attributes and methods from the `Bird` class:

- Name
- Color
- Speak
- Fly

- In addition to this, the `Pigeon` will also have a method called `EatPizza`, without a return data type as when the method is called, it will write an output string to the console. Only the `Pigeon` can `EatPizza`.

You can use pen and paper or any digital drawing tool you prefer.

An example solution to the diagram is available [here](../solutions/activity_3_exercise_3.2.png).

---

## Exercise 3.3 - Translate the class diagram into code to create a subclass `Pigeon` class which extends the base class `Bird`

In your existing Java Console (Command Line) Application Project:

- Add an empty class called `Pigeon`
- Add the following code to make the `Pigeon` extend base class `Bird`
- Add the method `EatPizza` to `Pigeon`

```java

//The Pigeon extends the base class Bird
public class Pigeon extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String color) {
        super(name, color);
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }
}

```

---

## Exercise 3.4 - Run your console application

- Add the following code to the `main` method in the `Main` class beneath your code from Activity 2.

```java

Pigeon pippa = new Pigeon("Pippa", "Grey");
pippa.speak();
pippa.fly();
pippa.eatPizza();

```

- Run your console application. You should see the following output to your console.

```

My name is Tweety and I am a Yellow bird.
I'm Tweety and I can fly high in the blue sky!
My name is Pippa and I am a Grey bird.
I'm Pippa and I can fly high in the blue sky!
Delicious pizza!

```

Pigeon has inherited methods and properties from Bird!

---

## Optional Challenge

- Can you add another method on the `Pigeon` class called `Sleep` that writes the following string to the console `"I'm a sleeping pigeon"`?

<details>
<summary>Click here to see the solution</summary>
<pre>

```java

public class Pigeon extends Bird {

    public Pigeon(String name, String color) {
        super(name, color);
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }

    public void Sleep() {
        System.out.println("I'm a sleeping pigeon");
    }
}

```

</pre>
</details>

---

### What's next?

Wouldn't it be nice to have more flexibility for subclasses to implement methods how they like. Head over to [Introduction to Polymorphism in Activity 4](./activity_4.md) to learn more.

---

### Key Study Notes

- *Inheritance* - We call the (parent) class the **base** or **superclass** and any particular (child) class that inherits (i.e. extends) from this base class the **subclass**. This is like Bear cubs inheriting traits from their parents.