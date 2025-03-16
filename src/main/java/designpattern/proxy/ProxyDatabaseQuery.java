package designpattern.proxy;
import java.util.HashMap;
import java.util.Map;


public class ProxyDatabaseQuery implements  DataBaseQuery{
    private RealDatabaseQuery realDatabaseQuery;
    Map<String,String> cache=new HashMap<>();
    @Override
    public String executeQuery(String queryString) {
        if(cache.containsKey(queryString)){
            System.out.println("Returning cached result for query: " + queryString);
            return cache.get(queryString);
        }else{
            if(realDatabaseQuery==null){
                realDatabaseQuery=new RealDatabaseQuery();
            }
            String result=realDatabaseQuery.executeQuery(queryString);
            cache.put(queryString, result);
            return result;
        }
    }

}
