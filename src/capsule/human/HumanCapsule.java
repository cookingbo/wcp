package capsule.human;

public class HumanCapsule {
    private String name;
    private int age;

    public HumanCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // nameのgetterメソッド
    public String getName() {
        return this.name;
    }

    // nameのsetterメソッド
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
}