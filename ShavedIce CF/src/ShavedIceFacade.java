
public class ShavedIceFacade {
	
	
	private Blender blend;
	
	
	public ShavedIceFacade()
	{
		blend = new Blender();
		
	}
	
	public void Start()
	{
		blend.blenderON();
		blend.setSpeed();
	}
	
	public void End()
	{
		blend.blenderOFF();
	}
	
	

}
