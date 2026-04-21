package com.wintam.service;

import com.wintam.dto.*;

public interface AuthService {
    public MessageResponse createAccount(RegisterRequest request);
    public AuthResponse signInAccount(LoginRequest request);
    AuthResponse verifyEmail(VerifiyRequest request);
    public MessageResponse recoverPassword(RecoverRequest request);
    public MessageResponse resetPassword(ResetPasswordRequest request);
}
