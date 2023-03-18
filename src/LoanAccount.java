public enum LoanAccount {
    HOME_LOAN("Home Loan"),
    HELOC("Heloc"),
    CREDIT_CARD("Credit Card"),
    CAR_LOAN("Car Loan"),
    COLLECTIONS("Collections"),
    UNKNOWN("Unknown");

    private final String loanType;

    LoanAccount(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }
}
