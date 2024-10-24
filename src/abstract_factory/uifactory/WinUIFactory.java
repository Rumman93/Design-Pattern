package abstract_factory.uifactory;

import abstract_factory.Button;
import abstract_factory.CheckBox;
import abstract_factory.os.win.WinButton;
import abstract_factory.os.win.WinCheckBox;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public class WinUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
