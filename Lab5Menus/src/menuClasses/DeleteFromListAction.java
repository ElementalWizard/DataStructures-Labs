package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object args) {
		DMComponent dm = (DMComponent) args;
		IOComponent io = IOComponent.getComponent();
		String listName = io.getInput("\nEnter name the list: ");
        String position = io.getInput("\nEnter the pocition on the list: ");
        dm.removeElementFromList(listName,Integer.parseInt(position));

	}

}
