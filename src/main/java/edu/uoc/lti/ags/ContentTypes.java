package edu.uoc.lti.ags;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@RequiredArgsConstructor
public enum ContentTypes {
	ITEM("application", "vnd.ims.lis.v2.lineitem+json"),
	CONTAINER("application", "vnd.ims.lis.v2.lineitemcontainer+json")
	;

	@Getter
	private final String type;
	@Getter
	private final String subtype;
}
