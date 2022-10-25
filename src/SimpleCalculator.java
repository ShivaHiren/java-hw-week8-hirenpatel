public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;}

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;}

    public double getAdditionResult() {
        double add = this.firstNumber + this.secondNumber;
        return add;}

    public double getSubtractionResult() {
        double sub = this.firstNumber - this.secondNumber;
        return sub;}

    public double  getMultiplicationResult(){
        double mul = this.firstNumber * this.secondNumber;
        return mul;}

    public double  getDivisionResult(){
        double div = 0;
        if (this.secondNumber==0){
            this.firstNumber=0;
            this.secondNumber=0;
        } else {
            div=this.firstNumber/ this.secondNumber;
        }
        return div;}

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+ calculator.getAdditionResult());
        System.out.println("substract= "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multuply=" + calculator.getMultiplicationResult());
        System.out.println("divide=" + calculator.getDivisionResult());
    }
}
