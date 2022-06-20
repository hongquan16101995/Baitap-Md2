package baitapoop.bai4;

import java.util.ArrayList;

public class Town {
    private ArrayList<Family> families;

    public Town() {
    }

    public Town(ArrayList<Family> families) {
        this.families = families;
    }

    public ArrayList<Family> getFamilies() {
        return families;
    }

    public void setFamilies(ArrayList<Family> families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Town{" +
                "families=" + families +
                '}';
    }
}
