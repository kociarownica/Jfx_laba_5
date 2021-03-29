package org.example.classes;

public class Flat {
    protected Address adr;

    private int room;
    private int lodgers;

    public Flat(Address adr, int room, int lodgers)
    {
        this.adr = adr;
        this.room = room;
        this.lodgers = lodgers;
    }
    public void settleLodger(){};
    public void evictLoader(){};
    public void giveRoom(){};
    public void releaseRoom(){};

    public void setLodgers(int lodgers) {
        this.lodgers = lodgers;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
    }

    public Address getAdr() {
        return adr;
    }

    public int getLodgers() {
        return lodgers;
    }

    public int getRoom() {
        return room;
    }
}
