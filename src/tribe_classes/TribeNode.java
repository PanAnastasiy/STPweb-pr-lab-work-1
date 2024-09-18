package tribe_classes;

public class TribeNode
{
    Tribe tribeObject;
    TribeNode next;
    public TribeNode(Tribe obj)
    {
        this.tribeObject = obj;
    }
    public Tribe getTribe()
    {
        return this.tribeObject;
    }
}
