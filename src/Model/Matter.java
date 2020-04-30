package Model;

import java.util.HashMap;

public class Matter {
    private String name;
    private int classRoom;
    private Teacher teacher;
    private HashMap <Integer ,Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Model.Matter:" +
                "\n Name: " + name  +
                "\n ClassRoom:" + classRoom +
                "\n Model.Teacher:" + getTeacher().getName() +
                "\n Students:" + students ;
    }
}
