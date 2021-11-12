/**int
 * Students name, age, gender, roll no, phone, Total marks scored, and address.
 */
public class Students {
    int roll_no,age,phoneNo;
    String name,gender,address;
    double marks;

     Students(int a){}
     Students(int roll_no,int age,int phoneNo,String name,String gender,String address,double marks){
        this.roll_no=roll_no;
        this.age=age;
        this.phoneNo=phoneNo;
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.marks=marks;

    }

    
}