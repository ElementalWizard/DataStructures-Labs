package main;

import tree.Position;

public class Person implements Cloneable {
    private String name;
    private int asset;
    private Person sponsor;
    private Person mentor;
    private boolean isArrested;
    //the current position
    private Position<Person> ownPosition;
    //the position in the original tree
    private Position<Person> originalPosition;
    private int numOfChildren;

    //n is the name of the person, 'a' is the assets it holds
    public Person(String n, int a){
        name=n;
        asset=a;
        sponsor=null;
        mentor=null;
        numOfChildren=0;
        isArrested = false;

    }



    //GETTERS and SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAsset() {
        return asset;
    }

    public void setAsset(int asset) {
        this.asset = asset;
    }

    public boolean isArrested() {
        return isArrested;
    }

    public void setArrested(boolean arrested) {
        isArrested = arrested;
    }

    public Person getSponsor() {
        return sponsor;
    }

    public void setSponsor(Person sponsor) {
        this.sponsor = sponsor;
    }

    public Person getMentor() {
        return mentor;
    }

    public void setMentor(Person mentor) {
        this.mentor = mentor;
    }

    public Position<Person> getOwnPosition() {
        return ownPosition;
    }

    public void setOwnPosition(Position<Person> ownPosition) {
        this.ownPosition = ownPosition;
    }

    public Position<Person> getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(Position<Person> originalPosition) {
        this.originalPosition = originalPosition;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void addNumOfChildren(int numOfChildren) {
        this.numOfChildren += numOfChildren;
    }
}
