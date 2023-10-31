package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.provider.C0761g;

/* loaded from: classes.dex */
public final class zzala {
    private final String zza;
    private final String zzb;

    public zzala(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzala.class == obj.getClass()) {
            zzala zzalaVar = (zzala) obj;
            if (TextUtils.equals(this.zza, zzalaVar.zza) && TextUtils.equals(this.zzb, zzalaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        return C0761g.m11824a("Header[name=", this.zza, ",value=", this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
