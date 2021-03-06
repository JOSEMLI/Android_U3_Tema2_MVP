package com.example.android_u3_tema2_mvp.Model;

public interface LoginInteractor {
  interface OnLoginFinishedListener {
    void onUsernameError();
    void onPasswordError();
    void onSuccess();
  }
  void login(String username, String password, OnLoginFinishedListener listener);
}
