class NamedCow extends Cow
{
	protected String myName;
	public NamedCow(String type, String name, String sound)
	{  
		myType = type;
    	mySound = sound;
        myName = name;
	}

	/*public NamedCow()
	{
		myName = "unknown";
	}
*/
	public String getName(){return myName;}
}