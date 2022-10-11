public class Student {

    public Student(String rollNum, String name){
        this.rollNum=rollNum;
        this.name = name;

    }
    public Student(String rollNum, String name,String department, Subjects[] subs){
        this.subs=subs;
        this.department=department;
        this.rollNum=rollNum;
        this.name = name;

    }
    private String rollNum;
    private String name;
    private String department;
    private Subjects[] subs;

    public String getRollNum() {
        return rollNum;
    }


    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Subjects[] getSubs() {
        return subs;
    }

    public void setSubs(Subjects[] subs) {
        this.subs = subs;
    }
}
