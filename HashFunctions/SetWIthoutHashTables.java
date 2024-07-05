package ProblemSolving.HashFunctions;

import java.util.HashMap;

public class SetWIthoutHashTables {
    class MyHashSet {

        boolean[] hash;

        public MyHashSet() {
            hash = new boolean[1000001];
        }

        public void add(int key) {
            hash[key] = true;
        }

        public void remove(int key) {
            hash[key] = false;
        }

        public boolean contains(int key) {
            return hash[key];
        }
    }


    class MyHashSetMap {
        HashMap<Integer , String> map ;

        public MyHashSetMap() {
            map = new HashMap<>();
        }

        public void add(int key) {
            map.put(key , "Present");
        }

        public void remove(int key) {
            map.remove(key);
        }

        public boolean contains(int key) {
            return map.containsKey(key);
        }
    }
}
