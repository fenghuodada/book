package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.mediation.C9711d;
import com.vungle.warren.C10118v1;
import com.vungle.warren.InterfaceC10129x;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class VungleInitializer implements InterfaceC10129x {
    private static final VungleInitializer instance = new VungleInitializer();
    private final AtomicBoolean mIsInitializing = new AtomicBoolean(false);
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final ArrayList<VungleInitializationListener> mInitListeners = new ArrayList<>();

    /* loaded from: classes.dex */
    public interface VungleInitializationListener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private VungleInitializer() {
        /*
            r5 = this;
            r5.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r5.mIsInitializing = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r5.mHandler = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.mInitListeners = r0
            com.vungle.warren.VungleApiClient$WrapperFramework r0 = com.vungle.warren.VungleApiClient.WrapperFramework.admob
            r1 = 46
            r2 = 95
            java.lang.String r3 = "6.11.0.0"
            java.lang.String r1 = r3.replace(r1, r2)
            int r2 = com.vungle.warren.C9797g0.f19536a
            java.lang.String r2 = "g0"
            if (r0 == 0) goto L68
            com.vungle.warren.VungleApiClient$WrapperFramework r3 = com.vungle.warren.VungleApiClient.WrapperFramework.none
            if (r0 == r3) goto L68
            java.lang.String r3 = com.vungle.warren.VungleApiClient.f19359C
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.vungle.warren.VungleApiClient.f19359C
            r3.append(r4)
            java.lang.String r4 = ";"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.vungle.warren.VungleApiClient.f19359C = r0
            if (r1 == 0) goto L65
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = com.vungle.warren.VungleApiClient.f19359C
            java.lang.String r4 = "/"
            java.lang.String r0 = androidx.fragment.app.C1431t.m10577a(r0, r3, r4, r1)
            com.vungle.warren.VungleApiClient.f19359C = r0
            goto L6d
        L65:
            java.lang.String r0 = "Wrapper framework version is empty"
            goto L6a
        L68:
            java.lang.String r0 = "Wrapper is null or is not none"
        L6a:
            android.util.Log.e(r2, r0)
        L6d:
            boolean r0 = com.vungle.warren.Vungle.isInitialized()
            if (r0 == 0) goto L78
            java.lang.String r0 = "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before"
            android.util.Log.w(r2, r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.vungle.VungleInitializer.<init>():void");
    }

    public static VungleInitializer getInstance() {
        return instance;
    }

    public void initialize(final String str, final Context context, VungleInitializationListener vungleInitializationListener) {
        if (Vungle.isInitialized()) {
            vungleInitializationListener.onInitializeSuccess();
            return;
        }
        if (!this.mIsInitializing.getAndSet(true)) {
            new Object() { // from class: com.google.ads.mediation.vungle.VungleInitializer.1
                public void onVungleSettingsChanged(@NonNull C10118v1 c10118v1) {
                    if (Vungle.isInitialized()) {
                        VungleInitializer.this.updateCoppaStatus(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
                        Vungle.init(str, context.getApplicationContext(), VungleInitializer.this, c10118v1);
                    }
                }
            };
            updateCoppaStatus(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            if (C9711d.f19262a == null) {
                C10118v1.C10119a c10119a = new C10118v1.C10119a();
                c10119a.f20367a = true;
                C9711d.f19262a = new C10118v1(c10119a);
            }
            Vungle.init(str, context.getApplicationContext(), this, C9711d.f19262a);
        }
        this.mInitListeners.add(vungleInitializationListener);
    }

    @Override // com.vungle.warren.InterfaceC10129x
    public void onAutoCacheAdAvailable(String str) {
    }

    @Override // com.vungle.warren.InterfaceC10129x
    public void onError(VungleException vungleException) {
        final AdError adError = VungleMediationAdapter.getAdError(vungleException);
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleInitializer.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = VungleInitializer.this.mInitListeners.iterator();
                while (it.hasNext()) {
                    ((VungleInitializationListener) it.next()).onInitializeError(adError);
                }
                VungleInitializer.this.mInitListeners.clear();
            }
        });
        this.mIsInitializing.set(false);
    }

    @Override // com.vungle.warren.InterfaceC10129x
    public void onSuccess() {
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleInitializer.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = VungleInitializer.this.mInitListeners.iterator();
                while (it.hasNext()) {
                    ((VungleInitializationListener) it.next()).onInitializeSuccess();
                }
                VungleInitializer.this.mInitListeners.clear();
            }
        });
        this.mIsInitializing.set(false);
    }

    public void updateCoppaStatus(int i) {
        if (i == 0) {
            Vungle.updateUserCoppaStatus(false);
        } else if (i != 1) {
        } else {
            Vungle.updateUserCoppaStatus(true);
        }
    }
}
