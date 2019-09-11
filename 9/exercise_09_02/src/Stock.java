public class Stock {
    String sysmbol = "ORCL";
    String name = "Oracle Corporation";

    double previousClosingPrice;
    double currentPrice;

    public Stock() {
    }

    public Stock(String sysmbol, String name) {
        this.sysmbol = sysmbol;
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) /
                previousClosingPrice) *100;
    }



}
