package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteAListAction implements Action{

    @Override
    public void execute(Object args) {
        DMComponent dm = (DMComponent) args;
        IOComponent io = IOComponent.getComponent();
        String listName = io.getInput("\nEnter name the list: ");
        dm.removeAList(listName);
    }
}
