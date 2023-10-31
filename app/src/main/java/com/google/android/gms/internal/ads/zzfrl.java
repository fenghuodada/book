package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzfrl {
    public static int zze(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract zzfrl zzb(Object obj);
}
