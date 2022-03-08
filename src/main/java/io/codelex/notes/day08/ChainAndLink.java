package io.codelex.notes.day08;

import io.codelex.notes.day08.chain.Chain;
import io.codelex.notes.day08.chain.Link;

public class ChainAndLink {

    public static void main(String[] args) {

        Link l1 = new Link("Miks");
        Link l2 = new Link("Zanda");
        Link l3 = new Link("Alise");

        Chain chain = new Chain(l1);
        chain.addLink(l2);
        chain.addLink(l3);

        chain.printChain();

    }

}
