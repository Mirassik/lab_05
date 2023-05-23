public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> b_tree = new BinarySearchTree<>();
        b_tree.put(1, "One");
        b_tree.put(2, "Two");
        b_tree.put(3, "Three");
        b_tree.put(4, "Four");
        b_tree.put(5, "Five");
        for (BinarySearchTree.Entry<Integer,String> entry : b_tree){
            System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
        }
        b_tree.delete(3);
        System.out.println("Binary tree after delete");
        for (BinarySearchTree.Entry<Integer,String> entry : b_tree){
            System.out.println("Key is " + entry.getKey() + " and value is " + entry.getValue());
        }

            int height = b_tree.getHeight();
            System.out.println("" + "____________________________Height of the tree: " + (height-1));
        }
    }