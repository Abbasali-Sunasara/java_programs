public class exception {

    public static void main(String[] args) {



            try{

                int a = 10;
                int b = 0;
                int div = a/b;
                System.out.println("division is "+div);


            }catch(ArithmeticException e){
 
                System.out.println("My error"+e);



            }finally{

                System.out.println("rest of the code");




            }










    }








}
