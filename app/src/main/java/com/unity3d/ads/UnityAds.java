package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.C9292a;
import com.unity3d.services.ads.C9293a;

/* loaded from: classes3.dex */
public final class UnityAds {

    /* loaded from: classes3.dex */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* loaded from: classes3.dex */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* loaded from: classes3.dex */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* loaded from: classes3.dex */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    /* renamed from: com.unity3d.ads.UnityAds$a */
    /* loaded from: classes3.dex */
    public static class C9264a implements IUnityAdsLoadListener {
        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAdsLoadError unityAdsLoadError, String str2) {
        }
    }

    public static boolean getDebugMode() {
        return C9293a.m2524a();
    }

    public static String getToken() {
        return C9293a.m2515b();
    }

    public static void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        C9293a.m2519a(iUnityAdsTokenListener);
    }

    public static String getVersion() {
        return C9293a.m2514c();
    }

    public static void initialize(Context context, String str) {
        C9293a.m2521a(context, str, false, (IUnityAdsInitializationListener) null);
    }

    public static void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        C9293a.m2521a(context, str, false, iUnityAdsInitializationListener);
    }

    public static void initialize(Context context, String str, boolean z) {
        C9293a.m2521a(context, str, z, (IUnityAdsInitializationListener) null);
    }

    public static void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        C9293a.m2521a(context, str, z, iUnityAdsInitializationListener);
    }

    public static boolean isInitialized() {
        return C9292a.m2526c();
    }

    public static boolean isSupported() {
        return C9293a.m2512e();
    }

    @Deprecated
    public static void load(String str) {
        load(str, new C9264a());
    }

    public static void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        C9293a.m2517a(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        C9293a.m2517a(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public static void setDebugMode(boolean z) {
        C9293a.m2516a(z);
    }

    @Deprecated
    public static void show(Activity activity, String str) {
        C9293a.m2523a(activity, str, (IUnityAdsShowListener) null);
    }

    public static void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        C9293a.m2523a(activity, str, iUnityAdsShowListener);
    }

    @Deprecated
    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        C9293a.m2522a(activity, str, unityAdsShowOptions, (IUnityAdsShowListener) null);
    }

    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        C9293a.m2522a(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }
}
