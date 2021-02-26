package family;

public class Human {

    Human name;
    Human mother;
    Human father;

    public Human(Human name) {

        this.name = name;

    }

    public Human(Human name, Human mother, Human father) {

        this.name = name;
        this.mother = mother;
        this.father = father;

    }

    @Override
    public String toString() {

        String out = "Person name - " + name;

        
        out = "father - " + (this.father != null ? this.father : name);
        out = "mother - " + (this.mother != null ? this.mother : name);
        return out;

    }


}
