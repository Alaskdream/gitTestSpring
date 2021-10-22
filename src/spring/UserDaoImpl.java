package spring;

public class UserDaoImpl  implements UserDao{

    @Override
    public int add(int a, int b) {
        System.out.println("a+b执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update执行了");
        return id;
    }
}
