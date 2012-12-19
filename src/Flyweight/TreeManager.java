package Flyweight;

import java.util.ArrayList;

public class TreeManager {
    ArrayList<Tree> treeArray;

    public TreeManager() { this.treeArray = new ArrayList<Tree>(); }
    public TreeManager(ArrayList<Tree> treeArray) { this.treeArray = treeArray; }

    public void displayTrees() {
        for(Tree tree : treeArray) {
        }
    }
}
