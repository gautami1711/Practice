package design_patterns.proxy.caching;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements DataFetcher{
    private final DataFetcher dataFetcher;
    private final Map<String,String> cache;

    public CachingProxy(DataFetcher dataFetcher) {
        this.dataFetcher = dataFetcher;
        this.cache = new HashMap<>();
    }

    @Override
    public String fetchData(String key) {
       if(cache.containsKey(key)){
           System.out.println("Returning cached data for the key: "+key);
           return cache.get(key);
       }
       String data=dataFetcher.fetchData(key);
       cache.put(key,data);
       return data;
    }
}
