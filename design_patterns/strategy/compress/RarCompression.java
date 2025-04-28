package design_patterns.strategy.compress;

public class RarCompression implements CompressionStrategy{
    @Override
    public void compress(String data) {
        System.out.println("Data compressed using RAR format");
    }
}
