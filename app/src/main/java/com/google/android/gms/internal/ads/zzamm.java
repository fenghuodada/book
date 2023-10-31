package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public class zzamm extends zzali {
    private final Object zza;
    @Nullable
    @GuardedBy("mLock")
    private final zzaln zzb;

    public zzamm(int i, String str, zzaln zzalnVar, @Nullable zzalm zzalmVar) {
        super(i, str, zzalmVar);
        this.zza = new Object();
        this.zzb = zzalnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final zzalo zzh(zzale zzaleVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaleVar.zzb;
            Map map = zzaleVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaleVar.zzb);
        }
        return zzalo.zzb(str, zzamf.zzb(zzaleVar));
    }

    @Override // com.google.android.gms.internal.ads.zzali
    /* renamed from: zzz */
    public void zzo(String str) {
        zzaln zzalnVar;
        synchronized (this.zza) {
            zzalnVar = this.zzb;
        }
        zzalnVar.zza(str);
    }
}
