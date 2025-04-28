package design_patterns.strategy.compress;

public class FileCompressor {
    private CompressionStrategy strategy;

    public FileCompressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }
    public void compressFile(String data){
        strategy.compress(data);
    }
}
