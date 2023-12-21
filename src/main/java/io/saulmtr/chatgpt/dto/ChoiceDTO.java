package io.saulmtr.chatgpt.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChoiceDTO {

	private MessageResponseaDTO message;
	
	@JsonProperty("presence_penalty")
	private String finish_reason;
	
	private Integer index;
	
}
