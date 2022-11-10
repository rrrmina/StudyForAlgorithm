package MA.Practice.week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P9934 {
    static class Node {
        private int node;
        private int left;
        private int right;

        public Node(int node, int left, int right) {
            this.node = node;
            this.left = left;
            this.right = right;
        }

        public int getNode() {
            return node;
        }

        public int getLeft() {
            return left;
        }

        public int getRight() {
            return right;
        }

        public void setNode(int node) {
            this.node = node;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public void setRight(int right) {
            this.right = right;
        }
    }

    static class City implements Comparable<City> {
        private int inputPath;
        private int makePath;

        public City(int inputPath, int makePath) {
            this.inputPath = inputPath;
            this.makePath = makePath;
        }

        public int getInputPath() {
            return inputPath;
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.makePath, o.makePath);
        }
    }

    private static Stack<Integer> path, makePath;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        path = new Stack<>();
        makePath = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Node> tree = new HashMap<>();
        for (int node = 1; node < (int) Math.pow(2, n); node++) {
            tree.put(node, new Node(node, 0, 0));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int loop = 1; loop < (int) Math.pow(2, n); loop++) {
            path.push(Integer.parseInt(st.nextToken()));
        }
        for(int level = 1; level < n; level++) {
            for(int node = (int) Math.pow(2, level); node < (int) Math.pow(2, level+1); node++) {
                if(node % 2 == 0) tree.get(node / 2).setLeft(node);
                else tree.get(node / 2).setRight(node);
            }
        }
        inorder(1, tree);
        makeCity(n);
        br.close();
    }

    private static void makeCity(int n) {
        List<City> city = new ArrayList<>();
        while(!path.isEmpty() && !makePath.isEmpty()) {
            city.add(new City(path.pop(), makePath.pop()));
        }
        Collections.sort(city);
        int index = 1;
        int level = 1;
        for (City c : city) {
            System.out.print(c.getInputPath()+" ");
            if(index == (int) Math.pow(2, level)-1) {
                System.out.println();
                level++;
            }
            index++;
        }
    }

    private static void inorder(int node, Map<Integer, Node> tree) {
        if(node == 0) return;
        inorder(tree.get(node).getLeft(), tree);
        makePath.push(node);
        inorder(tree.get(node).getRight(), tree);
    }
}
