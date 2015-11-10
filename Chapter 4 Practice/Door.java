/*
  You are designing and implementing a class for a remotely-operated door.
  The class will allow the owner of the door to remotely lock and
  unlock the door, open and close the door, and query the door's state.
  Implement a class that fulfills these requirements. (If you are
  familiar with conditionals in Java (i.e., if statement), use that; if
  not, specify as a precondition that the door has to be in a
  particular state before opening.)
 */
public class Door
{
    private boolean isLocked;
    private boolean isOpened;
    
    public Door()
    {
        //default state of the new door is unlocked and closed
        this.isLocked = false;
        this.isOpened = false;
    }
    public Door(boolean locked, boolean opened)
    {
        this.isLocked = locked;
        this.isOpened = opened;
    }
    public void lock()
    {
        this.isLocked = true;
    }
    public void unlock()
    {
        this.isLocked = false;
    }
    public void open()
    {
        if(this.isLocked == false)
        {
            this.isOpened = true;
        }
    }
    public void close()
    {
        this.isOpened = false;
    }
    public boolean getLocked()
    {
        return this.isLocked;
    }
    public boolean getOpened()
    {
        return this.isOpened;

    }
}
    