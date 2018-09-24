public class OnlineOrder {
    private String orderName;
    private double totalCost;
    private double tax;
    private int numTurkey;
    private int numVeggie;
    private int numItalian;
    private int numBLT;
    public final double TAX_RATE = 0.07;

    public OnlineOrder(String orderName, int numTurkey, int numVeggie, int numItalian, int numBLT){
        this.orderName = orderName;
        this.totalCost = calculateTotal(numTurkey, numVeggie, numItalian, numBLT);
        this.tax = calculateTax(numTurkey, numVeggie, numItalian, numBLT);

        this.numTurkey = numTurkey;
        this.numVeggie = numVeggie;
        this.numItalian = numItalian;
        this.numBLT = numBLT;
    }

    public double calculateTotal(int numTurkey, int numVeggie, int numItalian, int numBLT){
        return (numTurkey * 4.99 + numVeggie * 3.99 + numItalian * 4.99 + numBLT * 4.99) * (1.00 + TAX_RATE);
    }

    public double calculateTax(int numTurkey, int numVeggie, int numItalian, int numBLT){
        return (numTurkey * 4.99 + numVeggie * 3.99 + numItalian * 4.99 + numBLT * 4.99) * TAX_RATE;
    }

    public void changeOrder(int numTurkey, int numVeggie, int numItalian, int numBLT){
        if (numTurkey >= 0 || numVeggie >= 0 || numItalian >= 0|| numBLT >= 0){
            this.numTurkey = numTurkey;
            this.numVeggie = numVeggie;
            this.numItalian = numItalian;
            this.numBLT = numBLT;

            totalCost = calculateTotal(numTurkey, numVeggie, numItalian, numBLT);
            tax = calculateTax(numTurkey, numVeggie, numItalian, numBLT);
        }
    }

    public double getTotalCost(){return totalCost;}

    public double getTax(){return tax;}

    public String toString(){
        return String.format("%s, your order comes to $%.2f", orderName, totalCost);
    }

}
