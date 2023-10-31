package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;

/* loaded from: classes.dex */
public final class zzfki {
    @VisibleForTesting
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfki(@NonNull Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfkj.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfkj.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return C0235r.m12816a("FBAMTD", this.zzd - 1);
    }

    private final String zzf() {
        return C0235r.m12816a("LATMTD", this.zzd - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzatk r8, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfko r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfki.zza(com.google.android.gms.internal.ads.zzatk, com.google.android.gms.internal.ads.zzfko):boolean");
    }

    @Nullable
    @VisibleForTesting
    public final zzatn zzb(int i) {
        SharedPreferences sharedPreferences;
        String zze;
        if (i == 1) {
            sharedPreferences = this.zzc;
            zze = zzf();
        } else {
            sharedPreferences = this.zzc;
            zze = zze();
        }
        String string = sharedPreferences.getString(zze, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgno zzgnoVar = zzgno.zzb;
            zzatn zzh = zzatn.zzh(zzgno.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb = zzfkj.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfkj.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfkj.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgpi unused) {
        }
        return null;
    }

    @Nullable
    public final zzfkh zzc(int i) {
        zzatn zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfkj.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfkj.zzb(zzk, "pcam", zzd());
        }
        return new zzfkh(zzb, zzb2, zzfkj.zzb(zzk, "pcbc", zzd()), zzfkj.zzb(zzk, "pcopt", zzd()));
    }
}
