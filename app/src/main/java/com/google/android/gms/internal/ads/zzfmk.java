package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;
import com.adcolony.sdk.C2362x3;

/* loaded from: classes.dex */
final class zzfmk extends zzfnd {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfmk(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, zzfmj zzfmjVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i3;
        this.zzf = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnd) {
            zzfnd zzfndVar = (zzfnd) obj;
            if (this.zza.equals(zzfndVar.zze())) {
                zzfndVar.zzi();
                String str = this.zzb;
                if (str != null ? str.equals(zzfndVar.zzg()) : zzfndVar.zzg() == null) {
                    if (this.zzc == zzfndVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfndVar.zza())) {
                        zzfndVar.zzb();
                        zzfndVar.zzh();
                        if (this.zze == zzfndVar.zzd()) {
                            String str2 = this.zzf;
                            String zzf = zzfndVar.zzf();
                            if (str2 != null ? str2.equals(zzf) : zzf == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int hashCode2 = ((((((((((hashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 583896283) ^ this.zze) * 1000003;
        String str2 = this.zzf;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        int i = this.zzc;
        float f = this.zzd;
        int i2 = this.zze;
        String str2 = this.zzf;
        StringBuilder m9460b = C2362x3.m9460b("OverlayDisplayShowRequest{windowToken=", obj, ", stableSessionToken=false, appId=", str, ", layoutGravity=");
        m9460b.append(i);
        m9460b.append(", layoutVerticalMargin=");
        m9460b.append(f);
        m9460b.append(", displayMode=0, sessionToken=null, windowWidthPx=");
        m9460b.append(i2);
        m9460b.append(", adFieldEnifd=");
        m9460b.append(str2);
        m9460b.append("}");
        return m9460b.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final int zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final IBinder zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    @Nullable
    public final String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    @Nullable
    public final String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    @Nullable
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final boolean zzi() {
        return false;
    }
}
