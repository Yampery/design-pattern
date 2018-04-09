package git.yampery.decorator;

/**
 * @decription Decorator
 * <p>装饰角色，持有一个构建对象的实例，并定义一个与抽象接口一致的接口</p>
 * @author Yampery
 * @date 2018/4/9 9:17
 */
public class Decorator implements Component {

    @Override
    public void operation() {
        // 委托给所持有的构建
        component.operation();
    }

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
