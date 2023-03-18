import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private String name;
    private List<LoanAccount> accounts;

    public User(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addLoanAccount(LoanAccount account) {
        this.accounts.add(account);
    }

    public int getLoanTypeCount() {
        Set<String> loanTypes = new HashSet<>();
        for (LoanAccount account : accounts) {
            if (!account.getLoanType().equals("Unknown") && !account.getLoanType().equals("Collections")) {
                loanTypes.add(account.getLoanType());
            }
        }
        return loanTypes.size();
    }

    public int getTotalAccounts() {
        int totalAccounts = 0;
        for (LoanAccount account : accounts) {
            if (!account.getLoanType().equals("Unknown") && !account.getLoanType().equals("Collections")) {
                totalAccounts++;
            }
        }
        return totalAccounts;
    }

    public String getAccountDiversityGrade() {
        int totalAccounts = getTotalAccounts();
        int loanTypeCount = getLoanTypeCount();

        if (totalAccounts > 20 || loanTypeCount >= 4) {
            return "A";
        } else if (totalAccounts > 10 || loanTypeCount == 3) {
            return "B";
        } else if (totalAccounts >= 5 || loanTypeCount == 2) {
            return "C";
        } else if (totalAccounts > 0 || loanTypeCount == 1) {
            return "D";
        } else {
            return null;
        }
    }
}



