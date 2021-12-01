public class Neznayka implements Human{
    String name,move1,move2,move3;

    public String getMove3() {
        return move3;
    }

    public void setMove3(String move3) {
        this.move3 = move3;
    }

    public String getMove1() {
        return move1;
    }

    public void setMove1(String move1) {
        this.move1 = move1;
    }

    public String getMove2() {
        return move2;
    }

    public void setMove2(String move2) {
        this.move2 = move2;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }


    public Neznayka(String name, String move1, String move2,String move3) {
        SetName(name);
        setMove1(move1);
        setMove2(move2);
        setMove3(move3);
    }
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Neznayka others = (Neznayka) obj;
        return this.name == others.name;
    }
    public int hashCode() {
        return this.name.hashCode();
    }
    public String toString() {
        return this.name;
    }
}
