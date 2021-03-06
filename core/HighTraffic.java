package SEG2106.core;
public class HighTraffic extends TrafficLightHigh implements EventHandler{
   //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TrafficLight State Machines
  private TrafficLightManager trafficLightManager; 
  private int clk_tick_cnt;
  private int[] clk_periods;
  
  //------------------------
  // CONSTRUCTOR
  //------------------------
  public HighTraffic()
  {
    super();
    clk_periods = new int[] {3,4,7,10,13,15,17};
    //clk_periods = new int[] {3,4,1,2};
    clk_tick_cnt = -1;
  }
  
  
  public void setTrafficLightManager(TrafficLightManager mgr){
    System.out.println("setTrafficLightManager");
    trafficLightManager = mgr;
    trafficLightManager.addEventHandler(this);
  }
  
   public boolean timerEvent() {
    if (clk_tick_cnt == -1) timerT0();
    else if (clk_tick_cnt >= clk_periods[clk_periods.length -1]) clk_tick_cnt = 0;
    clk_tick_cnt++;
    System.out.println("clock tic " + getStatusFullName() + " " + clk_tick_cnt);
    for (int i=0; i<clk_periods.length; i++){
      if (clk_tick_cnt == clk_periods[i]) {
        switch (i) {
          case 0: timerT1(); break;
          case 1: timerT2(); break;
          case 2: timerT3(); break;
          case 3: timerT4(); break;
          case 4: timerT5(); break;
          case 5: timerT6(); break;
          case 6: timerT7(); break;
        }
        break;
      }
    }
    return true;
  }

  @Override
  public boolean moderateTraffic() {
    //setAllRed();
    
    return false;
  }

  @Override
  public boolean lowTraffic() {
    return false;
  }

  @Override
  public boolean highTraffic() {
    // TODO
    return false;
  }
  

  //------------------------
  // INTERFACE
  //------------------------

  // line 30 "model.ump"
   public void setAllRed(){
    if (trafficLightManager != null) {
      trafficLightManager.northRed();
      trafficLightManager.southRed();
      trafficLightManager.westRed();
      trafficLightManager.eastRed();
    }
  }

  // line 31 "model.ump"
   public void setN_GLeft(){
    trafficLightManager.northGreenAndArrow();
    trafficLightManager.southRed();
    trafficLightManager.westRed();
    trafficLightManager.eastRed();
  }

  // line 32 "model.ump"
   public void setN_Yellow(){
    trafficLightManager.northYellow();
    trafficLightManager.southRed();
    trafficLightManager.westRed();
    trafficLightManager.eastRed();
  }

  // line 33 "model.ump"
   public void setS_GLeft(){
    trafficLightManager.northRed();
    trafficLightManager.southGreenAndArrow();
    trafficLightManager.westRed();
    trafficLightManager.eastRed();
  }

  // line 34 "model.ump"
   public void setS_Yellow(){
    trafficLightManager.northRed();
    trafficLightManager.southYellow();
    trafficLightManager.westRed();
    trafficLightManager.eastRed();
  }
   
   public void setEW_Green(){
    trafficLightManager.northRed();
    trafficLightManager.southRed();
    trafficLightManager.westGreen();
    trafficLightManager.eastGreen();
   }
   
   public void setEW_Yellow(){
    trafficLightManager.northRed();
    trafficLightManager.southRed();
    trafficLightManager.westYellow();
    trafficLightManager.eastYellow();
   }
   
   public void setW_GLeft(){
    trafficLightManager.northRed();
    trafficLightManager.southRed();
    trafficLightManager.westGreenAndArrow();
    trafficLightManager.eastRed();
   }
}