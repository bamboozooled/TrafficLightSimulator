/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3754.3b948f8 modeling language!*/


package SEG2106.core;

// line 2 "model.ump"
// line 38 "model.ump"
public class TrafficLight
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TrafficLight State Machines
  public enum Status { AllRed, NS_Green, NS_Yellow, EW_Green, EW_Yellow }
  private Status status;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TrafficLight()
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
        setStatus(Status.NS_Green);
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
      case NS_Green:
        setStatus(Status.NS_Yellow);
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
      case NS_Yellow:
        setStatus(Status.EW_Green);
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
      case EW_Green:
        setStatus(Status.EW_Yellow);
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
      case EW_Yellow:
        setStatus(Status.NS_Green);
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
}