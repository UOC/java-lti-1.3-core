package edu.uoc.lti.oidc;

/**
 * Represents a session for storing OIDC launch params (currently state and nonce)
 * A tool rely on this to allow OIDC launches. So, a conformant class must be passed to the tool as a constructor
 * parameter
 * @author Created by xaracil@uoc.edu
 */
public interface OIDCLaunchSession {
	/**
	 * Save state in session
	 * @param state state to save
	 */
	void setState(String state);
	/**
	 * Save nonce in session
	 * @param nonce nonce to save
	 */
	void setNonce(String nonce);

	/**
	 * Save target_link_uri in session
	 * @param targetLinkUri target_link_uri to save
	 */
	void setTargetLinkUri(String targetLinkUri);

	/**
	 * Save clientId in session
	 * @param clientId clientId to save
	 */
	void setClientId(String clientId);

	/**
	 * Save deploymentId in session
	 * @param deploymentId deploymentId to save
	 */
	void setDeploymentId(String deploymentId);

	/**
	 * Get state from session
	 * @return saved state
	 */
	String getState();

	/**
	 * Get nonce from session
	 * @return saved nonce
	 */
	String getNonce();

	/**
	 * Get target_link_uri from session
	 * @return target_link_uri
	 */
	String getTargetLinkUri();

	/**
	 * Get clientId from session
	 * @return saved clientId
	 */
	String getClientId();

	/**
	 * Get deploymentId from session
	 * @return saved deploymentId
	 */
	String getDeploymentId();
}
