class VoteEligibilityException extends Exception {
    public VoteEligibilityException(String msg) { // constructor
        super(msg);
    }
}

public class voting_exception {
    public static void main(String[] args) {
        int age = 17;

        try {
            checkEligibility(age);
        } catch (VoteEligibilityException e) {
            System.out.println("Custom Error: " + e);
        } finally {
            System.out.println("Eligibility check completed.");
        }
    }

    static void checkEligibility(int age) throws VoteEligibilityException {
        if (age < 18) {
            throw new VoteEligibilityException("Not eligible to vote. Age must be 18 or older.");
        }
        System.out.println("Eligible to vote.");
    }
}
