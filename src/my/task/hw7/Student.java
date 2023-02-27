package my.task.hw7;

public class Student {

    private String name, surName, titleGroup;

    private int numberCourse;

    private double averageMark;

    public Student(String name,String surName, String titleGroup, int numberCourse, double averageMark) {
        this.name =name;
        this.surName =surName;
        this.titleGroup =titleGroup;
        this.numberCourse =numberCourse;
        this.averageMark =averageMark;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurName() {return surName;}

    public void setSurName(String surName) {this.surName = surName;}

    public String getTitleGroup() {return titleGroup;}

    public void setTitleGroup(String titleGroup) {this.titleGroup = titleGroup;}

    public int getNumberCourse() {return numberCourse;}

    public void setNumberCourse(int numberCourse) {this.numberCourse = numberCourse;}

    public double getAverageMark() {return averageMark;}

    public void setAverageMark(double averageMark) {this.averageMark = averageMark;}

    public String result() {
      return (getName()+", "+getSurName()+", "+getTitleGroup()+", "+getNumberCourse()+", "+getAverageMark()+", Scholarship is: "+getScholarship());
    }

    public double getScholarship() {
        double scholarship;
        if (getAverageMark() == 5) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return scholarship;
    }
}
