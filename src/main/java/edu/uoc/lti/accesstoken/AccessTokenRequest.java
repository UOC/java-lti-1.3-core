package edu.uoc.lti.accesstoken;

import lombok.Builder;
import lombok.Value;

/**
 * @author Created by xaracil@uoc.edu
 */
@Value
@Builder
public class AccessTokenRequest {
	private String grant_type;
	private String client_assertion_type;
	private String scope;
	private String client_assertion;
}
