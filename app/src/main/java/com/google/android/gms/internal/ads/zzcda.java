package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcda extends zzamq {
    static final zzcda zzb = new zzcda();

    @Override // com.google.android.gms.internal.ads.zzamq
    public final zzamu zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzamw() : "mvhd".equals(str) ? new zzamx() : new zzamy(str);
    }
}
