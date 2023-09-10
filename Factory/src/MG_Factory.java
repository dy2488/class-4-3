public class MG_Factory {
    public Student get_eat(String s)
    {
        if(s==null)
        {
            return null;
        }
        if(s.equalsIgnoreCase("man"))
        {
            return new Man();
        }
        if(s.equalsIgnoreCase("girl"))
        {
            return new Girl();
        }
        return null;
    }
}
