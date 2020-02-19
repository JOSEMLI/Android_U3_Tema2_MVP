package com.example.android_u3_tema2_mvp.Presenter;

import com.example.android_u3_tema2_mvp.Model.LoginInteractor;
import com.example.android_u3_tema2_mvp.View.LoginView;

public class LoginPresenterImpl  implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {
  private LoginView loginView;
  private LoginInteractor loginInteractor;
  public LoginPresenterImpl(LoginView loginView, LoginInteractor loginInteractor) {
    this.loginView = loginView;
    this.loginInteractor = loginInteractor;
  }
  @Override
  public void validateCredentials(String username, String password) {
    loginView.showProgress();
    loginInteractor.login(username,password,this);
  }
  @Override
  public void onUsernameError() {
    loginView.setUserNameError();
    loginView.HideProgress();
  }
  @Override
  public void onPasswordError() {
    loginView.setPasswordError();
    loginView.HideProgress();
  }
  @Override
  public void onSuccess() {
    loginView.HideProgress();
    loginView.navigateToHome();
  }
}
