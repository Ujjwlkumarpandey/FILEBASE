package org.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileBasePinRequest {

    private String cid;
    private String name;
    Meta MetaObject;


    // Getter Methods

    public String getCid() {
        return cid;
    }

    public String getName() {
        return name;
    }

    public Meta getMeta() {
        return MetaObject;
    }

    // Setter Methods

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeta(Meta metaObject) {
        this.MetaObject = metaObject;
    }

    public class Meta {
        private String key_name;


        // Getter Methods

        public String getKey_name() {
            return key_name;
        }

        // Setter Methods

        public void setKey_name(String key_name) {
            this.key_name = key_name;
        }
    }
}

