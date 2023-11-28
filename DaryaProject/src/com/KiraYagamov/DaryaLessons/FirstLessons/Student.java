package com.KiraYagamov.DaryaLessons.FirstLessons;
public class Student {
    private String name = "Сергей";
    private int age = 21;
    private boolean haveStip = true;
    private int course = 2;

    public Student(String name, int age, boolean haveStip, int course) {
        this.name = name;
        this.age = age;
        this.haveStip = haveStip;
        this.course = course;
    }
    public Student(){

    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setHaveStip(boolean s){
        haveStip = s;
    }
    public void setCourse(int c){
        course = c;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getHaveStip(){
        return haveStip;
    }
    public int getCourse(){
        return course;
    }
    public int getStipSize(){
        return (int) (course * 1000 * 1.1f);
    }
    public static void StartProgram(){
        Student[] students = new Student[3];
        students[0] = new Student("Иван", 20, true, 2);
        students[1] = new Student("Петр", 22, true, 4);
        students[2] = new Student("Виктор", 21, false, 3);

        for(int i = 0; i < students.length; i++){
            int age = students[i].getAge();
            String strAge = String.valueOf(age);
            int lastChar = Integer.parseInt(String.valueOf(strAge.charAt(strAge.length()-1)));
            String ageCall = "лет";
            String haveS = "на стипендии";
            if(lastChar == 1 && (age > 20 || age < 10)){
                ageCall = "год";
            }
            else if(lastChar > 1 && lastChar < 5 && (age > 20 || age < 10)){
                ageCall = "года";
            }
            if(!students[i].getHaveStip()){
                haveS = "без стипендии";
            }
            System.out.println(students[i].getName() + ", " + students[i].getAge() + " " + ageCall + ", " + haveS + ", " + students[i].getCourse() + " курс;");
        }
    }
}