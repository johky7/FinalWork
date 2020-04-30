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

        FullTimeTeacher biologyTeacher = new FullTimeTeacher();
        biologyTeacher.setName("Rosana Martinez");
        biologyTeacher.setId(852369);
        biologyTeacher.setBase(2500000);
        biologyTeacher.setExperienceYears(5);
        this.teacherList.put(biologyTeacher.getId(), biologyTeacher);

        PartTimeTeacher englishTeacher = new PartTimeTeacher();
        englishTeacher.setName("juanito Perez");
        englishTeacher.setId(78944);
        englishTeacher.setBase(50000);
        englishTeacher.setHourActiveAWeek(40);
        this.teacherList.put(englishTeacher.getId(), englishTeacher);

        PartTimeTeacher mathTeacher = new PartTimeTeacher();
        mathTeacher.setName("carlos Jimenez");
        mathTeacher.setId(789456);
        mathTeacher.setBase(80000);
        mathTeacher.setHourActiveAWeek(20);
        this.teacherList.put(mathTeacher.getId(), mathTeacher);

        Student student1 = new Student();
        student1.setName("Felipe Montaña");
        student1.setAge(22);
        student1.setId(1345465);
        this.studentList.put(student1.getId(), student1);

        Student student2 = new Student();
        student2.setName("Camilo Martinez");
        student2.setAge(26);
        student2.setId(135);
        this.studentList.put(student2.getId(), student2);

        Student student3 = new Student();
        student3.setName("Paola Gil");
        student3.setAge(25);
        student3.setId(152);
        this.studentList.put(student3.getId(), student3);

        Student student4 = new Student();
        student4.setName("Laura Amezquita");
        student4.setAge(21);
        student4.setId(234);
        this.studentList.put(student4.getId(), student4);

        Student student5 = new Student();
        student5.setName("Laureano Gomez");
        student5.setAge(35);
        student5.setId(82);
        this.studentList.put(student5.getId(), student5);

        Student student6 = new Student();
        student6.setName("Pedro Vives");
        student6.setAge(44);
        student6.setId(23);
        this.studentList.put(student6.getId(), student6);

        HashMap<Integer, Student> spanishStudents = new HashMap<Integer, Student>();
        spanishStudents.put(student1.getId(), student1);

        Matter spanish = new Matter();
        spanish.setName("Spanish");
        spanish.setClassRoom(123);
        spanish.setTeacher(spanishTeacher);
        spanish.setStudents(spanishStudents);
        this.matterList.add(spanish);

        HashMap<Integer, Student> englishStudents = new HashMap<Integer, Student>();
        englishStudents.put(student2.getId(), student2);

        Matter english = new Matter();
        english.setName("English");
        english.setClassRoom(10);
        english.setTeacher(englishTeacher);
        english.setStudents(englishStudents);
        this.matterList.add(english);

        HashMap<Integer, Student> biologyStudents = new HashMap<Integer, Student>();
        biologyStudents.put(student3.getId(), student3);

        Matter biology = new Matter();
        biology.setName("Biology");
        biology.setClassRoom(12);
        biology.setTeacher(biologyTeacher);
        biology.setStudents(biologyStudents);
        this.matterList.add(biology);

        HashMap<Integer, Student> mathStudents = new HashMap<Integer, Student>();
        englishStudents.put(student4.getId(), student4);

        Matter math = new Matter();
        math.setName("Spanish");
        math.setClassRoom(123);
        math.setTeacher(mathTeacher);
        math.setStudents(mathStudents);
        this.matterList.add(math);
    }
}
