class Chick implements Animal 
{     
    protected String myType;
    protected String mySound;
    protected int x;

    public Chick(String type, String sound, String sound1)
    {
    	myType = type;
    	x =(int)(Math.random()*2);

        if (x == 0)
        {
            mySound =sound;
        }
        else
        {   
            mySound = sound1;
        }

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