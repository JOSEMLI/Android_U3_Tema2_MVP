package com.example.android_u3_tema2_mvp.Model;

import android.os.Handler;
import android.text.TextUtils;

public class LoginInteractorImpl  implements LoginInteractor{
  @Override
  public void login(final String username, final String password, final OnLoginFinishedListener listener) {
    new Handler().postDelayed(new Runnable(){
      @Override
      public void run() {
        if(TextUtils.isEmpty(username)){
          listener.onUsernameError();
          return;
        }
        if(TextUtils.isEmpty(password)){
          listener.onPasswordError();
          return;
        }
        //aqui esta la consulta en el servidor
        //respuesta correcta
        listener.onSuccess();
        //respuesta negativa
      }
    }, 1000);
  }
}
