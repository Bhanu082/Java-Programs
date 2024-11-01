/*write a program to create custom exception and hadle it.
Scenarios like:1.Invalid credentials to login 
               2.Unauthorised to this department
*/
    class CustomA extends Throwable{
        CustomA(String s){
            super(s);
        }
    }
    class CustomB extends Throwable{
        CustomB(String s){
            super(s);
        }
    }
 public class Ques2{
        public static void main(String args[]){
            String username = "BHanu";
            String password = "B@nu12";
            String Department = "HR";
            try{
                if((username == "BHanu")&& (password == "B@nu12")){
                    System.out.println("Login Successful");
                }
                else{
                    throw new CustomA("Invalid Credentials");
                }
                if(Department == "HR"){
                    System.out.println("welcome to HR department");
                }
                else{
                    throw new CustomB("Not permitted to this Department");
                }
            }
            catch(CustomA | CustomB e){
                System.out.println(e);
            }
        }
    }

