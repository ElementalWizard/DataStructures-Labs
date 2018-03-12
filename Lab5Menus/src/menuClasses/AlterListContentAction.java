package menuClasses;

import dataManager.DMComponent;

public class AlterListContentAction implements Action {
    @Override
    public void execute(Object args) {
        DMComponent dm = (DMComponent) args;
        dm.getMenuStack().push(AlterListContentMenu.getOperateListsMenu());

    }
}
