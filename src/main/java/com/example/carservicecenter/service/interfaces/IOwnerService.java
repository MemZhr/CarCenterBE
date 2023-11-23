package com.example.carservicecenter.service.interfaces;

import com.example.carservicecenter.model.Owner;

public interface IOwnerService {
    public Owner findOwnerById(Integer ownerId);
    public Object findCarCenterByOwnerId( Integer ownerId);

    void updateOwner(Owner owner, Integer ownerId);

    void updateOwnerName(String name, Integer ownerId);

    void deleteOwnerById(Integer ownerId);
}
