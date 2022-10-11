public class Main {
    public static void main(String[] args) {

        Subjects[] subs1 = new Subjects[3];
        subs1[0] = new Subjects("S101","DS",100);
        subs1[1] = new Subjects("S102","Algorithms",100);
        subs1[2] = new Subjects("S103","OS",100);

//        for(Subjects s:subs1){
//            System.out.println(s);
//        }
        Student student1= new Student("1500","Jamshid Sadiqi","CS",subs1);
        for(Subjects s: student1.getSubs()){
            System.out.println(s);
        }

    }
}