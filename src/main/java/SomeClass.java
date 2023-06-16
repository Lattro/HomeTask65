public class SomeClass <T>
{
    private T obj;

    public SomeClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public <T>  void  checkTheClass(T object)
    {
        System.out.println(object.getClass().getName());
    }
}
