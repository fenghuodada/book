package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfam {
    @VisibleForTesting
    public zzfam() {
        try {
            zzfyg.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgnl zzt = zzgno.zzt();
        try {
            zzfwz.zzb(zzfxp.zzc(zzfxi.zza("AES128_GCM")), zzfwy.zzb(zzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdpx zzdpxVar) {
        zzfxp zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzfww) zzc.zze(zzfww.class)).zza(bArr, bArr2);
            zzdpxVar.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.decrypt");
            zzdpxVar.zza().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzfxp zzc(String str) {
        try {
            return zzfwz.zza(zzfwx.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
