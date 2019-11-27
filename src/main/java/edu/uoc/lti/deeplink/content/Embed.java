package edu.uoc.lti.deeplink.content;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@Getter
@Setter
@Builder
@ToString
public class Embed {
	private final String html;
}
