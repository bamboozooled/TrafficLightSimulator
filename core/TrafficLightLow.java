package SEG2106.core;
public class TrafficLightLow
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TrafficLight State Machines
  public enum Status { AllRed, NS_Green, NS_Yellow, EW_Green, EW_Yellow, NS_Left }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TrafficLightLow()
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
        setStatus(Status.NS_Left);
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
      case NS_Left:
        setStatus(Status.NS_Green);
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
      case NS_Green:
        setStatus(Status.NS_Yellow);
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
      case NS_Yellow:
        setStatus(Status.EW_Green);
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
      case EW_Green:
        setStatus(Status.EW_Yellow);
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
      case EW_Yellow:
        setStatus(Status.NS_Left);
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
      case NS_Green:
        // line 11 "model.ump"
        setNS_Green();
        break;
      case NS_Yellow:
        // line 16 "model.ump"
        setNS_Yellow();
        break;
      case EW_Green:
        // line 21 "model.ump"
        setEW_Green();
        break;
      case EW_Yellow:
        // line 26 "model.ump"
        setEW_Yellow();
        break;
      case NS_Left:
        setNS_Left();
        break;
    }
  }

  public void delete()
  {}

  // line 30 "model.ump"
   public void setAllRed(){
    
  }

  // line 31 "model.ump"
   public void setNS_Green(){
    
  }

  // line 32 "model.ump"
   public void setNS_Yellow(){
    
  }

  // line 33 "model.ump"
   public void setEW_Green(){
    
  }

  // line 34 "model.ump"
   public void setEW_Yellow(){
    
  }
   
   public void setNS_Left(){
   
  }


}