package javaprograms;
/**3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________
 | |
 | Mark Sheet |
 |_______________________________|
 | Name : Jay |
 | Roll No: 08 |
 |_______________________________|
 | Subjects : Marks |
 |_______________________________|
 | Math : 98 |
 | Science : 90 |
 | English : 85 |
 |_______________________________|
 | Total : 273 |
 |_______________________________|
 | Percentage : 91.0 |
 | Result : Pass |
 | Grade : A+ |
 |_______________________________|
 *
 */

import java.util.Scanner;

public class StudentMarksSheet {


    public static void main(String[] args) {
        StudentMarksSheet obj = new StudentMarksSheet();
        obj.v2();

    }
    public void v2() {


        // create scanner
        Scanner obj = new Scanner(System.in);

        // input a data
        System.out.println(" Enter a Student name:");
        String StudentName = obj.nextLine();
        System.out.println(" Enter a student roll number:");
        int StudentRollName = obj.nextInt();
        System.out.println(" Enter a math marks;");
        int mathMarks = obj.nextInt();

        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println(" Invalid input, marks should be between 0 to 100");
            return;
        }

        System.out.println(" Enter a Science marks:");
        int StudentsScienceMarks = obj.nextInt();
        if (StudentsScienceMarks < 0 || StudentsScienceMarks > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            return;
        }

        System.out.println(" Enter a English Marks;");
        int StudentsEnglishMarks = obj.nextInt();
        if (StudentsEnglishMarks < 0 || StudentsEnglishMarks > 100) {
            System.out.println("Input input, marks should be between 0 t0 100");
            return;
        }

        // calculate total percentage
        int total = mathMarks + StudentsEnglishMarks + StudentsScienceMarks;
        double percentage = (total / 3.0);
        String result = (percentage >= 35) ? "pass" : "Fail";
        String grade;

        // Determine grade
        if (percentage >= 80) {
            grade = "a+";

        } else if (percentage >= 60) {
            grade = "a";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "c";
        }else {
            grade = "No Grade";
        }

        // print marksheet
        System.out.println("-----------------------------------------");
        System.out.println("|            Mark Sheet                   |"          );
        System.out.println("|                                         |");
        System.out.println("|________________________________________ |"                                      );
        System.out.println("|     Name           : Jenny              |"                     );
        System.out.println("|     Roll NO        :  06                |");
        System.out.println("|                                         |");
        System.out.println("|________________________________________ |"                                        );
        System.out.println("|    Subjects       : Marks               |"                           );
        System.out.println("|                                         |");
        System.out.println("|________________________________________ |"                                      );
        System.out.println("|      Maths         :   60               |"      );
        System.out.println("|      Science       :   95               |");
        System.out.println("|      English       :   77               |"        );
        System.out.println("|                                         |");
        System.out.println("|      Total         :  256               |");
        System.out.println("|_________________________________________|");
        System.out.println("|     Percentage      :    91.o           |");
        System.out.println("|     Result          :    pass           |");
        System.out.println("|      Grade          :     A+           |");
        System.out.println("|________________________________________ |");

         // scanner close
        obj.close();
        }
        {

        }

    }


