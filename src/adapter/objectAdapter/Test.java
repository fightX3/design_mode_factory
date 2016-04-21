package adapter.objectAdapter;
/**
 * 类的适配器模式
 * 
 * 有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * @author xf
 *
 */
public class Test {
	public static void main(String[] args) {
		Source source = new Source();
		Targetable a = new Adapter(source);
		a.method1();
		a.method2();
	}
}
