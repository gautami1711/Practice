package design_patterns.proxy.caching;


public class Test {
    public static void main(String[] args) {
        DataFetcher fetcher=new CachingProxy(new RemoteDataFetcher());

        System.out.println(fetcher.fetchData("A"));
        System.out.println(fetcher.fetchData("B"));
        System.out.println(fetcher.fetchData("A"));

    }
}
