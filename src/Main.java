public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    // Test User 1
        /**User with loan accounts that have 4 different loan types and total accounts 21.
        Create a user with loan accounts having Home Loan, Heloc, Credit Card, and Car Loan loan types.
        and 21 accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
        Verify that the accountDiversityGrade is A.
        */
        // Adding at least 21 accounts to the user's loan accounts
        User user1 = new User("User 1");
        addUnknownAndCollection(user1);
        for (int i = 0; i < 21; i++) {
            if (i < 5) {
                user1.addLoanAccount(LoanAccount.HOME_LOAN);
            } else if (i < 10) {
                user1.addLoanAccount(LoanAccount.HELOC);
            } else if (i < 15) {
                user1.addLoanAccount(LoanAccount.CREDIT_CARD);
            } else {
                user1.addLoanAccount(LoanAccount.CAR_LOAN);
            }
        }

        // Verify that the accountDiversityGrade is A
        System.out.println("\nUser 1 Grade and data check");
        System.out.println(user1.getAccountDiversityGrade().equals("A"));
        System.out.println("User 1 - Loan Type Count: " + user1.getLoanTypeCount()); // Output: 4
        System.out.println("User 1 - Total Accounts: " + user1.getTotalAccounts()); // Output: 21
        System.out.println("User 1 - Account Diversity Grade: " + user1.getAccountDiversityGrade()); // Output: A


    // Test User 2

        /**User with loan accounts that have 1 different loan types and total accounts 21.
         Create a user with loan accounts having Home Loan type.
         and 21 accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
         Verify that the accountDiversityGrade is A.
         */

        User user2 = new User("Jane");
        addUnknownAndCollection(user1);
        for (int i = 0; i < 21; i++) {
        user2.addLoanAccount(LoanAccount.HOME_LOAN);
        }

        // Verify that the accountDiversityGrade is A
        System.out.println("\nUser 2 Grade and data check");
        System.out.println(user2.getAccountDiversityGrade().equals("A"));
        System.out.println("User 2 - Loan Type Count: " + user2.getLoanTypeCount()); // Output: 1
        System.out.println("User 2 - Total Accounts: " + user2.getTotalAccounts()); // Output: 21
        System.out.println("User 2 - Account Diversity Grade: " + user2.getAccountDiversityGrade()); // Output: A

// Test User 3
/**User with loan accounts that have 4 different loan types and total accounts 4.
 Create a user with loan accounts having Home Loan, Heloc, Credit Card, and Car Loan loan types.
 and 4 accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
 Verify that the accountDiversityGrade is A
 **/

// Adding at least 4 accounts to the user's loan accounts
        User user3 = new User("User 3");
        addUnknownAndCollection(user3);

// Adding required number of loan accounts of each type
        user3.addLoanAccount(LoanAccount.HOME_LOAN);
        user3.addLoanAccount(LoanAccount.HELOC);
        user3.addLoanAccount(LoanAccount.CREDIT_CARD);
        user3.addLoanAccount(LoanAccount.CAR_LOAN);

// Verify that the accountDiversityGrade is A
        System.out.println("\nUser 3 Grade and data check");
        System.out.println(user3.getAccountDiversityGrade().equals("A"));
        System.out.println("User 3 - Loan Type Count: " + user3.getLoanTypeCount()); // Output: 4
        System.out.println("User 3 - Total Accounts: " + user3.getTotalAccounts()); // Output: 4
        System.out.println("User 3 - Account Diversity Grade: " + user3.getAccountDiversityGrade()); // Output: A

    // Test User 4

        /**User with loan accounts that have 3 different loan types and total accounts 20.
         Create a user with loan accounts having Home Loan, Heloc and Credit Card types.
         Add 20 accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
         Verify that the accountDiversityGrade is B
         **/

        User user4 = new User("User 4");
        addUnknownAndCollection(user4);
        for (int i = 0; i < 20; i++) {
            if (i < 6) {
                user4.addLoanAccount(LoanAccount.HOME_LOAN);
            } else if (i < 12) {
                user4.addLoanAccount(LoanAccount.HELOC);
            } else {
                user4.addLoanAccount(LoanAccount.CREDIT_CARD);
            }
        }

        // Verify that the accountDiversityGrade is B
        System.out.println("\nUser 4 Grade and data check");
        System.out.println(user4.getAccountDiversityGrade().equals("B"));
        System.out.println("User 4 - Loan Type Count: " + user4.getLoanTypeCount()); // Output: 3
        System.out.println("User 4 - Total Accounts: " + user4.getTotalAccounts()); // Output: 20
        System.out.println("User 4 - Account Diversity Grade: " + user4.getAccountDiversityGrade()); // Output: B

    //Test User 5


        User user5 = new User("User 5");
        // Test User 5
        /**User with loan accounts that have 3 different loan types and total accounts 11.
         Create a user with loan accounts having Home Loan, Heloc, Credit Card, and Car Loan loan types.
         After adding 3 different accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
         Verify that the accountDiversityGrade is B
         **/
        addUnknownAndCollection(user5);
        for (int i = 0; i < 11; i++) {
            if (i < 4) {
                user5.addLoanAccount(LoanAccount.HOME_LOAN);
            } else if (i < 8) {
                user5.addLoanAccount(LoanAccount.HELOC);
            } else {
                user5.addLoanAccount(LoanAccount.CREDIT_CARD);
            }
        }

        // Verify that the accountDiversityGrade is B
        System.out.println("\nUser 5 Grade and data check");
        System.out.println(user5.getAccountDiversityGrade().equals("B"));
        System.out.println("User 5 - Loan Type Count: " + user5.getLoanTypeCount()); // Output: 4
        System.out.println("User 5 - Total Accounts: " + user5.getTotalAccounts()); // Output: 11
        System.out.println("User 5 - Account Diversity Grade: " + user5.getAccountDiversityGrade()); // Output: B

    // Test User 6
        /**User with loan accounts that have 3 different loan types and total accounts 10.
         Create a user with loan accounts having Home Loan, Heloc, and Credit Card loan types.
         After adding 3 different accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
         Verify that the accountDiversityGrade is B
         **/

        User user6 = new User("User 6");
        addUnknownAndCollection(user6);
        for (int i = 0; i < 10; i++) {
            if (i < 3) {
                user6.addLoanAccount(LoanAccount.HOME_LOAN);
            } else if (i < 6) {
                user6.addLoanAccount(LoanAccount.HELOC);
            } else {
                user6.addLoanAccount(LoanAccount.CREDIT_CARD);
            }
        }

// Verify that the accountDiversityGrade is B
        System.out.println("\nUser 6 Grade and data check");
        System.out.println(user6.getAccountDiversityGrade().equals("B"));
        System.out.println("User 6 - Loan Type Count: " + user6.getLoanTypeCount()); // Output: 3
        System.out.println("User 6 - Total Accounts: " + user6.getTotalAccounts()); // Output: 10
        System.out.println("User 6 - Account Diversity Grade: " + user6.getAccountDiversityGrade()); // Output: B

    // Test User 7
        /**User with loan accounts that have 2 different loan types and total accounts 11.
         Create a user with loan accounts having Home Loan and Heloc loan types.
         After adding 3 different accounts (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
         Verify that the accountDiversityGrade is B
         **/

        User user7 = new User("User 7");
        addUnknownAndCollection(user7);
        for (int i = 0; i < 11; i++) {
            if (i < 5) {
                user7.addLoanAccount(LoanAccount.HOME_LOAN);
            } else {
                user7.addLoanAccount(LoanAccount.HELOC);
            }
        }

        // Verify that the accountDiversityGrade is B
        System.out.println("\nUser 7 Grade and data check");
        System.out.println(user7.getAccountDiversityGrade().equals("B"));
        System.out.println("User 7 - Loan Type Count: " + user7.getLoanTypeCount()); // Output: 2
        System.out.println("User 7 - Total Accounts: " + user7.getTotalAccounts()); // Output: 11
        System.out.println("User 7 - Account Diversity Grade: " + user7.getAccountDiversityGrade()); // Output: B

        // Test User 8
        /**User with loan accounts that have 2 different loan types and total accounts 10.
         Create a user with loan accounts having Home Loan and Heloc loan types.
         (add on top of that at least 1 Collection and Unknown loan types for control check) to this user's loan accounts.
         Verify that the accountDiversityGrade is C
         **/
        User user8 = new User("User 8");
        addUnknownAndCollection(user8);
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                user8.addLoanAccount(LoanAccount.HOME_LOAN);
            } else {
                user8.addLoanAccount(LoanAccount.HELOC);
            }
        }

        // Verify that the accountDiversityGrade is C
        System.out.println("\nUser 8 Grade and data check");
        System.out.println(user8.getAccountDiversityGrade().equals("C"));
        System.out.println("User 8 - Loan Type Count: " + user8.getLoanTypeCount()); // Output: 2
        System.out.println("User 8 - Total Accounts: " + user8.getTotalAccounts()); // Output: 10
        System.out.println("User 8 - Account Diversity Grade: " + user8.getAccountDiversityGrade()); // Output: C

    // Test User 9
        /**User with 2 different account types and total accounts 5.
         Create a user with "Home loan" and "Car loan" account types.
         (add on top of that at least 1 Collection and Unknown account types for control check) to this user's accounts.
         Verify that the accountDiversityGrade is C
         **/
        User user9 = new User("User 9");
        addUnknownAndCollection(user9);
        for (int i = 0; i < 5; i++) {
            if (i < 3) {
                user9.addLoanAccount(LoanAccount.HOME_LOAN);
            } else {
                user9.addLoanAccount(LoanAccount.CAR_LOAN);
            }
        }

        // Verify that the accountDiversityGrade is D
        System.out.println("\nUser 9 Grade and data check");
        System.out.println(user9.getAccountDiversityGrade().equals("C"));
        System.out.println("User 9 - Account Type Count: " + user9.getLoanTypeCount()); // Output: 2
        System.out.println("User 9 - Total Accounts: " + user9.getTotalAccounts()); // Output: 5
        System.out.println("User 9 - Account Diversity Grade: " + user9.getAccountDiversityGrade()); // Output: C

        // Test User 10
        /**User with 2 different account types and total accounts 4.
         Create a user with "Home Load" and "Car Loan" account types.
         (add on top of that at least 1 Collection and Unknown account types for control check) to this user's accounts.
         Verify that the accountDiversityGrade is C
         **/
        User user10 = new User("User 10");
        addUnknownAndCollection(user10);
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                user10.addLoanAccount(LoanAccount.HOME_LOAN);
            } else {
                user10.addLoanAccount(LoanAccount.CAR_LOAN);
            }
        }

        // Verify that the accountDiversityGrade is C
        System.out.println("\nUser 10 Grade and data check");
        System.out.println(user10.getAccountDiversityGrade().equals("C"));
        System.out.println("User 10 - Account Type Count: " + user10.getLoanTypeCount()); // Output: 2
        System.out.println("User 10 - Total Accounts: " + user10.getTotalAccounts()); // Output: 4
        System.out.println("User 10 - Account Diversity Grade: " + user10.getAccountDiversityGrade()); // Output: C

    // Test User 11
        /**User with 1 account type and total accounts 4.
         Create a user with "Car Loan" account type.
         (add on top of that at least 1 Collection and Unknown account types for control check) to this user's accounts.
         Verify that the accountDiversityGrade is D
         **/
        User user11 = new User("User 11");
        addUnknownAndCollection(user11);
        for (int i = 0; i < 4; i++) {
            user11.addLoanAccount(LoanAccount.CAR_LOAN);
        }

// Verify that the accountDiversityGrade is D
        System.out.println("\nUser 11 Grade and data check");
        System.out.println(user11.getAccountDiversityGrade().equals("D"));
        System.out.println("User 11 - Account Type Count: " + user11.getLoanTypeCount()); // Output: 1
        System.out.println("User 11 - Total Accounts: " + user11.getTotalAccounts()); // Output: 4
        System.out.println("User 11 - Account Diversity Grade: " + user11.getAccountDiversityGrade()); // Output: D

    // Test User 12
        /**User with 1 account type and total accounts 1.
         Create a user with "Car Loan" account type.
         (add on top of that at least 1 Collection and Unknown account types for control check) to this user's accounts.
         **/

        User user12 = new User("User 12");
        user12.addLoanAccount(LoanAccount.CAR_LOAN);
        addUnknownAndCollection(user12);

        // Verify that the accountDiversityGrade is D
        System.out.println("\nUser 12 Grade and data check");
        System.out.println(user12.getAccountDiversityGrade().equals("D"));
        System.out.println("User 12 - Loan Type Count: " + user12.getLoanTypeCount()); // Output: 1
        System.out.println("User 12 - Total Accounts: " + user12.getTotalAccounts()); // Output: 1
        System.out.println("User 12 - Account Diversity Grade: " + user12.getAccountDiversityGrade()); // Output: D

    // Test User 13
        /**User with no loan accounts.
         Create a user with no loan accounts.
         **/
        User user13 = new User("User 13");

    // Verify that the accountDiversityGrade is null
        System.out.println("\nUser 13 Grade and data check");
        System.out.println(user13.getAccountDiversityGrade() == null);
        System.out.println("User 13 - Loan Type Count: " + user13.getLoanTypeCount()); // Output: 0
        System.out.println("User 13 - Total Accounts: " + user13.getTotalAccounts()); // Output: 0
        System.out.println("User 13 - Account Diversity Grade: " + user13.getAccountDiversityGrade()); // Output: null




        // Test account diversity grades
        System.out.println("\n\nUser 1 - Account Diversity Grade: " + user1.getAccountDiversityGrade()); // Output: A
        System.out.println("User 2 - Account Diversity Grade: " + user2.getAccountDiversityGrade()); // Output: A
        System.out.println("User 3 - Account Diversity Grade: " + user3.getAccountDiversityGrade()); // Output: A
        System.out.println("User 4 - Account Diversity Grade: " + user4.getAccountDiversityGrade()); // Output: B
        System.out.println("User 5 - Account Diversity Grade: " + user5.getAccountDiversityGrade()); // Output: B
        System.out.println("User 6 - Account Diversity Grade: " + user6.getAccountDiversityGrade()); // Output: B
        System.out.println("User 7 - Account Diversity Grade: " + user7.getAccountDiversityGrade()); // Output: B
        System.out.println("User 8 - Account Diversity Grade: " + user8.getAccountDiversityGrade()); // Output: C
        System.out.println("User 9 - Account Diversity Grade: " + user9.getAccountDiversityGrade()); // Output: C
        System.out.println("User 10 - Account Diversity Grade: " + user10.getAccountDiversityGrade()); // Output: C
        System.out.println("User 11 - Account Diversity Grade: " + user11.getAccountDiversityGrade()); // Output: D
        System.out.println("User 12 - Account Diversity Grade: " + user12.getAccountDiversityGrade()); // Output: D
        System.out.println("User 13 - Account Diversity Grade: " + user13.getAccountDiversityGrade()); // Output: null



        // Testing statements in one place
        System.out.println("\n\n Testing truthiness of statements for all edge cases");
        System.out.println(user1.getAccountDiversityGrade().equals("A"));
        System.out.println(user2.getAccountDiversityGrade().equals("A"));
        System.out.println(user3.getAccountDiversityGrade().equals("A"));
        System.out.println(user4.getAccountDiversityGrade().equals("B"));
        System.out.println(user5.getAccountDiversityGrade().equals("B"));
        System.out.println(user6.getAccountDiversityGrade().equals("B"));
        System.out.println(user7.getAccountDiversityGrade().equals("B"));
        System.out.println(user8.getAccountDiversityGrade().equals("C"));
        System.out.println(user9.getAccountDiversityGrade().equals("C"));
        System.out.println(user10.getAccountDiversityGrade().equals("C"));
        System.out.println(user11.getAccountDiversityGrade().equals("D"));
        System.out.println(user12.getAccountDiversityGrade().equals("D"));
        System.out.println(user13.getAccountDiversityGrade() == null);
    }
    public static void addUnknownAndCollection(User user) {
        user.addLoanAccount(LoanAccount.UNKNOWN);
        user.addLoanAccount(LoanAccount.COLLECTIONS);
    }
}