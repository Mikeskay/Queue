package queue.test;

import queue.base.QueueDemo;
import java.util.*;

public class QueueDemoTest {


    public static void main(String[] args) {

        QueueDemo<String> games = new QueueDemo <String>();

        String game1 = "Fifa 21";
        String game2 = "Fifa 22";
        String game3 = "Fifa 23";

        games.enqueue(game1);
        games.enqueue(game2);
        games.enqueue(game3);

        System.out.println(games);
        //System.out.println( games.tail());
        System.out.println( games);
       
        QueueDemo<Integer> numbers = new QueueDemo <Integer>();

        Integer numbers1 = 1;
        Integer numbers2 = 2;
        Integer numbers3 = 3;

        numbers.enqueue(numbers1);
        numbers.enqueue(numbers2);
        numbers.enqueue(numbers3);

        System.out.println(numbers);
        //System.out.println( numbers.tail());
        System.out.println( numbers);

    
    }
    
}
