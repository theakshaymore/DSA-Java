# ArrayList Notes

## Overview

- **ArrayList** is a resizable array implementation of the `List` interface in Java.
- It allows for dynamic arrays that can grow as needed.
- It is part of the `java.util` package.

## Key Features

- **Resizable**: Automatically grows and shrinks as elements are added or removed.
- **Indexed Access**: Provides fast, random access to elements using an index.
- **Ordered**: Maintains the order of insertion.
- **Allows Duplicates**: Can contain duplicate elements.

## When to Use

- **Use `ArrayList`** when you need a resizable array with fast random access.
- **Avoid using `ArrayList`** for frequent insertions and deletions from the middle of the list; use `LinkedList` instead for such scenarios.

## Common Methods

- `add(E e)`: Appends the specified element to the end of the list.
- `add(int index, E element)`: Inserts the specified element at the specified position in the list.
- `get(int index)`: Returns the element at the specified position in the list.
- `set(int index, E element)`: Replaces the element at the specified position in the list with the specified element.
- `remove(int index)`: Removes the element at the specified position in the list.
- `size()`: Returns the number of elements in the list.
- `clear()`: Removes all of the elements from the list.

## Example Usage

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Accessing elements
        System.out.println(list.get(0)); // Output: Element 1

        // Modifying elements
        list.set(1, "Modified Element 2");

        // Removing elements
        list.remove(2);

        // Iterating through the list
        for (String element : list) {
            System.out.println(element);
        }
    }
}
```
