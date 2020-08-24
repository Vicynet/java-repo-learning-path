package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CopyReverseLinkedList {
// (Copying and Reversing LinkedLists) Write a program that creates a LinkedList object of
//10 characters, then creates a second LinkedList object containing a copy of the first list,
// but in reverse order.

    public static void main(String[] args) {
        Character[] mainCharacter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        List<Character> mainList = new LinkedList<>(Arrays.asList(mainCharacter));
        Collections.reverse(mainList);
        List<Character> copyList = mainList;
        System.out.println(copyList);
    }
}
