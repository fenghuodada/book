package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfqu extends AbstractSet {
    final /* synthetic */ zzfra zza;

    public zzfqu(zzfra zzfraVar) {
        this.zza = zzfraVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzq;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzq = this.zza.zzq(entry.getKey());
            if (zzq != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfou.zza(objArr[zzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfra zzfraVar = this.zza;
        Map zzj = zzfraVar.zzj();
        return zzj != null ? zzj.entrySet().iterator() : new zzfqs(zzfraVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzp;
        int i;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfra zzfraVar = this.zza;
            if (zzfraVar.zzo()) {
                return false;
            }
            zzp = zzfraVar.zzp();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object zzh = zzfra.zzh(this.zza);
            zzfra zzfraVar2 = this.zza;
            int[] iArr = zzfraVar2.zza;
            iArr.getClass();
            Object[] objArr = zzfraVar2.zzb;
            objArr.getClass();
            Object[] objArr2 = zzfraVar2.zzc;
            objArr2.getClass();
            int zzb = zzfrb.zzb(key, value, zzp, zzh, iArr, objArr, objArr2);
            if (zzb == -1) {
                return false;
            }
            this.zza.zzn(zzb, zzp);
            zzfra zzfraVar3 = this.zza;
            i = zzfraVar3.zzg;
            zzfraVar3.zzg = i - 1;
            this.zza.zzl();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
