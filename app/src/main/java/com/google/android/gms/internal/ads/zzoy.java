package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;

/* loaded from: classes.dex */
public final class zzoy extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzoy(int i, zzam zzamVar, boolean z) {
        super(C0235r.m12816a("AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzamVar;
    }
}
