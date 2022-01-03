package projePack;

import java.util.ArrayList;

public class person {
    relation parents;
    String name;
    String surname;
    String birthday;
    boolean male;
    ArrayList<relation> relation = new ArrayList<relation>();

    public person(projePack.relation parents, String name, String surname, String birthday, boolean male) {
        this.parents = parents;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.male = male;
    }

    public projePack.relation getParents() {
        return parents;
    }

    public void setParents(projePack.relation parents) {
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}

