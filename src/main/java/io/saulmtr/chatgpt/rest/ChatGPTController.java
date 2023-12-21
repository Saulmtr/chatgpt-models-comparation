package io.saulmtr.chatgpt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.saulmtr.chatgpt.service.ChatGPTService;

@RestController
@RequestMapping("/chatGPT")
public class ChatGPTController{

	@Autowired 
	private ChatGPTService chatGPTService;

	
    @GetMapping("/start")
    public String  getChat(@RequestParam String prompt){
    	
        return chatGPTService.startChat(prompt);
    }

}
