package pcbuild;

public class Main {
    public static void main(String[] args) {
       Pc pc = new Pc()
        Monitor monitor = new Monitor(new Resolution(50,50),"HP24m", "HP");
        TheCase theCase = new TheCase("Windows xp", "Microsoft","220 volts",new Dimension(200,200,100));
        Motherboard motherboard = new Motherboard("sony23","Sony",2,4,"sony-bios");




    }

}
