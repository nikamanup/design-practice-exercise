package designpattern.proxy;

public class DataBaseQueryClient {
    public static void main(String[] args) {
        DataBaseQuery dataBaseQuery=new ProxyDatabaseQuery();
        dataBaseQuery.executeQuery("Select * from employee");
        dataBaseQuery.executeQuery("Select * from employee");
    }
}
