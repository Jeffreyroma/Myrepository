package my.task.hw7.Task1;

public class GraduateStudent extends Student {

    private String scientificWork;

    public GraduateStudent(String name, String surName, String titleGroup, int numberCourse, double averageMark, String scientificWork) {
        super(name, surName, titleGroup, numberCourse, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {return scientificWork;}

    public void setScientificWork(String scientificWork) {this.scientificWork = scientificWork;}

    @Override
    public String result() {
        return ("Name: "+getName()+", Surname: "+getSurName()+", Title group: "+getTitleGroup()+", Number course: "+getNumberCourse()+", Average mark: "+getAverageMark()+", Scientific work: "+getScientificWork()+", Scholarship is: "+getScholarship());
    }

    @Override
    public double getScholarship() {
        if (getAverageMark() == 5) {
            return  200;
        } else {
            return  180;
        }
    }
}

