/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package org.openstack4j.openstack.senlin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.openstack4j.model.senlin.Event;
import org.openstack4j.openstack.common.ListResult;

import java.util.Date;
import java.util.List;

/**
 * This is a model of a senlinEvent. It uses Jackson annotations for
 * (de)serialization into JSON format
 * 
 * @author lion
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("event")
public class SenlinEvent implements Event {
	private static final long serialVersionUID = -8305526522823061209L;

	@JsonProperty("action")
	private String action;
	@JsonProperty("cluster_id")
	private String clusterID;
	@JsonProperty("id")
	private String id;
	@JsonProperty("level")
	private Integer level;
	@JsonProperty("obj_id")
	private String objID;
	@JsonProperty("obj_name")
	private String objName;
	@JsonProperty("obj_type")
	private String objType;
	@JsonProperty("project")
	private String project;
	@JsonProperty("status")
	private String status;
	@JsonProperty("status_reason")
	private String statusReason;
	@JsonProperty("timestamp")
	private Date timestamp;
	@JsonProperty("user")
	private String user;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getAction() {
		return action;
	}

	@Override
	public String getClusterID() {
		return clusterID;
	}

	@Override
	public Integer getLevel() {
		return level;
	}

	@Override
	public String getObjID() {
		return objID;
	}

	@Override
	public String getObjName() {
		return objName;
	}

	@Override
	public String getObjType() {
		return objType;
	}

	@Override
	public String getProject() {
		return project;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public String getStatusReason() {
		return statusReason;
	}

	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	@Override
	public String getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "SenlinEvent{" +
				"action='" + action + '\'' +
				", cluster_id='" + clusterID + '\'' +
				", id='" + id + '\'' +
				", level='" + level + '\'' +
				", obj_id='" + objID + '\'' +
				", obj_name='" + objName + '\'' +
				", obj_type='" + objType + '\'' +
				", project='" + project + '\'' +
				", status='" + status + '\'' +
				", status_reason='" + statusReason + '\'' +
				", timestamp='" + timestamp + '\'' +
				", user='" + user + '\'' +
				'}';
	}

	/**
	 * An inner class for representing lists of senlinEvent
	 * 
	 * @author lion
	 * 
	 */
	public static class Event extends ListResult<SenlinEvent> {
		private static final long serialVersionUID = 7647975201092736501L;

		@JsonProperty("events")
		private List<SenlinEvent> list;

		protected List<SenlinEvent> value() {
			return list;
		}
	}
}
