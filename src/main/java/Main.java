public class Main
{
    public static void main(String[] args)
    {
        SomeClass<String> someClass = new SomeClass<String>("fdfd");
        System.out.println(someClass.getObj());
        someClass.<Integer>checkTheClass(10);
    }
}
