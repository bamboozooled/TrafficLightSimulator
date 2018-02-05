package SEG2106.core;
public class TrafficLightModerate{
    //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TrafficLight State Machines
  public enum Status { AllRed, S_GLeft, N_Yellow, EW_Green, EW_Yellow, N_GLeft, S_Yellow }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TrafficLightModerate()
  {
    setStatus(Status.AllRed);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStatusFullName()
  {
    String answer = status.toString();
    return answer;
  }

  public Status getStatus()
  {
    return status;
  }

  public boolean timerT0()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case AllRed:
        setStatus(Status.N_GLeft);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean timerT1()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case N_GLeft:
        setStatus(Status.N_Yellow);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean timerT2()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case N_Yellow:
        setStatus(Status.S_GLeft);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean timerT3()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case S_GLeft:
        setStatus(Status.S_Yellow);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean timerT4()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case S_Yellow:
        setStatus(Status.EW_Green);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }
  
  public boolean timerT5()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case EW_Green:
        setStatus(Status.EW_Yellow);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }
  
  public boolean timerT6()
  {
    boolean wasEventProcessed = false;
    
    Status aStatus = status;
    switch (aStatus)
    {
      case EW_Yellow:
        setStatus(Status.N_GLeft);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setStatus(Status aStatus)
  {
    status = aStatus;

    // entry actions and do activities
    switch(status)
    {
      case AllRed:
        // line 6 "model.ump"
        setAllRed();
        break;
      case N_GLeft:
        // line 11 "model.ump"
        setN_GLeft();
        break;
      case N_Yellow:
        // line 16 "model.ump"
        setN_Yellow();
        break;
      case S_GLeft:
        // line 21 "model.ump"
        setS_GLeft();
        break;
      case S_Yellow:
        // line 26 "model.ump"
        setS_Yellow();
        break;
      case EW_Green:
        setEW_Green();
        break;
      case EW_Yellow:
        setEW_Yellow();
        break;
    }
  }

  public void delete()
  {}

  // line 30 "model.ump"
   public void setAllRed(){
    
  }

  // line 31 "model.ump"
   public void setN_GLeft(){
    
  }

  // line 32 "model.ump"
   public void setN_Yellow(){
    
  }

  // line 33 "model.ump"
   public void setS_GLeft(){
    
  }

  // line 34 "model.ump"
   public void setS_Yellow(){
    
  }
   
   public void setEW_Green(){
   
  }
   
   public void setEW_Yellow(){
   
  }
}