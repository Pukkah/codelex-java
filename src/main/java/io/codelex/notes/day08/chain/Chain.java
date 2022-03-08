package io.codelex.notes.day08.chain;

public class Chain {

    private Link firstLink;

    public Chain(Link firstLink) {
        this.firstLink = firstLink;
    }

    public Link getFirstLink() {
        return firstLink;
    }

    public void addLink(Link newLink) {
        newLink.setNextLink(firstLink);
        firstLink = newLink;
    }

    public void printChain() {
        Link currentLink = firstLink;
        do {
            System.out.println(currentLink.getValue());
        } while ((currentLink = currentLink.getNextLink()) != null);
    }

}
