package git.yampery.decorator;

/**
 * @decription ConcreteDecoratorA
 * <p>具体装饰构建</p>
 * @author Yampery
 * @date 2018/4/9 9:20
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        /**
         * 相关的业务代码
         */
    }
}
