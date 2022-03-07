package com.fb.awsimageupload.profile;

import com.fb.awsimageupload.datastore.UserProfileDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final UserProfileDataStore userProfileDataStore;

    @Autowired
    public UserProfileDataAccessService(UserProfileDataStore userProfileDataStore) {
        this.userProfileDataStore = userProfileDataStore;
    }

    List<UserProfile> getUserProfiles() {
        return userProfileDataStore.getUserProfiles();
    }
}
