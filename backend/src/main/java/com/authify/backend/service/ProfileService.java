package com.authify.backend.service;

import com.authify.backend.io.ProfileRequest;
import com.authify.backend.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);

    ProfileResponse getProfile(String email);

    void sendResetOtp(String email);

    void resetPassword(String email,String otp,String newPassword);

    void sendOtp(String email);

    void verifyOtp(String email,String otp);

    String getLoggedInUserId(String email);

}
