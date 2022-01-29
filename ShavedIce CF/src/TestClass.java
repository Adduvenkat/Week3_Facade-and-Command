
public class TestClass {

	public static void main(String[] args) {
		
		
		
		ShavedIceMachineButton shavedicebutton = new ShavedIceMachineButton();
		IceMachineCommand ice = new IceMachineCommand();
		ShavedIceFacade shavedfacade = new ShavedIceFacade();
		
		shavedicebutton.setCommand(new TurnOnMachine(ice));
		shavedicebutton.buttonPressed();
		shavedfacade.Start();;
		
		shavedicebutton.setCommand(new TurnOffMachine(ice));
		shavedicebutton.buttonPressed();		
		shavedfacade.End();
		

	}

}
