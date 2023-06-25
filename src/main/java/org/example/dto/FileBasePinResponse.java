package org.example.dto;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Builder
public class FileBasePinResponse {
    private String requestid;
    private String status;
    private OffsetDateTime created;
    private Pin pin;
    private String[] delegates;
    private Info info;

    public String getRequestid() { return requestid; }
    public void setRequestid(String value) { this.requestid = value; }

    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public OffsetDateTime getCreated() { return created; }
    public void setCreated(OffsetDateTime value) { this.created = value; }

    public Pin getPin() { return pin; }
    public void setPin(Pin value) { this.pin = value; }

    public String[] getDelegates() { return delegates; }
    public void setDelegates(String[] value) { this.delegates = value; }

    public Info getInfo() { return info; }
    public void setInfo(Info value) { this.info = value; }


// Info.java


public class Info {
    private String statusDetails;

    public String getStatusDetails() { return statusDetails; }
    public void setStatusDetails(String value) { this.statusDetails = value; }
}

// Pin.java



public class Pin {
    private String cid;
    private String name;
    private String[] origins;
    private Meta meta;

    public String getCid() { return cid; }
    public void setCid(String value) { this.cid = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String[] getOrigins() { return origins; }
    public void setOrigins(String[] value) { this.origins = value; }

    public Meta getMeta() { return meta; }
    public void setMeta(Meta value) { this.meta = value; }
}

// Meta.java


public class Meta {
    private String objectID;

    public String getObjectID() { return objectID; }
    public void setObjectID(String value) { this.objectID = value; }
}
}
