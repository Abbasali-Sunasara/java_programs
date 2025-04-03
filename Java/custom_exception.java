
class AbbasException extends Exception{
    public AbbasException(String msg){ // constructor
        super(msg);

    }

}

public class custom_exception {
    public static void main(String[] args) {
        try{
            throw new AbbasException("My message");

        }catch(AbbasException e){
            System.out.println("My Custom Error:" +e);

        }finally{
            System.out.println("My custom error is Created");
        }

    }
}