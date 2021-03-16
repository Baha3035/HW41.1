package kg.megacom;

public class Person {
    private int VIPNumber;
    private boolean coolDrip;
    private String name;



    public boolean isCoolDrip() {
        return coolDrip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public boolean getCoolDrip() {
        return coolDrip;
    }

    public void setCoolDrip(boolean coolDrip) {
        this.coolDrip = coolDrip;
    }

    public Person() {
    }


    public Person(int VIPNumber, boolean coolDrip, String name) {
        this.VIPNumber = VIPNumber;
        this.coolDrip = coolDrip;
        this.name = name;
    }

    public int getVIPNumber() {
        return VIPNumber;
    }

    public void setVIPNumber(int VIPNumber) {
        this.VIPNumber = VIPNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "VIPNumber=" + VIPNumber +
                ", coolDrip=" + coolDrip +
                ", name='" + name + '\'' +
                '}';
    }
}
