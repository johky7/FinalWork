package Model;

import Model.Teacher;

public class FullTimeTeacher extends Teacher {


    private int experienceYears;


    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
    @Override
    public double salary() {

        return this.getBase()*this.experienceYears*110/100;

    }

}
