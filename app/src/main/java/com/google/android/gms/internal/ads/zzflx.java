package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0485b;
import androidx.constraintlayout.core.C0510h;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
class zzflx {
    static final String zza = new UUID(0, 0).toString();
    final zzfly zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzflx(Context context, String str, String str2, String str3) {
        this.zzb = zzfly.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(C0485b.m12391a(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder m12339b = C0510h.m12339b(this.zzg, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str5 = "null";
        if (str2 == null) {
            str4 = "null";
        } else {
            str4 = "not null";
        }
        m12339b.append(str4);
        m12339b.append(", hashKey is ");
        if (str3 != null) {
            str5 = "not null";
        }
        m12339b.append(str5);
        throw new IllegalArgumentException(m12339b.toString());
    }

    public final long zza(boolean z) {
        return this.zzb.zza(z ? this.zzf : this.zze, -1L);
    }

    public final zzflw zzb(@Nullable String str, @Nullable String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzflw();
        }
        boolean z2 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z2);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    this.zzb.zzd(z2 ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z2);
            return (zze2 != null || z) ? new zzflw(zze2, zza(z2)) : zzc(str, str2);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final zzflw zzc(String str, String str2) throws IOException {
        String zzh;
        boolean z;
        if (str == null) {
            zzh = UUID.randomUUID().toString();
            z = false;
        } else {
            String uuid = UUID.randomUUID().toString();
            this.zzb.zzd("paid_3p_hash_key", uuid);
            zzh = zzh(str, str2, uuid);
            z = true;
        }
        return zzd(zzh, z);
    }

    public final zzflw zzd(String str, boolean z) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            this.zzb.zzd(z ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
            this.zzb.zzd(z ? this.zzd : this.zzc, str);
            return new zzflw(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String zze(boolean z) {
        return this.zzb.zzc(z ? this.zzd : this.zzc, null);
    }

    public final void zzf(boolean z) throws IOException {
        this.zzb.zze(z ? this.zzf : this.zze);
        this.zzb.zze(z ? this.zzd : this.zzc);
    }

    public final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzc);
    }
}
