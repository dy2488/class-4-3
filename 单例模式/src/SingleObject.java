public class SingleObject {
    //创建SingleObject的一个对象
    private static SingleObject instance =new SingleObject();
    //让构造函数为私有化，这样类不会被实例化
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage()
    {
        System.out.println("hello world");
    }
}
