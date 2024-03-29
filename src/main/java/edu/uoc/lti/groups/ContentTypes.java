package edu.uoc.lti.groups;

import edu.uoc.lti.ContentTypeable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Created by xaracil@uoc.edu
 */
@RequiredArgsConstructor
public enum ContentTypes implements ContentTypeable {
	GROUP("application", "vnd.ims.lti-gs.v1.contextgroupcontainer+json"),
	SET("application", "application/vnd.ims.lti-gs.v1.contextgroupsetcontainer+json")
	;

	@Getter
	private final String type;
	@Getter
	private final String subtype;
}
