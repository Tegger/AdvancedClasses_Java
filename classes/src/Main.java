public class Main {
    public static void main(String args[]){

        Employee person1 = new Employee(1, true, 18.75, 48.5,"Sally", "Dane", "Manager", "10/13/2012");

        Employee person2 = new Employee(2, false, 8.25, 36.25,"Andy", "Crimms", "Bagger", "10/13/2016");

        Employee person3 = new Employee(3, true, 23.5, 36,"John", "Anders", "Asst. Manager", "10/13/2014");
        person1.printAll();
        person2.printAll();
        person3.printAll();

    }




}
