
public class TurnOnMachine implements ShavedIceCommand {
	
	IceMachineCommand ice;
	public TurnOnMachine(IceMachineCommand ice)
	{
		this.ice=ice;
	}
	public void execute()
	{
		ice.startMachine();
	}

}
