package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
    public static <E> void displayTree(String msg, Tree<E> t) {
        System.out.println("\n\n" + msg);
        t.display();
    }

    public static <E> void displayTreeElements(String msg, Tree<E> t) {
        System.out.println("\n\n" + msg);
        for (E element : t)
            System.out.println(element);

    }

    public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() {
        LinkedTree<Integer> t = new LinkedTree<>();
        t.addRoot(4);
        t.addChild(t.root(),9);
        t.addChild(t.root(),20);
        for(Position<Integer> f: t.children(t.root())){
            if(f.getElement()==9){
                t.addChild(f,7);
                t.addChild(f,10);
            }else if(f.getElement() == 20){
                t.addChild(f,15);
                t.addChild(f,21);
                for(Position<Integer> d: t.children(f)){
                    if(d.getElement()==15){
                        t.addChild(d,12);
                        Position<Integer> c =t.addChild(d,17);
                        t.addChild(c,19);
                    }else if(d.getElement()==21){
                        Position<Integer> c =t.addChild(d,40);
                        t.addChild(c,30);
                        t.addChild(c,45);
                    }
                }
            }
        }

        return t;
    }

    public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() {
        LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>();
        t.addRoot(4);

        t.addRight(t.root(),20);
        t.addLeft(t.root(),9);

        t.addRight(t.left(t.root()),10);
        t.addLeft(t.left(t.root()),7);

        t.addRight(t.right(t.root()),21);
        t.addLeft(t.right(t.root()),15);

        t.addRight(t.right(t.right(t.root())),40);
        t.addRight(t.left(t.right(t.root())),17);
        t.addLeft(t.left(t.right(t.root())),12);

        t.addLeft(t.right(t.left(t.right(t.root()))),19);

        t.addRight(t.right(t.right(t.right(t.root()))),45);
        t.addLeft(t.right(t.right(t.right(t.root()))),30);






        return t;
    }


}
