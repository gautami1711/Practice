package design_patterns.builder.gaming_pc;

public class GamingPC {
    private String cpu;
    private String gpu;
    private String ssd;
    private String waterCooling;


    public GamingPC(Builder builder){
    this.cpu=builder.cpu;
    this.gpu=builder.gpu;
    this.ssd= builder.ssd;
    this.waterCooling=builder.waterCooling;
    }

    public static class Builder{
        private String cpu;
        private String gpu;
        private String ssd;
        private String waterCooling;

        public Builder setCpu(String cpu){
            this.cpu=cpu;
            return this;
        }

        public Builder setGpu(String gpu){
            this.gpu=gpu;
            return this;
        }
        public Builder setSsd(String ssd){
            this.ssd=ssd;
            return this;
        }
        public Builder setWaterCooling(String waterCooling){
            this.waterCooling=waterCooling;
            return this;
        }

        public GamingPC build(){
            return new GamingPC(this);
        }
    }
}
