class course {
    private String name;
    private int duration;
    public course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    public String toString() {
        return this.name + " " + this.duration;
    }
    
}
class student{
    private int id;
    private String name,qualification;
    private course course;  
    public student(int id,String name,String qualification,course course){
        this.id=id;
        this.name=name;
        this.qualification=qualification;
        this.course=course;
    }
    public String toString(){
        return this.id+" "+this.name+" "+this.qualification+" "+this.course;
    }
}
class main1{
    public static void main(String[] args){
        course course=new course("Java full stack",6);
        student student=new student(101,"Aman","Btech",course);
        System.out.println(student);
    }
}