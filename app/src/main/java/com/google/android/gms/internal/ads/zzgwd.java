package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.AbstractServiceConnectionC0460c;
import androidx.browser.customtabs.C0459b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzgwd extends AbstractServiceConnectionC0460c {
    private final WeakReference zza;

    public zzgwd(zzbcl zzbclVar) {
        this.zza = new WeakReference(zzbclVar);
    }

    @Override // androidx.browser.customtabs.AbstractServiceConnectionC0460c
    public final void onCustomTabsServiceConnected(ComponentName componentName, C0459b c0459b) {
        zzbcl zzbclVar = (zzbcl) this.zza.get();
        if (zzbclVar != null) {
            zzbclVar.zzc(c0459b);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbcl zzbclVar = (zzbcl) this.zza.get();
        if (zzbclVar != null) {
            zzbclVar.zzd();
        }
    }
}
