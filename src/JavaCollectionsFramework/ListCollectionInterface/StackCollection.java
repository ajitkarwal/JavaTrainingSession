package JavaCollectionsFramework.ListCollectionInterface;

import java.util.Stack;

public class StackCollection { // Stack is child class of Vector Class. so it does not implements
                                //List Interface

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        s.push(3);
        s.push(6);
        s.push(9);
        System.out.println(s);
        System.out.println(s.size());

        System.out.println(s.get(2));//element at index 2

        s.add(2,5);// pushes element in stack at position 2. output = [3, 6, 5, 9]
        System.out.println(s);
    }
}
