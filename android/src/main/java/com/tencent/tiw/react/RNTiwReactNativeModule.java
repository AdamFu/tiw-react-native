
package com.tencent.tiw.react;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNTiwReactNativeModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNTiwReactNativeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNTiwReactNative";
  }
}