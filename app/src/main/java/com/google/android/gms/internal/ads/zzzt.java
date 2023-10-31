package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzzt {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    @Nullable
    public final String zzi;

    private zzzt(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, @Nullable String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = f;
        this.zzi = str;
    }

    public static zzzt zza(zzfd zzfdVar) throws zzce {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        float f;
        try {
            zzfdVar.zzG(4);
            int zzk = (zzfdVar.zzk() & 3) + 1;
            if (zzk != 3) {
                ArrayList arrayList = new ArrayList();
                int zzk2 = zzfdVar.zzk() & 31;
                for (int i6 = 0; i6 < zzk2; i6++) {
                    arrayList.add(zzb(zzfdVar));
                }
                int zzk3 = zzfdVar.zzk();
                for (int i7 = 0; i7 < zzk3; i7++) {
                    arrayList.add(zzb(zzfdVar));
                }
                if (zzk2 > 0) {
                    zzev zzd = zzew.zzd((byte[]) arrayList.get(0), zzk + 1, ((byte[]) arrayList.get(0)).length);
                    int i8 = zzd.zze;
                    int i9 = zzd.zzf;
                    int i10 = zzd.zzh;
                    int i11 = zzd.zzi;
                    int i12 = zzd.zzj;
                    float f2 = zzd.zzg;
                    str = zzea.zza(zzd.zza, zzd.zzb, zzd.zzc);
                    i4 = i11;
                    i5 = i12;
                    f = f2;
                    i = i8;
                    i2 = i9;
                    i3 = i10;
                } else {
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    str = null;
                    f = 1.0f;
                }
                return new zzzt(arrayList, zzk, i, i2, i3, i4, i5, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzce.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzfd zzfdVar) {
        int zzo = zzfdVar.zzo();
        int zzc = zzfdVar.zzc();
        zzfdVar.zzG(zzo);
        return zzea.zzc(zzfdVar.zzH(), zzc, zzo);
    }
}
