package by.it.group551002.rybik.lesson13;

import java.util.*;

public class GraphA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] objs = str.split(",");

        Map<String, List<String>> graph = new HashMap<>();
        char smallestKey = 255;

        for ( String elem : objs) {
            int i = 0;
            if (elem.charAt(i) == ' ') i++;

            if (elem.charAt(i) < smallestKey) smallestKey = elem.charAt(i);

            if ( graph.containsKey(elem.charAt(i)) ){
                graph.get(elem.charAt(i)) .add( String.valueOf(elem.charAt(i + 4)) );
            } else {
                graph.put( String.valueOf(elem.charAt(i)),
                        Collections.singletonList(String.valueOf(elem.charAt(i + 4))));
            }
        }

        Deque<Character> deque = new ArrayDeque<>();



    }


    private void dfs(Map<String, List<String>> graph, Deque<Character> deque,
                     char smallestKey){



        while (true){

        }

    }



}
