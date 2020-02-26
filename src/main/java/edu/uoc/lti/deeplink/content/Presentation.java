package edu.uoc.lti.deeplink.content;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Created by xaracil@uoc.edu
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
/*
 * To fix an issue with Moodle 3.8 
 * Moodle adds "locale". The @JsonIgnoreProperties annotation ignores unknown property
 * @author heutelbeck
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Presentation {
	@JsonProperty("document_target")
	private String documentTarget;
	private int width;
	private int height;
	@JsonProperty("return_url")
	private String returnUrl;
}
