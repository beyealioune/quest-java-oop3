public class Eagle extends Bird  implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int meters){
        this.altitude = this.altitude + meters;
        
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


         @Override
        public void takeOff(){
           System.out.println(" eye cherry takes off in the sky");
        };
         @Override
      public void ascend(int meters){
         this.setAltitude(meters);
            System.out.println("Eye Cherry flies upward, altitude :"+getAltitude());
        };
      
         @Override
       public  void glide(){
            System.out.println(" it glides into the air");
        };
         @Override
        public void descend(int meters){
            meters = -meters;
            this.setAltitude(meters);
             System.out.println("Eye Cherry flies downward, altitude : "+getAltitude());
        };
         @Override
       public void land(){
        if(getAltitude()>1) 
               System.out.println("Eye Cherry lands on the ground.");
               else   System.out.println("Eye Cherry is too high, it can't lands.");
        };
        
     
      
}
