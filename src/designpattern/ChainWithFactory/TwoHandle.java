package designpattern.ChainWithFactory;

/**
 * <p>Title: 类的名称</p>
 * <p>Description: 类的实现描述<p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company:XXXXXX </p>
 *
 * @author JensenZz
 * @version 1.0
 * @date 16/3/25
 */

public class TwoHandle implements HandleService {
    private Handler handler;

    //此处如果使用spring  写一个Init方法   或者直接注入的方式解决  想加哪一步就放那一步
    public TwoHandle() {
        this.handler = new FirstHandle();
        Handler thirdHandle = new ThirdHandle();
        this.handler.setNext(thirdHandle);
    }

    @Override
    public void doSomeThing() {
        handler.doHandle();
    }
}
