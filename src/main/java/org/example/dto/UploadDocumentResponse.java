package org.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UploadDocumentResponse {
    private String documentIdentifier;
    private String documentDownloadUri;
    private String fileType;
    private long size;
}
