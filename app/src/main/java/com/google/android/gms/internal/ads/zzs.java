package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.adcolony.sdk.C2362x3;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class zzs {
    public static final zzs zza = new zzs(1, 2, 3, null);
    public static final zzs zzb;
    public static final zzn zzc;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    public final int zzd;
    public final int zze;
    public final int zzf;
    @Nullable
    public final byte[] zzg;
    private int zzl;

    static {
        zzr zzrVar = new zzr();
        zzrVar.zzb(1);
        zzrVar.zza(1);
        zzrVar.zzc(2);
        zzb = zzrVar.zzd();
        zzh = Integer.toString(0, 36);
        zzi = Integer.toString(1, 36);
        zzj = Integer.toString(2, 36);
        zzk = Integer.toString(3, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzp
        };
    }

    @Deprecated
    public zzs(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.zzd = i;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = bArr;
    }

    @Pure
    public static int zza(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int zzb(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i != 16) {
                        if (i != 18) {
                            return (i == 6 || i == 7) ? 3 : -1;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    private static String zzf(int i) {
        return i != -1 ? i != 1 ? i != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzg(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzh(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            if (this.zzd == zzsVar.zzd && this.zze == zzsVar.zze && this.zzf == zzsVar.zzf && Arrays.equals(this.zzg, zzsVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzl;
        if (i == 0) {
            int i2 = ((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf;
            int hashCode = Arrays.hashCode(this.zzg) + (i2 * 31);
            this.zzl = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        boolean z;
        String zzg = zzg(this.zzd);
        String zzf = zzf(this.zze);
        String zzh2 = zzh(this.zzf);
        byte[] bArr = this.zzg;
        StringBuilder m9460b = C2362x3.m9460b("ColorInfo(", zzg, ", ", zzf, ", ");
        m9460b.append(zzh2);
        m9460b.append(", ");
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        m9460b.append(z);
        m9460b.append(")");
        return m9460b.toString();
    }

    public final zzr zzc() {
        return new zzr(this, null);
    }

    public final String zzd() {
        return !zze() ? "NA" : String.format(Locale.US, "%s/%s/%s", zzg(this.zzd), zzf(this.zze), zzh(this.zzf));
    }

    public final boolean zze() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
