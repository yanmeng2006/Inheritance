public class StoreOneA extends StoreToRent{
    private final double DISCOUNT_RATE = 0.10;
    private boolean specialCustomer;
    private double  monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer, double monthlyPayment){
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
        this.monthlyPayment = monthlyPayment;
    }

    public double calculateLoanFinancing(){
        super.calculateLoanFinancing();
        if(specialCustomer==true){
            monthlyPayment-= (monthlyPayment * DISCOUNT_RATE);
        };
        return monthlyPayment;
    }
    
    public void showStoreInfo(){
        System.out.println(toString());
    }

    public String toString(){
        return "Combining parent toString() \n" + super.toString() + "\n and child toString()";
    }

}
