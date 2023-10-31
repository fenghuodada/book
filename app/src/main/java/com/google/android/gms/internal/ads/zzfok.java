package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzfok implements zzfpa {
    public static zzfok zzc(char c) {
        return new zzfoh(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
