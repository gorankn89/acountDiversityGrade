public class example {
/*

    // Test User 1
    *//**User with loan accounts that have 4 different loan types and total accounts 21.
     Create a user with loan accounts having Home Loan, Heloc, Credit Card, and Car Loan loan types.
     and 21 accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
     Verify that the accountDiversityGrade is A.
     *//*
// Adding at least 21 accounts to the user's loan accounts
    User user1 = new User("User 1");
        user1.addLoanAccount(LoanAccount.COLLECTIONS);
        user1.addLoanAccount(LoanAccount.UNKNOWN);
        for (int i = 0; i < 21; i++) {
        if (i < 5) {
            user1.addLoanAccount(LoanAccount.HOME_LOAN);
        } else if (i < 10) {
            user1.addLoanAccount(LoanAccount.HELOC);
        } else if (i < 15) {
            user1.addLoanAccount(LoanAccount.CREDIT_CARD);
        } else () {
            user1.addLoanAccount(LoanAccount.CAR_LOAN);
        }
    }

// Verify that the accountDiversityGrade is A
        System.out.println("\nUser 1 Grade and data check");
        System.out.println(user1.getAccountDiversityGrade().equals("A"));
        System.out.println("User 1 - Loan Type Count: " + user1.getLoanTypeCount()); // Output: 3
        System.out.println("User 1 - Total Accounts: " + user1.getTotalAccounts()); // Output: 3
        System.out.println("User 1 - Account Diversity Grade: " + user1.getAccountDiversityGrade()); // Output: C




    */
}
