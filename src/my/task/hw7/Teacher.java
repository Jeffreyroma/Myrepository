package my.task.hw7;

public class Teacher extends Student {

    private String scientificWork;

    public Teacher(String name, String surName, String titleGroup, int numberCourse, double averageMark, String scientificWork) {
        super(name, surName, titleGroup, numberCourse, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {return scientificWork;}

    public void setScientificWork(String scientificWork) {this.scientificWork = scientificWork;}

    @Override
    public String result() {
        return (getName()+", "+getSurName()+", "+getTitleGroup()+", "+getNumberCourse()+", "+getAverageMark()+","+getScientificWork()+", Scholarship is: "+getScholarship());
    }

    @Override
    public double getScholarship() {
        double scholarship;

        if (getAverageMark() == 5) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return scholarship;
    }
}

