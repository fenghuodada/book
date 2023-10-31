package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* loaded from: classes.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i) {
    }

    @CanIgnoreReturnValue
    public final zzaa zza(Object obj) {
        obj.getClass();
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            this.zzb = i2 + 1;
            objArr2[i2] = obj;
            return this;
        }
        int i3 = length + (length >> 1) + 1;
        if (i3 < i) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i3);
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i22 = this.zzb;
        this.zzb = i22 + 1;
        objArr22[i22] = obj;
        return this;
    }
}
