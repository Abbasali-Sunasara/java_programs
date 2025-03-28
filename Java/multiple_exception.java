public class multiple_exception {

    public static void main(String[] args) {

        try {
            // ArithmeticException
            int a = 10;
            int b = 0;
            int div = a / b; 
            System.out.println("Division is " + div);

            // ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Element at index 10: " + arr[10]);


            String str = null;
            System.out.println(str.length());

            // StringIndexOutOfBoundsException
            String text = "Hello";
            System.out.println("Character at index 10: " + text.charAt(10));

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound Error: " + e);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Error: " + e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out of Bound Error: " + e);
        } finally {
            System.out.println("Rest of the code executes.");
        }

    }
}
