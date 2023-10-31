package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzacu extends zzacw {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzacu() {
        super(new zzaan());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfd zzfdVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfdVar.zzr()));
    }

    @Nullable
    private static Object zzh(zzfd zzfdVar, int i) {
        if (i == 0) {
            return zzg(zzfdVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzfdVar.zzk() == 1);
        } else if (i == 2) {
            return zzi(zzfdVar);
        } else {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzfdVar).doubleValue());
                        zzfdVar.zzG(2);
                        return date;
                    }
                    int zzn = zzfdVar.zzn();
                    ArrayList arrayList = new ArrayList(zzn);
                    for (int i2 = 0; i2 < zzn; i2++) {
                        Object zzh = zzh(zzfdVar, zzfdVar.zzk());
                        if (zzh != null) {
                            arrayList.add(zzh);
                        }
                    }
                    return arrayList;
                }
                return zzj(zzfdVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String zzi = zzi(zzfdVar);
                int zzk = zzfdVar.zzk();
                if (zzk == 9) {
                    return hashMap;
                }
                Object zzh2 = zzh(zzfdVar, zzk);
                if (zzh2 != null) {
                    hashMap.put(zzi, zzh2);
                }
            }
        }
    }

    private static String zzi(zzfd zzfdVar) {
        int zzo = zzfdVar.zzo();
        int zzc = zzfdVar.zzc();
        zzfdVar.zzG(zzo);
        return new String(zzfdVar.zzH(), zzc, zzo);
    }

    private static HashMap zzj(zzfd zzfdVar) {
        int zzn = zzfdVar.zzn();
        HashMap hashMap = new HashMap(zzn);
        for (int i = 0; i < zzn; i++) {
            String zzi = zzi(zzfdVar);
            Object zzh = zzh(zzfdVar, zzfdVar.zzk());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zza(zzfd zzfdVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final boolean zzb(zzfd zzfdVar, long j) {
        if (zzfdVar.zzk() == 2 && "onMetaData".equals(zzi(zzfdVar)) && zzfdVar.zza() != 0 && zzfdVar.zzk() == 8) {
            HashMap zzj = zzj(zzfdVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
