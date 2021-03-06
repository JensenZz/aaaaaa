package designpattern.Proxy;

/**
 * <p>Title: 类的名称</p>
 * <p>Description: 类的实现描述<p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company:人人行科技 </p>
 *
 * @author JensenZz
 * @version 1.0
 * @date 16/3/25
 */

public class Source implements SourceInter {
    @Override
    public void doSomeThing() {
        System.out.println("我做了什么事");
    }
}
