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
package org.openstack4j.openstack.storage.block.domain.ext;

import java.util.Date;
import java.util.List;

import org.openstack4j.model.storage.block.ext.Service;
import org.openstack4j.openstack.common.ListResult;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;

@JsonRootName("service")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtService implements Service {

    private static final long serialVersionUID = 1L;

    private String binary;

    @JsonProperty("disabled_reason")
    private String disabledReason;

    private String host;

    private String id;

    private State state;

    private Status status;

    @JsonProperty("updated_at")
    private Date updatedAt;

    private String zone;

    @Override
    public String getBinary() {
        return binary;
    }

    @Override
    public String getDisabledReason() {
        return disabledReason;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String getZone() {
        return zone;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues().add("id", id).add("binary", binary).add("host", host)
                .add("zone", zone).add("status", status).add("state", state).add("updated_at", updatedAt)
                .add("disabled_reason", disabledReason).toString();
    }

    public static class Services extends ListResult<ExtService> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("services")
        private List<ExtService> services;

        public List<ExtService> value() {
            return services;
        }
    }

}