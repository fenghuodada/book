package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class zzfps extends zzftr {
    @CheckForNull
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        zzfoz.zzh(this.zzb != 4);
        int i = this.zzb;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 2) {
                    this.zzb = 4;
                    this.zza = zza();
                    if (this.zzb != 3) {
                        this.zzb = 1;
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @CheckForNull
    public abstract Object zza();

    @CheckForNull
    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
