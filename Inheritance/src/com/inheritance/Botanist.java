package com.inheritance;

public class Botanist {
    public void study(Tree tree) {
        tree.type();
        tree.height();
        tree.leaves();
        tree.benefits();
        tree.lifespan();

        if (tree instanceof Coconut) {
            Coconut coconut = (Coconut) tree;
            coconut.products();
        }
    }
}
