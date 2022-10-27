package Zoo;

public class Zoo {
   private Lion king = new Lion();

   private String address;

   public Zoo(String localization){
    address = localization;
   }

    public void makeNoise(){
        System.out.println("Robie hałas" + address);
        king.roar();


    }
    
}
