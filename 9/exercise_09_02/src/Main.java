/*
(The stock class) Following the example of the Cicle class in section 9.2 design a class named Stock that contains
- A string datafield named sysmbol for the stock's sysmbom
- A sting data field named name for the stock's name
- A double data field named previousClosingPrice that stores the stock price for the previous day
- A doube data field named currentPrice that stores the stock price for the current time
- A constructor that createes a stock with the specified symbol and name
- A method named getChangedPercent() that returns the percentage changed from previousClosingPrice to currentPrice
 */
public class Main {

    public static void main(String[] args) {
	Stock stock1 = new Stock();
	stock1.setPreviousClosingPrice(34.5);
	stock1.setCurrentPrice(34.35);

        System.out.println("the stock " + stock1.sysmbol + " " + stock1.name + " had a closing price of " + stock1.previousClosingPrice +
                " The current value is " + stock1.currentPrice + " this is a " + stock1.getChangePercent() + "% change" );
    }
}
