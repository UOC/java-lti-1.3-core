package edu.uoc.lti.namesrole;

import edu.uoc.lti.ContentTypeable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Created by xaracil@uoc.edu
 */
@RequiredArgsConstructor
public enum ContentTypes implements ContentTypeable {
	REQUEST("application", "vnd.ims.lti-nrps.v2.membershipcontainer+json"),
	RESPONSE("application", "vnd.ims-nrps.v2.membershipcontainer+json")
	;

	@Getter
	private final String type;
	@Getter
	private final String subtype;
}
