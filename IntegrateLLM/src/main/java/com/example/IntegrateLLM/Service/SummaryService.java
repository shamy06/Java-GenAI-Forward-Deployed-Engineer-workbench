package com.example.IntegrateLLM.Service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class SummaryService {

    private ChatClient chatClient;

    public SummaryService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }
    
    public String summarize(String text){
        String output = chatClient.prompt().user("Summarize this ticket in 2 lines:\n\n"+text)
                        .call()
                        .content();
    return output;
    }
}
