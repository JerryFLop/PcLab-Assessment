package pcbuild;

public class Case {
   private String model;
    private String manufacturer;
    private String powerSupply;
    private  Dimension dimension;


    public Case(String model,String manufacturer,String powerSupply,Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }



    private void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}
