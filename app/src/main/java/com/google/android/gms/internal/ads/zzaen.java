package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaen extends zzaef {
    public static final Parcelable.Creator<zzaen> CREATOR = new zzaem();
    @Nullable
    public final String zza;
    @Deprecated
    public final String zzb;
    public final zzfrr zzc;

    public zzaen(String str, @Nullable String str2, List list) {
        super(str);
        zzdy.zzd(!list.isEmpty());
        this.zza = str2;
        zzfrr zzj = zzfrr.zzj(list);
        this.zzc = zzj;
        this.zzb = (String) zzj.get(0);
    }

    private static List zzb(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else if (str.length() < 7) {
                if (str.length() >= 4) {
                    parseInt = Integer.parseInt(str.substring(0, 4));
                }
                return arrayList;
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaen.class == obj.getClass()) {
            zzaen zzaenVar = (zzaen) obj;
            if (zzfn.zzB(this.zzf, zzaenVar.zzf) && zzfn.zzB(this.zza, zzaenVar.zza) && this.zzc.equals(zzaenVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzc.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzc);
        return str + ": description=" + str2 + ": values=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaef, com.google.android.gms.internal.ads.zzbz
    public final void zza(zzbu zzbuVar) {
        char c;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                zzbuVar.zzq((CharSequence) this.zzc.get(0));
                return;
            case 2:
            case 3:
                zzbuVar.zze((CharSequence) this.zzc.get(0));
                return;
            case 4:
            case 5:
                zzbuVar.zzc((CharSequence) this.zzc.get(0));
                return;
            case 6:
            case 7:
                zzbuVar.zzd((CharSequence) this.zzc.get(0));
                return;
            case '\b':
            case '\t':
                int i = zzfn.zza;
                String[] split = ((String) this.zzc.get(0)).split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzbuVar.zzs(Integer.valueOf(parseInt));
                    zzbuVar.zzr(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzbuVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str2 = (String) this.zzc.get(0);
                    int parseInt2 = Integer.parseInt(str2.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str2.substring(0, 2));
                    zzbuVar.zzk(Integer.valueOf(parseInt2));
                    zzbuVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzc.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        zzbuVar.zzj((Integer) zzb.get(2));
                    }
                    zzbuVar.zzk((Integer) zzb.get(1));
                }
                zzbuVar.zzl((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzc.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        zzbuVar.zzm((Integer) zzb2.get(2));
                    }
                    zzbuVar.zzn((Integer) zzb2.get(1));
                }
                zzbuVar.zzo((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzbuVar.zzf((CharSequence) this.zzc.get(0));
                return;
            case 18:
            case 19:
                zzbuVar.zzg((CharSequence) this.zzc.get(0));
                return;
            case 20:
            case 21:
                zzbuVar.zzt((CharSequence) this.zzc.get(0));
                return;
            default:
                return;
        }
    }
}
