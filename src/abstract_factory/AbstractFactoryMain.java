package abstract_factory;

import abstract_factory.uifactory.WinUIFactory;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 24 Oct 2024
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {

        Application application=new Application(new WinUIFactory());
        application.paint();

    }
}
