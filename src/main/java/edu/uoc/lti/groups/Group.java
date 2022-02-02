package edu.uoc.lti.groups;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Group {

	/**
	 * The unique identifier for the context group. This identifier must be unique within all context groups for the current context and MUST remain stable between requests.
	 */
	private String id;

	/**
	 * The human readable name for the context group. The tool MAY use this value to display to end users.
	 */
	private String name;

	/**
	 * A string value identifying the purpose of that group.
	 */
	private String tag;

	/**
	 * The id of the set that group belongs to.
	 */
	@JsonProperty("set_id")
	private String setId;
}
