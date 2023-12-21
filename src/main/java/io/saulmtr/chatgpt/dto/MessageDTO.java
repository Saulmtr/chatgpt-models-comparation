package io.saulmtr.chatgpt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
	
	private String role;
	private String content;
	
	public MessageDTO(String content) {
		super();
		this.role = "user";
		this.content = content;
	}
	
	

}
