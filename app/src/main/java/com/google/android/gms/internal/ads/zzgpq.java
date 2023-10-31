package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzgpq extends zzgpu {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgpq() {
        super(null);
    }

    public /* synthetic */ zzgpq(zzgpp zzgppVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzgpn zzgpnVar;
        List list = (List) zzgsa.zzh(obj, j);
        if (list.isEmpty()) {
            List zzgpnVar2 = list instanceof zzgpo ? new zzgpn(i) : ((list instanceof zzgqn) && (list instanceof zzgpf)) ? ((zzgpf) list).zzd(i) : new ArrayList(i);
            zzgsa.zzv(obj, j, zzgpnVar2);
            return zzgpnVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzgpnVar = arrayList;
        } else if (!(list instanceof zzgrv)) {
            if ((list instanceof zzgqn) && (list instanceof zzgpf)) {
                zzgpf zzgpfVar = (zzgpf) list;
                if (zzgpfVar.zzc()) {
                    return list;
                }
                zzgpf zzd = zzgpfVar.zzd(list.size() + i);
                zzgsa.zzv(obj, j, zzd);
                return zzd;
            }
            return list;
        } else {
            zzgpn zzgpnVar3 = new zzgpn(list.size() + i);
            zzgpnVar3.addAll(zzgpnVar3.size(), (zzgrv) list);
            zzgpnVar = zzgpnVar3;
        }
        zzgsa.zzv(obj, j, zzgpnVar);
        return zzgpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgsa.zzh(obj, j);
        if (list instanceof zzgpo) {
            unmodifiableList = ((zzgpo) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgqn) && (list instanceof zzgpf)) {
                zzgpf zzgpfVar = (zzgpf) list;
                if (zzgpfVar.zzc()) {
                    zzgpfVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgsa.zzv(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgsa.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgsa.zzv(obj, j, list);
    }
}
