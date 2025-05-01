package design_patterns.proxy.caching;

public class RemoteDataFetcher implements DataFetcher{
    @Override
    public String fetchData(String key) {
        System.out.println("Fetching from remote for key: "+key);
        //simulate a slow operation
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
        }
        return "Data for "+key;
    }
}
