package pcbuild;

public class Pc {
    private Case Case ;
    private Motherboard motherboard;
     private Monitor monitor ;

    public Pc(Case Case,Motherboard motherboard,Monitor monitor) {
        this.Case = Case;
        this.motherboard = motherboard;
        this.monitor = monitor;

    }
}
