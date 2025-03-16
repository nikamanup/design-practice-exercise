package designpattern.proxy;

public class RealDatabaseQuery implements DataBaseQuery{

    @Override
    public String executeQuery(String qString) {
        System.out.println("Executing Real query: "+qString);
        return "result of query: "+qString;
    }
    
}
