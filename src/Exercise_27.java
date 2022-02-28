/*Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects.
*/
class Student {
    private String Name;
    private int age;
    private String adress;

    public Student(String name, int age) {
        this.Name = name;
        this.age =age ;
    }
    public Student() {
        this.Name = "Unknown";
        this.age = 0;
        this.adress = "Not available";
    }
    public  Student(String Name, int age, String adress) {
        this.Name = Name;
        this.age = age;
        this.adress = adress;
    }

    public void setName(){
        this.Name= Name;
    }
    public String getName(){
        return Name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public void setInfo(){
        System.out.printf("%s,%s,%s",Name,age,adress);}

    public void setInfo(String name,int age ){
        System.out.printf("%s,%s,%s",Name,age);
    }}    

   
      public class Exercise_27 {

    public static void main(String[] args){

        Student Stu1[]= new Student[10];
        Student Stu2[]= new Student[10];

        Stu2[0] =new Student("Prachi",26,"Italy");
        Stu2[0].setInfo();
        System.out.println();

        Stu2[1]= new Student("Ajit",25,"America");
        Stu2[1].setInfo();
        System.out.println();

       Stu1[2]=new Student("Tushar",20);
        Stu1[2].setInfo();
        System.out.println();

        Stu1[3]=new Student("Pooja",22);
        Stu1[3].setInfo();
        System.out.println();

        Stu1[4]=new Student("Revati",18);
        Stu1[4].setInfo();
        System.out.println();

        }
    }