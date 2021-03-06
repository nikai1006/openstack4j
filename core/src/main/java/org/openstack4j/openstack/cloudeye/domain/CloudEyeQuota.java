package org.openstack4j.openstack.cloudeye.domain;

import java.util.List;

import org.openstack4j.model.cloudeye.Quota;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("quotas")
public class CloudEyeQuota implements Quota {
	
    List<CloudEyeResource> resources;
}
