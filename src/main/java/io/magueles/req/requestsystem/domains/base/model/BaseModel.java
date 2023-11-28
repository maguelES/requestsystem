package io.magueles.req.requestsystem.domains.base.model;

import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseModel {

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
    
}
