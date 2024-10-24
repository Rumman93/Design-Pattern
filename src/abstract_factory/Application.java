package abstract_factory;

import abstract_factory.uifactory.UIFactory;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory) {

        button = factory.createButton();
        checkBox = factory.createCheckBox();

    }

    public void paint() {

        button.paint();
        checkBox.paint();

    }
}
