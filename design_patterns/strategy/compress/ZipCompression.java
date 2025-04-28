package design_patterns.strategy.compress;

public class ZipCompression implements CompressionStrategy{
    @Override
    public void compress(String data) {
        System.out.println("Data compressed using ZIP format");
    }
}
