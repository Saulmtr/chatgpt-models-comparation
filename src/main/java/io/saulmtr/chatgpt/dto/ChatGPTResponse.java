package io.saulmtr.chatgpt.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ChatGPTResponse implements Serializable{
	private static final long serialVersionUID = 5334960926805172728L;

	private String id;
    
    private List<ChoiceDTO> choices;
    
    private Integer created;
    
    private String model;
    
	@JsonProperty("system_fingerprint")
	private String systemFingerprint;
   
    private String object;

}
