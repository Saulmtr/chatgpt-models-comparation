package io.saulmtr.chatgpt.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.saulmtr.chatgpt.dto.ChatGPTRequest;
import io.saulmtr.chatgpt.dto.ChatGPTResponse;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class ChatGPTClient {
	
	private static final String url = "https://api.openai.com/v1/chat/completions";
	
    private final RestTemplate restTemplate = new RestTemplate();
    
    public String sendMessage(ChatGPTRequest request) {      
        try {
        	ChatGPTResponse chatGPTResponse = this.getResponse(buildHttpEntity(request), ChatGPTResponse.class, url);
        	return chatGPTResponse.getChoices().get(0).getMessage().getContent();
        } catch (Exception e) {
        	return "Error in client";
        }
    }
    
    protected <T> HttpEntity<?> buildHttpEntity(T request) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + System.getenv("OPENAI_KEY"));
 
        return new HttpEntity<>(request, headers);
    }

    protected <T> T getResponse(HttpEntity<?> httpEntity, Class<T> responseType, String url) throws Exception {
        ResponseEntity<T> responseEntity = restTemplate.postForEntity(url, httpEntity, responseType);
        if (responseEntity.getStatusCode() != HttpStatus.OK) {
            throw new Exception("Error in status code");
        } else {
            log.info("response: {}", responseEntity);
        }
        return responseEntity.getBody();
    }
	
}
