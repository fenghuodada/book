package com.google.ads.mediation.vungle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.mediation.C9706b;
import com.vungle.mediation.C9710c;
import com.vungle.warren.InterfaceC9782e0;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class VunglePlayAdCallback implements InterfaceC9782e0 {
    private final WeakReference<C9706b> adapterReference;
    private final WeakReference<InterfaceC9782e0> callbackReference;
    private final VungleBannerAd vungleBannerAd;

    public VunglePlayAdCallback(@NonNull InterfaceC9782e0 interfaceC9782e0, @NonNull C9706b c9706b, @Nullable VungleBannerAd vungleBannerAd) {
        this.callbackReference = new WeakReference<>(interfaceC9782e0);
        this.adapterReference = new WeakReference<>(c9706b);
        this.vungleBannerAd = vungleBannerAd;
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdClick(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.callbackReference.get();
        C9706b c9706b = this.adapterReference.get();
        if (interfaceC9782e0 != null && c9706b != null && c9706b.f19254m) {
            interfaceC9782e0.onAdClick(str);
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdEnd(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.callbackReference.get();
        C9706b c9706b = this.adapterReference.get();
        if (interfaceC9782e0 != null && c9706b != null && c9706b.f19254m) {
            interfaceC9782e0.onAdEnd(str);
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    @Deprecated
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdLeftApplication(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.callbackReference.get();
        C9706b c9706b = this.adapterReference.get();
        if (interfaceC9782e0 != null && c9706b != null && c9706b.f19254m) {
            interfaceC9782e0.onAdLeftApplication(str);
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdRewarded(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.callbackReference.get();
        C9706b c9706b = this.adapterReference.get();
        if (interfaceC9782e0 != null && c9706b != null && c9706b.f19254m) {
            interfaceC9782e0.onAdRewarded(str);
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdStart(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.callbackReference.get();
        C9706b c9706b = this.adapterReference.get();
        if (interfaceC9782e0 != null && c9706b != null && c9706b.f19254m) {
            interfaceC9782e0.onAdStart(str);
        }
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdViewed(String str) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onError(String str, VungleException vungleException) {
        C9710c.m1656c().m1653f(str, this.vungleBannerAd);
        InterfaceC9782e0 interfaceC9782e0 = this.callbackReference.get();
        C9706b c9706b = this.adapterReference.get();
        if (interfaceC9782e0 != null && c9706b != null && c9706b.f19254m) {
            interfaceC9782e0.onError(str, vungleException);
        }
    }
}
