package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgqu {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgqu() {
    }

    public /* synthetic */ zzgqu(zzgqt zzgqtVar) {
    }

    public static /* bridge */ /* synthetic */ zzgno zza(zzgqu zzgquVar, zzgno zzgnoVar, zzgno zzgnoVar2) {
        zzgquVar.zzb(zzgnoVar);
        zzgquVar.zzb(zzgnoVar2);
        zzgno zzgnoVar3 = (zzgno) zzgquVar.zza.pop();
        while (!zzgquVar.zza.isEmpty()) {
            zzgnoVar3 = new zzgqy((zzgno) zzgquVar.zza.pop(), zzgnoVar3);
        }
        return zzgnoVar3;
    }

    private final void zzb(zzgno zzgnoVar) {
        zzgno zzgnoVar2;
        zzgno zzgnoVar3;
        if (!zzgnoVar.zzh()) {
            if (!(zzgnoVar instanceof zzgqy)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgnoVar.getClass())));
            }
            zzgqy zzgqyVar = (zzgqy) zzgnoVar;
            zzgnoVar2 = zzgqyVar.zzd;
            zzb(zzgnoVar2);
            zzgnoVar3 = zzgqyVar.zze;
            zzb(zzgnoVar3);
            return;
        }
        int zzc = zzc(zzgnoVar.zzd());
        int zzc2 = zzgqy.zzc(zzc + 1);
        if (this.zza.isEmpty() || ((zzgno) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgnoVar);
            return;
        }
        int zzc3 = zzgqy.zzc(zzc);
        zzgno zzgnoVar4 = (zzgno) this.zza.pop();
        while (!this.zza.isEmpty() && ((zzgno) this.zza.peek()).zzd() < zzc3) {
            zzgnoVar4 = new zzgqy((zzgno) this.zza.pop(), zzgnoVar4);
        }
        zzgqy zzgqyVar2 = new zzgqy(zzgnoVar4, zzgnoVar);
        while (!this.zza.isEmpty()) {
            if (((zzgno) this.zza.peek()).zzd() >= zzgqy.zzc(zzc(zzgqyVar2.zzd()) + 1)) {
                break;
            }
            zzgqyVar2 = new zzgqy((zzgno) this.zza.pop(), zzgqyVar2);
        }
        this.zza.push(zzgqyVar2);
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgqy.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
