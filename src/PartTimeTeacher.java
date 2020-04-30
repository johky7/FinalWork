public class PartTimeTeacher extends Teacher {
    private int hourActiveAWeek;

    public int getHourActiveAWeek() {
        return hourActiveAWeek;
    }

    public void setHourActiveAWeek(int hourActiveAWeek) {
        this.hourActiveAWeek = hourActiveAWeek;
    }
    @Override
    public double salary() {

        return this.getBase()*hourActiveAWeek;

    }
}
