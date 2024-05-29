/*2.Write a program using ArrayDeque to add book names and add,
delete the values from both ends of que.*/

import java.util.ArrayDeque;

public class BookDequeExample 
{
    public static void main(String[] args) 
	{
        // Create an ArrayDeque to store book names
        ArrayDeque<String> bookDeque = new ArrayDeque<>();

        // Adding book names to the front of the deque
        bookDeque.addFirst("Book 1");
        bookDeque.addFirst("Book 2");
        bookDeque.addFirst("Book 3");

        // Adding book names to the end of the deque
        bookDeque.addLast("Book 4");
        bookDeque.addLast("Book 5");

        // Print all book names
        System.out.println("Books in the deque:");
        for (String book : bookDeque) 
		{
            System.out.println(book);
        }

        // Remove a book from the front of the deque
        String removedBookFront = bookDeque.removeFirst();
        System.out.println("Removed book from the front: " + removedBookFront);

        // Remove a book from the end of the deque
        String removedBookEnd = bookDeque.removeLast();
        System.out.println("Removed book from the end: " + removedBookEnd);

        // Print all book names after removals
        System.out.println("Books in the deque after removals:");
        for (String book : bookDeque) 
		{
            System.out.println(book);
        }
    }
}
