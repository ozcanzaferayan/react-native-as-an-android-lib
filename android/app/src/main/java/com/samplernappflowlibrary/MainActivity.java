package com.samplernappflowlibrary;
import android.app.Activity;
import android.os.Bundle;
import com.brentvatne.react.ReactVideoPackage;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
  private ReactRootView mReactRootView;
  public static ReactInstanceManager mReactInstanceManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    SoLoader.init(this, false);
    mReactRootView = new ReactRootView(this);
    List<ReactPackage> packages = new ArrayList<>();
    packages.add(new MainReactPackage(null));
    packages.add(new ReactVideoPackage());
    mReactInstanceManager = ReactInstanceManager.builder()
            .setApplication(getApplication())
            .setCurrentActivity(this)
            .setBundleAssetName("index.android.bundle")
            .setJSMainModulePath("index")
            .addPackages(packages)
            .setUseDeveloperSupport(BuildConfig.DEBUG)
            .setInitialLifecycleState(LifecycleState.RESUMED)
            .build();
    mReactRootView.startReactApplication(mReactInstanceManager,
            "SampleRNAppFlowLibrary",
            null);
    setContentView(mReactRootView);
  }
}
