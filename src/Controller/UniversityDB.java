package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniversityDB {
    HashMap<Integer, Teacher> teacherList = new HashMap<>();
    HashMap<Integer, Student> studentList = new HashMap<>();
    List<Matter> matterList = new ArrayList<>();

    public HashMap<Integer, Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(HashMap<Integer, Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public HashMap<Integer, Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(HashMap<Integer, Student> studentList) {
        this.studentList = studentList;
    }

    public List<Matter> getMatterList() {
        return matterList;
    }

    public void setMatterList(List<Matter> matterList) {
        this.matterList = matterList;
    }

    public void addStudent(Student student) {
        this.studentList.put(student.getId(), student);
    }

    public void addTeacher(Teacher teacher) {

        teacherList.put(teacher.getId(), teacher);

    }

    public void displayStudents() {

        for (Integer key : studentList.keySet()) {
            System.out.println(studentList.get(key));
        }

    }

    public void displayTeachers() {

        for (Integer key : teacherList.keySet()) {
            System.out.println(teacherList.get(key));
        }

    }

    public Teacher validateTeacher(int id) {
        if (teacherList.containsKey(id)) {
            return teacherList.get(id);
        }
        return null;
    }


    public void displayMatters() {

        for (Matter matter : matterList) {
            System.out.println(matter.getName());
        }

    }

    public void displayMatterDetails(String matterName) {

        for (Matter matter : matterList) {
            if (matterName.equalsIgnoreCase(matter.getName())) {
                System.out.println(matter);
                break;
            }
        }

    }

    public void addStudentToMatter(String matterName, Student student) {

        for (Matter matter : matterList) {
            if (matterName.equalsIgnoreCase(matter.getName())) {
                matter.getStudents().put(student.getId(), student);
                break;
            }
        }

    }

    public boolean validateMatter(String matterName) {
        boolean validation = false;
        for (Matter matter : matterList) {
            if (matter.getName().equalsIgnoreCase(matterName)) {
                validation = true;
                break;
            }
        }
        return validation;
    }

    public void addMatter() {

        for (Matter matter : matterList) {
            System.out.println(matter);
        }

    }

    public void displayStudentInformation(int id) {
        for (Matter matter : matterList) {
            if (matter.getStudents().containsKey(id)) {
                System.out.println(matter);
            }
        }
    }

    public HashMap<Integer, Student> newStudentsList(int id) {
        HashMap<Integer, Student> studentsMap = new HashMap<>();
        studentsMap.put(id, studentList.get(id));
        return studentsMap;
    }

    public Teacher newClassTeacher(int id) {
        return teacherList.get(id);
    }


    public void universityDbInit() {
        FullTimeTeacher spanishTeacher = new FullTimeTeacher();
        spanishTeacher.setName("Pepito Perez");
        spanishTeacher.setId(231321);
        spanishTeacher.setBase(2000000);
        spanishTeacher.setExperienceYears(5);
        this.teacherList.put(spanishTeacher.getId(), spanishTeacher);

        PartTimeTeacher englishTeacher = new PartTimeTeacher();
        englishTeacher.setName("juanito Perez");
        englishTeacher.setId(789456);
        englishTeacher.setBase(1800000);
        englishTeacher.setHourActiveAWeek(40);
        this.teacherList.put(englishTeacher.getId(), englishTeacher);

        Student student1 = new Student();
        student1.setName("Felipe Montaña");
        student1.setAge(22);
        student1.setId(1345465);
        this.studentList.put(student1.getId(), student1);

        HashMap<Integer, Student> spanishStudents = new HashMap<Integer, Student>();
        spanishStudents.put(student1.getId(), student1);

        Matter spanish = new Matter();
        spanish.setName("Spanish");
        spanish.setClassRoom(123);
        spanish.setTeacher(spanishTeacher);
        spanish.setStudents(spanishStudents);
        this.matterList.add(spanish);
    }
}
