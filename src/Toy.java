public class Toy {
    private int id;
    private String name;
    private int probability;

    public Toy(int id, String name, int probability) {
        this.id = id;
        this.name = name;
        this.probability = probability;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return String.format("id:%d %s", getId(),getName());
    }
}
