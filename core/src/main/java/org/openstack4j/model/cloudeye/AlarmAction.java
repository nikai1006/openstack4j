package org.openstack4j.model.cloudeye;

import org.openstack4j.model.ModelEntity;

import java.util.List;

/**
 * Created by coa.ke on 6/24/17.
 */
public interface AlarmAction extends ModelEntity {
    AlarmType getType();
    List<String> getNotificationlist();
}
