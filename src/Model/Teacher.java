package Model;

public abstract class Teacher {
    private int id;
    private String name;
    private double base;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double salary();

    @Override
    public String toString() {
        return "Model.Teacher:\n" +
                " Name: " + this.getName() +
                "\n Id: " + this.getId()+
                "\n Salary: " + String.format("%.0f",salary())+
                "\n Type: " + this.getClass().getSimpleName();
    }
}
