import helper.ValidateUserInput;
import model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>(
                List.of(
                        new Student(1,"Chea Chento","Male",20,"Java",100),
                        new Student(2,"Neyman Jr","Male",40,"C++",100),
                        new Student(3,"Messi","Male",20,"Java",80),
                        new Student(4,"Ronaldo","Male",30,"HTML",80)
                )
        );
        String strOption;
        do {
            System.out.println("");
            System.out.println("=============STUDENT SYSTEM===============");
            System.out.println("1.  Insert Student to System");
            System.out.println("2.  Edit Student Information");
            System.out.println("3.  Search Student Information");
            System.out.println("4.  Delete Student Information");
            System.out.println("5.  Show Student Information");
            System.out.println("6.  Exit");
            System.out.print("Choose one option 1 - 6 : ");
            strOption=scanner.nextLine();
            if(ValidateUserInput.isCorrect(strOption) && !ValidateUserInput.isEmpty(strOption)){
                int option=Integer.parseInt(strOption);
                switch (option)
                {
                    case 1:
                        System.out.println("===========Insert Student To System===============");
                        Student student=new Student();
                        student.inputStudent(scanner);
                        students.add(student);
                        break;
                    case 2:
                        Integer sid=ValidateUserInput.valueInputInteger(scanner,"Student's ID To Search");
                        Boolean b=false;
                        for(int i=0;i<students.size();i++){
                            if(sid.equals(students.get(i).getId())){
                                Student studentUpdate=new Student();
                                studentUpdate.inputUpdateStudent(scanner,sid);
                                students.set(i,studentUpdate);
                                b=true;
                            }
                        }
                        if(!b){
                            System.out.println("Student With ID of "+sid+" doesn't exist ! Try Different One !");
                        }
                        break;
                    case 3:
                        System.out.println("********************** Search Student ***************************");
                        label:
                        do {
                            Boolean check=false;
                            System.out.println("=============STUDENT SEARCH SYSTEM===============");
                            System.out.println("1. Search By ID ");
                            System.out.println("2. Search By Name ");
                            System.out.println("3. Search By Gender");
                            System.out.println("4. Search By Classroom");
                            System.out.println("5. Exit");
                            System.out.println("Choose one option ( 1- 5 ) :  ");
                            strOption=scanner.nextLine();
                            if(ValidateUserInput.isCorrect(strOption)){
                                switch (Integer.parseInt(strOption))
                                {
                                    case 1:
                                        check=false;
                                        Integer searchID=ValidateUserInput.valueInputInteger(scanner,"Student's ID To Search");
                                        for(int i=0;i<students.size();i++){
                                            if(students.get(i).getId().equals(searchID)){
                                                System.out.println(students.get(i));
                                                check=true;
                                            }
                                        }
                                        if(!check){
                                            System.out.println("Student With ID of "+searchID+" doesn't exist ! Try Different One !");
                                        }
                                        break;
                                    case 2:
                                         check=false;
                                        System.out.println("Enter Student's Name To Search : ");
                                        String searchName=scanner.nextLine();
                                        for(int i=0;i<students.size();i++){
                                            if(students.get(i).getName().equalsIgnoreCase(searchName)){
                                                System.out.println(students.get(i));
                                                check=true;
                                            }
                                        }
                                        if(!check){
                                            System.out.println("Student With Name of "+searchName+" doesn't exist ! Try Different One !");
                                        }

                                        break;
                                    case 3:
                                        check=false;
                                        System.out.println("Enter Student's Genders To Search : ");
                                        String searchGender=scanner.nextLine();
                                        for(int i=0;i<students.size();i++){
                                            if(students.get(i).getGender().equalsIgnoreCase(searchGender)){
                                                System.out.println(students.get(i));
                                                check=true;
                                            }
                                        }
                                        if(!check){
                                            System.out.println("Student With Gender of "+searchGender+" doesn't exist ! Try Different One !");
                                        }

                                        break;
                                    case 4:
                                         check=false;
                                        System.out.println("Enter Student's Classrooms To Search : ");
                                        String searchClassroom=scanner.nextLine();
                                        for(int i=0;i<students.size();i++){
                                            if(students.get(i).getClassroom().equalsIgnoreCase(searchClassroom)){
                                                System.out.println(students.get(i));
                                                check=true;
                                            }
                                        }
                                        if(!check){
                                            System.out.println("Student With Classroom of "+searchClassroom+" doesn't exist ! Try Different One !");
                                        }
                                        break;
                                    case 5:
                                        break label;
                                    default:{
                                        System.out.println("Your Input is incorrect try again it should be 1-5");
                                    }
                                }
                            }
                            scanner.nextLine();
                        }while (true);
                    break;
                    case 4:
                        Integer searchIdDelete=ValidateUserInput.valueInputInteger(scanner,"Student's ID To Search for Delete: ") ;
                        Boolean checkSearch=false;
                        for(int i=0;i<students.size();i++){
                            if(students.get(i).getId().equals(searchIdDelete)){
                                students.remove(i);
                                System.out.println("Student with ID "+searchIdDelete +" has been Delete Success");
                                checkSearch=true;
                                break;
                            }
                        }
                        if(!checkSearch){
                            System.out.println("Student With ID of "+searchIdDelete+" doesn't exist ! Try Different One !");
                        }
                        break;
                    case 5:
                        System.out.println("********************** Show Student Information ***************************");
                        for(int i=0;i<students.size();i++){
                            System.out.println(students.get(i));
                        }
                        System.out.print("-----------------Press ENTER To Continue-----------------");
                        scanner.nextLine();
                        break;
                    default:
                        System.out.println("Your input is incorrect 1 - 6");
                }
            }
            System.out.println("Enter again go to main menu ...");
            scanner.nextLine();
        }while (true);
    }
}