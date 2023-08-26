class Student{
    //data
    int roll;
    String name;
    float nn;
    int mark;
    Student(int r, String n, int m,float f){
        roll =r;
        name= n;
        mark = m;
        nn = f;
    }

    //function
    void display(){
        System.out.print(roll +" "+ name + " "+ mark);
    }
}
class Test{
    public static void main(String[] s){
        // int a = 7;
        Student anisha = new Student(3, "Anisha", 15, 3.0f);
        Student ravi = new Student(2, "ravi", 8, 7.3f);
        
        ravi.display();
        anisha.display();
    }
}