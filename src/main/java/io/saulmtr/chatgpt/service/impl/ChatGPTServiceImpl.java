package io.saulmtr.chatgpt.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import io.saulmtr.chatgpt.client.ChatGPTClient;
import io.saulmtr.chatgpt.dto.ChatGPTRequest;
import io.saulmtr.chatgpt.dto.MessageDTO;
import io.saulmtr.chatgpt.service.ChatGPTService;

@Service
public class ChatGPTServiceImpl implements ChatGPTService{

	public String startChat(String prompt) {
		
		StringBuilder builder = new StringBuilder();
		ChatGPTClient chatGPTClient = new ChatGPTClient();
		
		MessageDTO message = new MessageDTO(prompt);
		
		ChatGPTRequest chatGPTRequestModel3 = ChatGPTRequest.builder()
				.model("gpt-3.5-turbo-1106")
				.messages(Arrays.asList(message))
				.build();
		
		ChatGPTRequest chatGPTRequestModel4 = ChatGPTRequest.builder()
				.model("gpt-4-1106-preview")
				.messages(Arrays.asList(message))
				.build();
		
		builder.append("<br><br>ChatGPT Model 3.5 Response: <br>");
		String responseModel3 = chatGPTClient.sendMessage(chatGPTRequestModel3);
		builder.append(responseModel3);
		
		builder.append("<br><br>ChatGPT Model 4 Response: <br>");
		String responseModel4 = chatGPTClient.sendMessage(chatGPTRequestModel4);
		builder.append(responseModel4);
				
		return builder.toString();	
	}
}
