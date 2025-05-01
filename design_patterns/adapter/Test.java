package design_patterns.adapter;

import design_patterns.adapter.payment.OldPaymentProcessor;
import design_patterns.adapter.payment.PaymentAdapter;

public class Test {
    public static void main(String[] args) {
        MediaPlayer player=new MediaAdapter("mp4");
        player.play("video.mp4");

        //payment processor adapter
        OldPaymentProcessor oldPaymentProcessor=new PaymentAdapter();
        oldPaymentProcessor.processPayment(100.0);
    }
}
