package edu.uoc.lti.clientcredentials;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Xavi Aracil <xaracil@uoc.edu>
 */
@RequiredArgsConstructor
@Getter
public class ClientCredentialsRequest {
	private final String kid;
	private final String toolName;
	private final String clientId;
	private final String oauth2Url;
}
