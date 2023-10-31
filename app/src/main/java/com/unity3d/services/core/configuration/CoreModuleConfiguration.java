package com.unity3d.services.core.configuration;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.api.Broadcast;
import com.unity3d.services.core.api.Cache;
import com.unity3d.services.core.api.ClassDetection;
import com.unity3d.services.core.api.Connectivity;
import com.unity3d.services.core.api.DeviceInfo;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.api.Permissions;
import com.unity3d.services.core.api.Preferences;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.api.Resolve;
import com.unity3d.services.core.api.Sdk;
import com.unity3d.services.core.api.SensorInfo;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.broadcast.C9466d;
import com.unity3d.services.core.cache.C9471e;
import com.unity3d.services.core.connectivity.C9488c;
import com.unity3d.services.core.device.C9492a;
import com.unity3d.services.core.device.C9503e;
import com.unity3d.services.core.device.C9512i;
import com.unity3d.services.core.device.C9515k;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.C9588l;
import com.unity3d.services.core.request.metrics.C9604i;

/* loaded from: classes3.dex */
public class CoreModuleConfiguration implements IModuleConfiguration {

    /* renamed from: com.unity3d.services.core.configuration.CoreModuleConfiguration$a */
    /* loaded from: classes3.dex */
    public class RunnableC9474a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsInitializationError f18676a;

        /* renamed from: b */
        final /* synthetic */ String f18677b;

        public RunnableC9474a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            this.f18676a = unityAdsInitializationError;
            this.f18677b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9572d.m1950a(this.f18676a, this.f18677b);
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.CoreModuleConfiguration$b */
    /* loaded from: classes3.dex */
    public class RunnableC9475b implements Runnable {
        public RunnableC9475b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9572d.m1920t();
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.CoreModuleConfiguration$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9476c {

        /* renamed from: a */
        static final /* synthetic */ int[] f18680a;

        static {
            int[] iArr = new int[ErrorState.values().length];
            f18680a = iArr;
            try {
                iArr[ErrorState.CreateWebApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18680a[ErrorState.InitModules.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return new Class[]{Broadcast.class, Cache.class, Connectivity.class, DeviceInfo.class, ClassDetection.class, Storage.class, Sdk.class, Request.class, Resolve.class, Intent.class, Lifecycle.class, Preferences.class, SensorInfo.class, Permissions.class};
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration) {
        C9604i.m1837b(configuration);
        InitializationNotificationCenter.getInstance().triggerOnSdkInitialized();
        C9564j.m1991a(new RunnableC9475b());
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        UnityAds.UnityAdsInitializationError unityAdsInitializationError;
        C9604i.m1837b(configuration);
        int i = C9476c.f18680a[errorState.ordinal()];
        if (i == 1) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
        } else if (i != 2) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
            str = "Unity Ads failed to initialize due to internal error";
        } else {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED;
        }
        InitializationNotificationCenter.getInstance().triggerOnSdkInitializationFailed(str, errorState, 0);
        C9564j.m1991a(new RunnableC9474a(unityAdsInitializationError, str));
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initModuleState(Configuration configuration) {
        C9604i.m1837b(configuration);
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration) {
        C9604i.m1837b(configuration);
        C9466d.m2250a();
        C9471e.m2242a();
        C9588l.m1872b();
        C9488c.m2183f();
        C9512i.m2086a(C9568a.m1959e());
        C9492a.m2175b(C9568a.m1959e());
        C9503e.m2099b(C9568a.m1959e());
        C9515k.m2078b();
        return true;
    }
}
