package abstract_factory.os.win;

import abstract_factory.CheckBox;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public class WinCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
