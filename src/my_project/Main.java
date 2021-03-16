package my_project;
import my_project.Employee;
public class Main {


    public static void main(String[] args) {
        int sizeArr = 5;
        Employee[] personArr = new Employee[sizeArr];// Вначале объявляем массив объектов
        personArr[0] = new Employee("Ivanov Ivan", "Engineer", 40, "ivivan@ibox.com", "892312312", 60000); // потом для каждой ячейки массива задаем объект
        personArr[1] = new Employee("Petrov Petr", "Asistant", 40, "ivivan@mibox.com", "8987656455", 90000);
        personArr[2] = new Employee("Sidorov Sidor", "Manager", 25, "ivivan@ibox.com", "8997531256", 780000);
        personArr[3] = new Employee("Ivanov Petr", "Accountant", 40, "ivivan@ibox.com", "8911258960", 980000);
        personArr[4] = new Employee("Petrov Ivan", "Economist", 50, "ivivan@ibox.com", "8923642146", 690000);
        //  int sizeAr= sizeArr.length;
        int i;
        for (i = 0; i < personArr.length; i++) {
            int testAge = personArr[i].getAge();
           if (testAge  == 40) {
                System.out.println(personArr[i]);
            }
        }
    }

//System.out.println("ФИО="+personArr[i].FIO+" должность= "+personArr[i].posit+" возраст= "+personArr[i].age+" e-mail= "+personArr[i].email+" ЗП="+personArr[i].salary )


}




