package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class zzxm {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzxf[] zzd = new zzxf[100];

    public zzxm(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzxf zzb() {
        zzxf zzxfVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzxf[] zzxfVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzxfVar = zzxfVarArr[i2];
            zzxfVar.getClass();
            zzxfVarArr[i2] = null;
        } else {
            zzxfVar = new zzxf(new byte[65536], 0);
            int i3 = this.zzb;
            zzxf[] zzxfVarArr2 = this.zzd;
            int length = zzxfVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzxf[]) Arrays.copyOf(zzxfVarArr2, length + length);
                return zzxfVar;
            }
        }
        return zzxfVar;
    }

    public final synchronized void zzc(zzxf zzxfVar) {
        zzxf[] zzxfVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzxfVarArr[i] = zzxfVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(@Nullable zzxg zzxgVar) {
        while (zzxgVar != null) {
            zzxf[] zzxfVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzxfVarArr[i] = zzxgVar.zzc();
            this.zzb--;
            zzxgVar = zzxgVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i2 = zzfn.zza;
        int max = Math.max(0, ((i + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.zzd, max, i3, (Object) null);
        this.zzc = max;
    }
}
