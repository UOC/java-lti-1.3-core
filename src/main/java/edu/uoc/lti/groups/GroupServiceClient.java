package edu.uoc.lti.groups;

import java.util.List;

/**
 * Universitat Oberta de Catalunya
 * Made for the project lti-13-core
 */
public interface GroupServiceClient {
	List<Group> getGroups(String userId);
	List<GroupSet> getSets();
}
