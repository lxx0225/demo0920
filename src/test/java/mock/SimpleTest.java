package mock;
import org.junit.*;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SimpleTest{

    @Test
    public void simpleTest(){

        //创建mock对象，参数可以是类，也可以是接口
        List<String> list = mock(List.class);

        //设置方法的预期返回值 （如果list.get(0) 被调用 ，调用之后返回 helloworld）
        //当然前提是要创建了Mock对象，如这里就是创建了跟 List相关的 Mock对象
        //这里还看不出什么作用，因为Mock 还看不出来，List很容易就能创建
        //假如是一个很复杂的对象，构造这样一个对象很有难度，使用Mock就很方便了，我们不用去一步一步填充它的属性去构造，
        //只需要Mock 一下，就可以拿到这个对象，去测试它的方法，（当然，如果方法有参数我们是需要传递的，像get(0)）
        when(list.get(0)).thenReturn("helloworld");
        //list.get(0)的调用就会返回 helloworld
        String result = list.get(0);
        System.out.println(result);




        //验证方法调用(是否调用了get(0))
        verify(list).get(0);

        assertEquals("helloworld111", result);
    }



    @Test
    public void testMockMethod() {
        Simple obj=mock(Simple.class);

        when(obj.hello("z3")).thenReturn("hello l4");

        String actual=obj.hello("z3");
        assertEquals("hello l4",actual);

        verify(obj).hello("z3");
        //verify(obj,times(1)).hello("z3"); //可以加参数验证次数
    }


    @Test
    public void testMockMethodInOrder() {
        Simple objOther = Mockito.mock(Simple.class);
        Simple objCn = Mockito.mock(Simple.class);

        Mockito.when(objOther.hello("z3")).thenReturn("hello l4");
        Mockito.when(objCn.hello("z3")).thenReturn("hello 张三");


        String cn = objCn.hello("z3");          //这里决定了 objCn在后
        Assert.assertEquals("hello 张三", cn);
        String other = objOther.hello("z3");  //这里决定了 objOther在先
        Assert.assertEquals("hello l4", other);

        InOrder inOrder = Mockito.inOrder(objCn,objOther); //此行并不决定顺序，下面的两行才开始验证顺序
        inOrder.verify(objOther).hello("z3");
        inOrder.verify(objCn).hello("z3");
    }

    // 非局部模拟（只能通过When().thenReturn() 来指定函数的返回类型，但是是调用不了 模拟出来的的类的方法的）
    @Test
    public void testSkipExpect() {
        Simple obj = Mockito.mock(Simple.class);

        //如：正常如果hello方法被调用，应该返回z3，但这里返回的null ，说明该方法是没有被调用的
        //因为我们模拟出来的是非局部变量
        Assert.assertEquals(null, obj.hello("z3"));
        //show方法也是一样，show方法如果执行应该打印一句话，但是obj并不能执行show方法
        obj.show();

        Mockito.verify(obj).hello("z3");
        Mockito.verify(obj).show();
    }


    //局部模拟--spy()方式
    @Test
    public void testSpy() {
        Simple obj = Mockito.spy(new Simple());

        Mockito.doNothing().when(obj).show();  //有了这行，show方法被执行就不会有任何操作

        Assert.assertEquals("z3",obj.hello("z3"));
        obj.show();

        Mockito.verify(obj).hello("z3");
        Mockito.verify(obj).show();
    }

    //值得注意的陷阱
    @Test
    public void testSpy2() {
        Simple obj = Mockito.spy(new Simple());
        //即使使用的是when thenReturn，但是仍然会执行方法里面的内容
        Mockito.when(obj.hello("z3")).thenReturn("hello l4");

        Assert.assertEquals("hello l4",obj.hello("z3"));

        //Mockito.verify(obj).hello("z3");
    }

    //如果既想使用局部模拟，又不想调用到方法里面的内容
    @Test
    public void testSpy3() {
        Simple obj = Mockito.spy(new Simple());

        Mockito.doReturn("hello l4").when(obj).hello("z3");

        Assert.assertEquals("hello l4",obj.hello("z3"));

        Mockito.verify(obj).hello("z3");
    }
}
