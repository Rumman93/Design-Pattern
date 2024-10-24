package abstract_factory.uifactory;

import abstract_factory.Button;
import abstract_factory.CheckBox;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public interface UIFactory {

    Button createButton();

    CheckBox createCheckBox();

}
