package org.max.hometask_1;

public class Player {
    private String name;
    private boolean risk;

    public Player (String name, boolean risk) {
        this.name = name;
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public boolean getRisk() {
        return risk;
    }
}
