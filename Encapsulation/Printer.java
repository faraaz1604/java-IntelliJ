package Encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        int tempAmount = tonerLevel += tonerAmount ;
        if(tempAmount > 100 || tempAmount<0){
            return -1;
        }
        return tonerLevel+=tonerAmount;
    }

    public int printPages(int pages){
        if(duplex){
            return this.pagesPrinted/2;
        }
        return this.pagesPrinted;
    }

}
