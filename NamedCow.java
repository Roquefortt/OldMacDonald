class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound)
	{  
        myName = name;
	}

	public void getName()
	{
		myName = "unknown";
	}

	public String myName(){return myName;}
}