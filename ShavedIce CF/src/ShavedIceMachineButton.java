
public class ShavedIceMachineButton {
	
	ShavedIceCommand button;
	public ShavedIceMachineButton() {}
	public void setCommand(ShavedIceCommand command)
	{
		button = command;
	}
	public void buttonPressed()
	{
		button.execute();
	}

}
