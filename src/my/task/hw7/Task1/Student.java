package my.task.hw7.Task1;

public class Student {

    private String name;

    private String surName;

    private String titleGroup;

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
      return ("Name: "+getName()+", Surname: "+getSurName()+", Title group: "+getTitleGroup()+", Number course: "+getNumberCourse()+"," +
              " Average mark: "+getAverageMark()+", Scholarship is: "+getScholarship());
    }

    public double getScholarship() {
        if (getAverageMark() == 5) {
            return  100;
        } else {
            return  80;
        }
    }
}
