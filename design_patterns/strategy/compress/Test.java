package design_patterns.strategy.compress;

public class Test {
    public static void main(String[] args) {
        FileCompressor compressor=new FileCompressor(new ZipCompression());
        compressor.compressFile("some data");

        compressor=new FileCompressor(new RarCompression());
        compressor.compressFile("some data");
    }
}
