package javaprograms;
/**WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
___________
| Salary Slip |
|__________|
| Employee Id : 2564 |
| Employee Name : Jay |
|__________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|__________|
| Gross Salary : 26750.0 |
|===========================|

 */


import java.util.Scanner;

public class WapProgram {

    public static void main(String[] args) {
        WapProgram obj = new WapProgram();
        obj.v2();

    }
    public void v2(){
        // create a scanner
        Scanner obj = new Scanner(System.in);
        // input a data
        System.out.println("Enter Employee ID:");
        int employeeID = obj.nextInt();

        System.out.println("Enter a Emplyoee Name:");
        String name = obj.nextLine();

        System.out.println("Enter a Basic Salary ");
        int salary = obj.nextInt();


        // calculate HRA/TA/DA/PF/ and Gross Salary
        double HRA = salary * 0.10;  // 10% of basic salary
        double DA = salary * 0.08;   // 8% of basic salary
        double TA = salary* 0.09;   // 9% of basic salary
        double PF = salary * 0.20;   // 20% of basic salary

        // Gross Salary calculation
        double grossSalary = salary + HRA + DA + TA - PF;

        // Print salary slip
        System.out.println("-----------------------------------------");
        System.out.println("|         Salary slip                    |"          );
        System.out.println("|                                         |");
        System.out.println("|________________________________________ |"                                      );
        System.out.println("|    Emplyoee ID     : 4444               |"                     );
        System.out.println("|    Emplyoee Name  :Jenny                |");
        System.out.println("|                                         |");
        System.out.println("|________________________________________  |"                                        );
        System.out.println("|                                         |"                           );
        System.out.println("|                                         |");
        System.out.println("|________________________________________ |"                                      );
        System.out.println("|      Salary         :  23000            |"      );
        System.out.println("|       HIRA 10%        :  2700           |");
        System.out.println("|       TA    4%      :  3300             |"        );
        System.out.println("|       DA     9 %    :  3370             |");
        System.out.println("|       PF            :  5000             |");
        System.out.println("|_________________________________________|");
        System.out.println("| Gross Salary       :   26530            |");
        System.out.println("|__________________________________________|");



        // scanner close
        obj.close();




    }
}
