public class Seeds implements Things{
    String type;
    @Override
    public void SetType(String type) {
        this.type = type;
    }

    @Override
    public String GetType() {
        return type;
    }

    public Seeds(String type) {
        SetType(type);
    }
}
