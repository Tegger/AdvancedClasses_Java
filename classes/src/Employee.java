import java.text.DecimalFormat;
public class Employee {
    DecimalFormat df = new DecimalFormat("###,###.00");

        private int shift;
        private boolean salary;
        private double payRate;
        private double hours;
        private String firstName;
        private String lastName;
        private String position;
        private String startDate;


        public Employee(int shift, boolean salary, double payRate, double hours, String firstName, String lastName, String position, String startDate){
            this.shift = shift;
            this.salary = salary;
            this.payRate = payRate;
            this.hours = hours;
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;
            this.startDate = startDate;

        }

         public double getHours() {
            return hours;
        }

         public void setHours(double hours) {
            this.hours = hours;
        }

         public int getShift(){
            return shift;
         }

         public void setshift(int shift){
            this.shift = shift;
         }

         public boolean getSalary(){
            return salary;
        }

        public void setSalary(int shift){
            this.salary = salary;
        }

        public double getPayRate(){
            return shift;
        }

        public void setPayRate(int shift){
            this.payRate = payRate;
        }

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }


        public String getfirstName(){
            return firstName;
        }

        public String getposition(){
            return position;
        }

        public void setposition(String position){
            this.position = position;
        }
        public String getstartDate(){
            return startDate;
        }

        public void setstartDate(String startDate){
            this.startDate = startDate;
        }
//position titles
    public enum positionTitle {
        Administration, Production, Sales, Maintenance, Technical, Secretarial
    }

//calculates the total pay
        public double calculate(double hours, int shift, double payRate) {
            double totalPay;
            double shift2 = 1.05;
            double shift3 = 1.1;
            double oTime = 1.5;
            if (shift == 1 && hours > 40){
                totalPay = payRate * oTime * hours;
            }else if(shift == 1){
                totalPay = payRate * hours;
            }else if (shift == 2 && hours > 40){
                totalPay = payRate * shift2 * oTime * hours;
            }else if(shift == 2){
                totalPay = payRate * shift2 * hours;
            }else if(shift == 3 && hours > 40){
                totalPay = payRate * shift3 * oTime * hours;
            }else if(shift == 3){
                totalPay = payRate * shift3 * hours;
            }else{
                return 0.0;
            }

            return totalPay;

        }
//prints all relevant data
        public void printAll(){
            double totalPay = calculate(hours,shift,payRate);

            System.out.println("Employee Name: " + firstName + " " + lastName + "\nStart Date: " + startDate
                    +  "\nPosition: " + position + "\nWorking Shift: " + shift  + "\nSalary: " + salary + "\nPay Rate: $" + payRate
                    + "\nTotal earned income this week: $" + df.format(totalPay) + "\n\n");
        }


    }


