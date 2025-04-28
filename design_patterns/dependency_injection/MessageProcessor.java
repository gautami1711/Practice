package design_patterns.dependency_injection;

public class MessageProcessor {
    private MessageService service;

    public MessageProcessor(MessageService messageService) {
        this.service = messageService;
    }

    //setter injection
//    public void setDependency(MessageService messageService){
//        this.service=messageService;
//    }

    //field injection
//    @Autowired
//    MessageService messageService;

    public void processMessage(String msg, String recipient){
        service.sendMessage(msg,recipient);
    }

}
