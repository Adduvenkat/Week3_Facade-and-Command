
public class TurnOffMachine implements ShavedIceCommand {
	
	IceMachineCommand ice;
	public TurnOffMachine(IceMachineCommand ice)
	{
		this.ice=ice;
	}
	public void execute()
	{
		ice.offMachine();
	}

}
