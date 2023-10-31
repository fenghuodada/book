package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzfxv {
    private final Class zza;
    private zzfxw zzd;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private final List zzc = new ArrayList();
    private zzggx zze = zzggx.zza;

    public /* synthetic */ zzfxv(Class cls, zzfxu zzfxuVar) {
        this.zza = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzfxv zze(@javax.annotation.Nullable java.lang.Object r13, @javax.annotation.Nullable java.lang.Object r14, com.google.android.gms.internal.ads.zzgkg r15, boolean r16) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxv.zze(java.lang.Object, java.lang.Object, com.google.android.gms.internal.ads.zzgkg, boolean):com.google.android.gms.internal.ads.zzfxv");
    }

    public final zzfxv zza(@Nullable Object obj, @Nullable Object obj2, zzgkg zzgkgVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgkgVar, false);
        return this;
    }

    public final zzfxv zzb(@Nullable Object obj, @Nullable Object obj2, zzgkg zzgkgVar) throws GeneralSecurityException {
        zze(obj, obj2, zzgkgVar, true);
        return this;
    }

    public final zzfxv zzc(zzggx zzggxVar) {
        if (this.zzb != null) {
            this.zze = zzggxVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzfya zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzfya zzfyaVar = new zzfya(concurrentMap, this.zzc, this.zzd, this.zze, this.zza, null);
            this.zzb = null;
            return zzfyaVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
