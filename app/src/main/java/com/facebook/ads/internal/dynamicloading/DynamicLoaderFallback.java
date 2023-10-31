package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes.dex */
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$a */
    /* loaded from: classes.dex */
    public class C3901a implements InvocationHandler {

        /* renamed from: a */
        public final /* synthetic */ List f9995a;

        /* renamed from: b */
        public final /* synthetic */ Map f9996b;

        /* renamed from: c */
        public final /* synthetic */ List f9997c;

        /* renamed from: d */
        public final /* synthetic */ List f9998d;

        /* renamed from: e */
        public final /* synthetic */ Map f9999e;

        /* renamed from: f */
        public final /* synthetic */ List f10000f;

        /* renamed from: g */
        public final /* synthetic */ List f10001g;

        /* renamed from: h */
        public final /* synthetic */ Method f10002h;

        /* renamed from: i */
        public final /* synthetic */ Method f10003i;

        public C3901a(ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
            this.f9995a = arrayList;
            this.f9996b = hashMap;
            this.f9997c = arrayList2;
            this.f9998d = arrayList3;
            this.f9999e = hashMap2;
            this.f10000f = arrayList4;
            this.f10001g = arrayList5;
            this.f10002h = method;
            this.f10003i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Map map;
            boolean isPrimitive = method.getReturnType().isPrimitive();
            Map map2 = this.f9996b;
            if (isPrimitive) {
                if (method.getReturnType().equals(Void.TYPE)) {
                    Iterator it = this.f9995a.iterator();
                    while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, map2))) {
                    }
                    for (Method method2 : this.f9997c) {
                        if (DynamicLoaderFallback.equalsMethods(method, method2) && DynamicLoaderFallback.reportError(obj, map2)) {
                            return null;
                        }
                    }
                    return null;
                }
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                Object newProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                Iterator it2 = this.f9998d.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    map = this.f9999e;
                    if (hasNext) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method method3 : this.f10000f) {
                    if (DynamicLoaderFallback.equalsMethods(method, method3)) {
                        map.put(newProxyInstance, obj);
                    }
                }
                for (Method method4 : this.f10001g) {
                    if (DynamicLoaderFallback.equalsMethods(method, method4)) {
                        for (Object obj2 : objArr) {
                            if (obj2 instanceof InterfaceC3877Ad) {
                                map2.put(newProxyInstance, (InterfaceC3877Ad) obj2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f10002h)) {
                    map2.put(objArr[1], (InterfaceC3877Ad) objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f10003i)) {
                    map2.put(objArr[1], (InterfaceC3877Ad) objArr[0]);
                }
                return newProxyInstance;
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$b */
    /* loaded from: classes.dex */
    public class RunnableC3902b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdListener f10004a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC3877Ad f10005b;

        public RunnableC3902b(AdListener adListener, InterfaceC3877Ad interfaceC3877Ad) {
            this.f10004a = adListener;
            this.f10005b = interfaceC3877Ad;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10004a.onError(this.f10005b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$c */
    /* loaded from: classes.dex */
    public static class C3903c {
        @Nullable

        /* renamed from: a */
        public Method f10006a;

        /* renamed from: b */
        public final C3904a f10007b = new C3904a();

        /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$c$a */
        /* loaded from: classes.dex */
        public class C3904a implements InvocationHandler {
            public C3904a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            @Nullable
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (!"toString".equals(method.getName())) {
                    C3903c.this.f10006a = method;
                    return null;
                }
                return null;
            }
        }

        /* renamed from: a */
        public final <T> T m6364a(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f10007b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C3903c c3903c = new C3903c();
        DynamicLoader dynamicLoader = (DynamicLoader) c3903c.m6364a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(c3903c.f10006a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(c3903c.f10006a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(c3903c.f10006a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(c3903c.f10006a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = c3903c.f10006a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = c3903c.f10006a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) c3903c.m6364a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(c3903c.f10006a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(c3903c.f10006a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(c3903c.f10006a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) c3903c.m6364a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(c3903c.f10006a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(c3903c.f10006a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(c3903c.f10006a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) c3903c.m6364a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(c3903c.f10006a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(c3903c.f10006a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(c3903c.f10006a);
        AdViewApi adViewApi = (AdViewApi) c3903c.m6364a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(c3903c.f10006a);
        adViewApi.loadAd(null);
        arrayList2.add(c3903c.f10006a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(c3903c.f10006a);
        ((AdView.AdViewLoadConfigBuilder) c3903c.m6364a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(c3903c.f10006a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) c3903c.m6364a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(c3903c.f10006a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) c3903c.m6364a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(c3903c.f10006a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) c3903c.m6364a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(c3903c.f10006a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new C3901a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(@Nullable Object obj, Map<Object, InterfaceC3877Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        InterfaceC3877Ad interfaceC3877Ad = map.get(obj);
        if (adListener != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3902b(adListener, interfaceC3877Ad), 500L);
            return true;
        }
        return false;
    }
}
