package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaak {
    public final String zza;

    private zzaak(int i, int i2, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzaak zza(zzfd zzfdVar) {
        String str;
        zzfdVar.zzG(2);
        int zzk = zzfdVar.zzk();
        int i = zzk >> 1;
        int i2 = zzk & 1;
        int zzk2 = zzfdVar.zzk() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        int i3 = zzk2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new zzaak(i, i3, sb.toString());
    }
}
