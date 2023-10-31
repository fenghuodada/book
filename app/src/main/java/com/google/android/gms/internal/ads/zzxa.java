package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzxa extends zzxd {
    @Nullable
    private zzwz zza;

    public abstract Pair zzb(zzwz zzwzVar, int[][][] iArr, int[] iArr2, zztl zztlVar, zzcx zzcxVar) throws zzia;

    @Override // com.google.android.gms.internal.ads.zzxd
    public final zzxe zzn(zzlf[] zzlfVarArr, zzvk zzvkVar, zztl zztlVar, zzcx zzcxVar) throws zzia {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcz[][] zzczVarArr = new zzcz[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzvkVar.zzc;
            zzczVarArr[i] = new zzcz[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzlfVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzvkVar.zzc) {
            zzcz zzb = zzvkVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzlf zzlfVar = zzlfVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, zzlfVar.zzQ(zzb.zzb(i11)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i10;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[1];
            } else {
                zzlf zzlfVar2 = zzlfVarArr[i7];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zzlfVar2.zzQ(zzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i7];
            zzczVarArr[i7][i13] = zzb;
            iArr3[i7][i13] = iArr;
            iArr2[i7] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzvk[] zzvkVarArr = new zzvk[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zzvkVarArr[i14] = new zzvk((zzcz[]) zzfn.zzF(zzczVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzfn.zzF(iArr3[i14], i15);
            strArr[i14] = zzlfVarArr[i14].zzM();
            iArr6[i14] = zzlfVarArr[i14].zzb();
            i14++;
            i3 = 2;
        }
        int i16 = i3;
        zzwz zzwzVar = new zzwz(strArr, iArr6, zzvkVarArr, iArr4, iArr3, new zzvk((zzcz[]) zzfn.zzF(zzczVarArr[i16], iArr2[i16])));
        Pair zzb2 = zzb(zzwzVar, iArr3, iArr4, zztlVar, zzcxVar);
        zzxb[] zzxbVarArr = (zzxb[]) zzb2.second;
        List[] listArr = new List[zzxbVarArr.length];
        for (int i17 = 0; i17 < zzxbVarArr.length; i17++) {
            zzxb zzxbVar = zzxbVarArr[i17];
            listArr[i17] = zzxbVar != null ? zzfrr.zzm(zzxbVar) : zzfrr.zzl();
        }
        zzfro zzfroVar = new zzfro();
        for (int i18 = 0; i18 < 2; i18++) {
            zzvk zzd = zzwzVar.zzd(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < zzd.zzc; i19++) {
                zzcz zzb3 = zzd.zzb(i19);
                boolean z4 = zzwzVar.zza(i18, i19, false) != 0;
                int i20 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr7[i21] = zzwzVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzxb zzxbVar2 = (zzxb) list.get(i22);
                        if (zzxbVar2.zze().equals(zzb3) && zzxbVar2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfroVar.zzf(new zzdh(zzb3, z4, iArr7, zArr));
            }
        }
        zzvk zze = zzwzVar.zze();
        for (int i23 = 0; i23 < zze.zzc; i23++) {
            zzcz zzb4 = zze.zzb(i23);
            int i24 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfroVar.zzf(new zzdh(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzxe((zzlg[]) zzb2.first, (zzwx[]) zzb2.second, new zzdi(zzfroVar.zzi()), zzwzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzo(@Nullable Object obj) {
        this.zza = (zzwz) obj;
    }
}
