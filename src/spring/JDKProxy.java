package spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class [] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userDao));
        int result = dao.add(1,2);
        System.out.println(result);
    }
}
class UserDaoProxy implements InvocationHandler {

    private Object obj ;
    UserDaoProxy(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        //在这里写增强逻辑。
        System.out.println("在方法执行之前：方法名字是：" + method.getName() + "参数是：" + Arrays.toString(args));

        //实现方法

        Object res = method.invoke(obj, args);

        System.out.println("方法实现之后");

        return res;

    }
}
