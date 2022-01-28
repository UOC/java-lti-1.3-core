package edu.uoc.lti.groups;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * Universitat Oberta de Catalunya
 * Made for the project lti-13-core
 */
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GroupSet {
	/**
	 * The unique identifier for the context group set. This identifier must be unique within all context group sets for the current context and MUST remain stable between requests.
	 */
	private String id;

	/**
	 * The human readable name for the context group set. The tool MAY use this value to display to end users.
	 */
	private String name;
}
