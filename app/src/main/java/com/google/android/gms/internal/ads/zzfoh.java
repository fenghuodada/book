package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfoh extends zzfog {
    private final char zza;

    public zzfoh(char c) {
        this.zza = c;
    }

    public final String toString() {
        int i = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return C0663f.m12005a("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final boolean zzb(char c) {
        return c == this.zza;
    }
}
