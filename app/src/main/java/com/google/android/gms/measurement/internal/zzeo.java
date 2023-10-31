package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.constraintlayout.core.C0499a;
import androidx.core.content.C0663f;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class zzeo {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzen zzd;

    public zzeo(zzen zzenVar) {
        this.zzd = zzenVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder m12383b = C0499a.m12383b("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zzb((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (m12383b.length() != 1) {
                    m12383b.append(", ");
                }
                m12383b.append(valueOf);
            }
        }
        m12383b.append("]");
        return m12383b.toString();
    }

    public final String zzb(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder m12383b = C0499a.m12383b("Bundle[{");
        for (String str : bundle.keySet()) {
            if (m12383b.length() != 8) {
                m12383b.append(", ");
            }
            m12383b.append(zze(str));
            m12383b.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zza(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            m12383b.append(valueOf);
        }
        m12383b.append("}]");
        return m12383b.toString();
    }

    public final String zzc(zzau zzauVar) {
        if (this.zzd.zza()) {
            StringBuilder sb = new StringBuilder("origin=");
            sb.append(zzauVar.zzc);
            sb.append(",name=");
            sb.append(zzd(zzauVar.zza));
            sb.append(",params=");
            zzas zzasVar = zzauVar.zzb;
            sb.append(zzasVar == null ? null : !this.zzd.zza() ? zzasVar.toString() : zzb(zzasVar.zzc()));
            return sb.toString();
        }
        return zzauVar.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhc.zzc, zzhc.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhd.zzb, zzhd.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return C0663f.m12005a("experiment_id(", str, ")");
        }
        return zzg(str, zzhe.zzb, zzhe.zza, zzc);
    }
}
