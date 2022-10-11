public class Subjects {

    public Subjects(String subID,String name,double maxMarks){
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public Subjects(String subID,String name,double maxMarks,int marksObtain){
        this.subID=subID;
        this.name=name;
        this.marksObtain=marksObtain;
        this.maxMarks=maxMarks;
    }
    private String subID;
    private String name;
    private double maxMarks;
    private int marksObtain;

    public String getSubID() {
        return subID;
    }




    public String getName() {
        return name;
    }



    public double getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(double maxMarks) {
        this.maxMarks = maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }
    boolean isQualified(){
        return marksObtain>=maxMarks/10*4;
    }
    public String toString(){
        return "\nSubject ID:"+subID+"\nName:"+name+"\nMarks Obtained: "+marksObtain;

    }
}
