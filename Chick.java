class Chick implements Animal 
{     
    protected String myType;
    protected String mySound;
    //private String moreSounds;
    public Chick(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    	//moreSounds = anotherSound;
    }

    public Chick()
    {
    	myType = "unknown";
    	mySound = "unknown";
    	//moreSounds = "unknown";
    }

    public String getSound(){return mySound;}
    public String getType(){return myType;}
    //public String getanotherSound(){return moreSounds;}
}


/*It turns out that the chick is a little confused. Sometimes it makes one sound, when she is feeling childish, 
and another when she is feeling more grown up. Her two sounds are "cheep" and "cluck". 
Modify the Chick class code to allow a second constructor allowing two possible sounds and the 
getSound() function to return either sound, with equal probability, if there are two sounds available. 
You will also have to modify your Farm class code to construct the Chick with two possible sounds.
*/