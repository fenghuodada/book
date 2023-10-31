package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqf implements zzeqq {
    private final zzfwc zza;
    private final Context zzb;
    private final zzbzz zzc;

    public zzeqf(zzfwc zzfwcVar, Context context, zzbzz zzbzzVar) {
        this.zza = zzfwcVar;
        this.zzb = context;
        this.zzc = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqf.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqg zzc() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        String str = this.zzc.zza;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzB = com.google.android.gms.ads.internal.util.zzs.zzB();
        com.google.android.gms.ads.internal.zzt.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        return new zzeqg(isCallerInstantApp, zzA, str, zzB, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(this.zzb, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzb, ModuleDescriptor.MODULE_ID));
    }
}
