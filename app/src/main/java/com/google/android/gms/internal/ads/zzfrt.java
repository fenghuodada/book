package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfrt {
    Object[] zza;
    int zzb;
    zzfrs zzc;

    public zzfrt() {
        this(4);
    }

    public zzfrt(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfrl.zze(length, i2));
        }
    }

    public final zzfrt zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfqo.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfrt zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfru zzc() {
        zzfrs zzfrsVar = this.zzc;
        if (zzfrsVar == null) {
            zzftg zzi = zzftg.zzi(this.zzb, this.zza, this);
            zzfrs zzfrsVar2 = this.zzc;
            if (zzfrsVar2 == null) {
                return zzi;
            }
            throw zzfrsVar2.zza();
        }
        throw zzfrsVar.zza();
    }
}
