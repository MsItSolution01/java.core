public class StudentResult {
        public static void main(String[] args) {
            int marks = 17;
            if((marks>=80)&&(marks<=100)){
                System.out.println("Pass with Distinction");
            }
            else if((marks>=60)&&(marks<=79)){
                System.out.println("Pass with first class");
            }
            else if((marks>=35)&&(marks<=59)){
                System.out.println("Pass with second class");
            }
            else if((marks>=0)&&(marks<=34)){
                System.out.println("Fail");
            }
            else{
                System.out.println("Invalid marks");
            }
        }
    }
    

