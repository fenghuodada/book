package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.C0499a;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.android.exoplayer2.analytics.C6652m;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class zzlj extends zzku {
    public zzlj(zzlh zzlhVar) {
        super(zzlhVar);
    }

    public static final void zzA(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str, Object obj) {
        List zzp = zzfsVar.zzp();
        int i = 0;
        while (true) {
            if (i >= zzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfsVar.zzj(i, zze);
        } else {
            zzfsVar.zze(zze);
        }
    }

    @WorkerThread
    public static final boolean zzB(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfx zzC(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    public static final Object zzD(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        com.google.android.gms.internal.measurement.zzfx zzC = zzC(zzftVar, str);
        if (zzC != null) {
            if (zzC.zzy()) {
                return zzC.zzh();
            }
            if (zzC.zzw()) {
                return Long.valueOf(zzC.zzd());
            }
            if (zzC.zzu()) {
                return Double.valueOf(zzC.zza());
            }
            if (zzC.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfx> zzi = zzC.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzi) {
                    if (zzfxVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar2 : zzfxVar.zzi()) {
                            if (zzfxVar2.zzy()) {
                                bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                            } else if (zzfxVar2.zzw()) {
                                bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                            } else if (zzfxVar2.zzu()) {
                                bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void zzE(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it.next();
            if (zzfxVar != null) {
                zzG(sb, i2);
                sb.append("param {\n");
                zzJ(sb, i2, "name", zzfxVar.zzx() ? this.zzt.zzj().zze(zzfxVar.zzg()) : null);
                zzJ(sb, i2, "string_value", zzfxVar.zzy() ? zzfxVar.zzh() : null);
                zzJ(sb, i2, "int_value", zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                zzJ(sb, i2, "double_value", zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    zzE(sb, i2, zzfxVar.zzi());
                }
                zzG(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zzF(StringBuilder sb, int i, com.google.android.gms.internal.measurement.zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        zzG(sb, i);
        sb.append("filter {\n");
        if (zzemVar.zzh()) {
            zzJ(sb, i, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            zzJ(sb, i, "param_name", this.zzt.zzj().zze(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzey zzd = zzemVar.zzd();
            if (zzd != null) {
                zzG(sb, i2);
                sb.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzJ(sb, i2, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzJ(sb, i2, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzJ(sb, i2, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzG(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzG(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzG(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            zzK(sb, i + 1, "number_filter", zzemVar.zzc());
        }
        zzG(sb, i);
        sb.append("}\n");
    }

    private static final void zzG(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final String zzH(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzI(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        zzG(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            zzG(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zzgiVar.zzi()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            zzG(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zzgiVar.zzk()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            zzG(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzh()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb.append(":");
                sb.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            zzG(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzj()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : zzgkVar.zzf()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        zzG(sb, 3);
        sb.append("}\n");
    }

    private static final void zzJ(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzG(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzK(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (zzerVar == null) {
            return;
        }
        zzG(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzerVar.zzg()) {
            int zzm = zzerVar.zzm();
            zzJ(sb, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzerVar.zzi()) {
            zzJ(sb, i, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            zzJ(sb, i, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            zzJ(sb, i, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            zzJ(sb, i, "max_comparison_value", zzerVar.zzd());
        }
        zzG(sb, i);
        sb.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzgc zzgcVar, String str) {
        for (int i = 0; i < zzgcVar.zzb(); i++) {
            if (str.equals(zzgcVar.zzap(i).zzf())) {
                return i;
            }
        }
        return -1;
    }

    public static zzmh zzm(zzmh zzmhVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzll {
        com.google.android.gms.internal.measurement.zzkn zza = com.google.android.gms.internal.measurement.zzkn.zza();
        return zza != null ? zzmhVar.zzaz(bArr, zza) : zzmhVar.zzay(bArr);
    }

    public static List zzs(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean zzw(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzy(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    public final long zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzf(str.getBytes(Charset.forName("UTF-8")));
    }

    @WorkerThread
    public final long zzf(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzt.zzv().zzg();
        MessageDigest zzF = zzlp.zzF();
        if (zzF == null) {
            C6652m.m6131a(this.zzt, "Failed to get MD5");
            return 0L;
        }
        return zzlp.zzp(zzF.digest(bArr));
    }

    public final Bundle zzh(Map map, boolean z) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzh((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public final Parcelable zzi(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzt.zzaA().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzau zzj(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzh = zzh(zzaaVar.zze(), true);
        String obj2 = (!zzh.containsKey("_o") || (obj = zzh.get("_o")) == null) ? "app" : obj.toString();
        String zzb = zzhc.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzau(zzb, new zzas(zzh), obj2, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzft zzl(zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
        zze.zzl(zzapVar.zze);
        zzar zzarVar = new zzar(zzapVar.zzf);
        while (zzarVar.hasNext()) {
            String next = zzarVar.next();
            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
            zze2.zzj(next);
            Object zzf = zzapVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzu(zze2, zzf);
            zze.zze(zze2);
        }
        return (com.google.android.gms.internal.measurement.zzft) zze.zzaD();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        Long l;
        Long l2;
        Double d;
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder m12383b = C0499a.m12383b("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                zzG(m12383b, 1);
                m12383b.append("bundle {\n");
                if (zzgdVar.zzbl()) {
                    zzJ(m12383b, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzqu.zzc();
                if (this.zzt.zzf().zzs(zzgdVar.zzy(), zzeg.zzao) && zzgdVar.zzbo()) {
                    zzJ(m12383b, 1, "session_stitching_token", zzgdVar.zzL());
                }
                zzJ(m12383b, 1, "platform", zzgdVar.zzJ());
                if (zzgdVar.zzbh()) {
                    zzJ(m12383b, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbt()) {
                    zzJ(m12383b, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzs()));
                }
                if (zzgdVar.zzbf()) {
                    zzJ(m12383b, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzbc()) {
                    zzJ(m12383b, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                zzJ(m12383b, 1, "gmp_app_id", zzgdVar.zzG());
                zzJ(m12383b, 1, "admob_app_id", zzgdVar.zzx());
                zzJ(m12383b, 1, AdColonyAdapterUtils.KEY_APP_ID, zzgdVar.zzy());
                zzJ(m12383b, 1, "app_version", zzgdVar.zzB());
                if (zzgdVar.zzba()) {
                    zzJ(m12383b, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                zzJ(m12383b, 1, "firebase_instance_id", zzgdVar.zzF());
                if (zzgdVar.zzbe()) {
                    zzJ(m12383b, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                zzJ(m12383b, 1, "app_store", zzgdVar.zzA());
                if (zzgdVar.zzbs()) {
                    zzJ(m12383b, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbp()) {
                    zzJ(m12383b, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbg()) {
                    zzJ(m12383b, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbk()) {
                    zzJ(m12383b, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbj()) {
                    zzJ(m12383b, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                zzJ(m12383b, 1, "app_instance_id", zzgdVar.zzz());
                zzJ(m12383b, 1, "resettable_device_id", zzgdVar.zzK());
                zzJ(m12383b, 1, "ds_id", zzgdVar.zzE());
                if (zzgdVar.zzbi()) {
                    zzJ(m12383b, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaY()));
                }
                zzJ(m12383b, 1, "os_version", zzgdVar.zzI());
                zzJ(m12383b, 1, "device_model", zzgdVar.zzD());
                zzJ(m12383b, 1, "user_default_language", zzgdVar.zzM());
                if (zzgdVar.zzbr()) {
                    zzJ(m12383b, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzbb()) {
                    zzJ(m12383b, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbn()) {
                    zzJ(m12383b, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaZ()));
                }
                zzJ(m12383b, 1, "health_monitor", zzgdVar.zzH());
                if (zzgdVar.zzbm()) {
                    zzJ(m12383b, 1, "retry_counter", Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbd()) {
                    zzJ(m12383b, 1, "consent_signals", zzgdVar.zzC());
                }
                zzpz.zzc();
                if (this.zzt.zzf().zzs(null, zzeg.zzaE) && zzgdVar.zzbq()) {
                    zzJ(m12383b, 1, "target_os_version", Long.valueOf(zzgdVar.zzq()));
                }
                List<com.google.android.gms.internal.measurement.zzgm> zzP = zzgdVar.zzP();
                if (zzP != null) {
                    for (com.google.android.gms.internal.measurement.zzgm zzgmVar : zzP) {
                        if (zzgmVar != null) {
                            zzG(m12383b, 2);
                            m12383b.append("user_property {\n");
                            if (zzgmVar.zzs()) {
                                l = Long.valueOf(zzgmVar.zzc());
                            } else {
                                l = null;
                            }
                            zzJ(m12383b, 2, "set_timestamp_millis", l);
                            zzJ(m12383b, 2, "name", this.zzt.zzj().zzf(zzgmVar.zzf()));
                            zzJ(m12383b, 2, "string_value", zzgmVar.zzg());
                            if (zzgmVar.zzr()) {
                                l2 = Long.valueOf(zzgmVar.zzb());
                            } else {
                                l2 = null;
                            }
                            zzJ(m12383b, 2, "int_value", l2);
                            if (zzgmVar.zzq()) {
                                d = Double.valueOf(zzgmVar.zza());
                            } else {
                                d = null;
                            }
                            zzJ(m12383b, 2, "double_value", d);
                            zzG(m12383b, 2);
                            m12383b.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfp> zzN = zzgdVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfp zzfpVar : zzN) {
                        if (zzfpVar != null) {
                            zzG(m12383b, 2);
                            m12383b.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                zzJ(m12383b, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                zzJ(m12383b, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            zzI(m12383b, 2, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                zzI(m12383b, 2, "previous_data", zzfpVar.zze());
                            }
                            zzG(m12383b, 2);
                            m12383b.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzft> zzO = zzgdVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzft zzftVar : zzO) {
                        if (zzftVar != null) {
                            zzG(m12383b, 2);
                            m12383b.append("event {\n");
                            zzJ(m12383b, 2, "name", this.zzt.zzj().zzd(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                zzJ(m12383b, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                zzJ(m12383b, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                zzJ(m12383b, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                zzE(m12383b, 2, zzftVar.zzi());
                            }
                            zzG(m12383b, 2);
                            m12383b.append("}\n");
                        }
                    }
                }
                zzG(m12383b, 1);
                m12383b.append("}\n");
            }
        }
        m12383b.append("}\n");
        return m12383b.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzek zzekVar) {
        if (zzekVar == null) {
            return "null";
        }
        StringBuilder m12383b = C0499a.m12383b("\nevent_filter {\n");
        if (zzekVar.zzp()) {
            zzJ(m12383b, 0, "filter_id", Integer.valueOf(zzekVar.zzb()));
        }
        zzJ(m12383b, 0, "event_name", this.zzt.zzj().zzd(zzekVar.zzg()));
        String zzH = zzH(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
        if (!zzH.isEmpty()) {
            zzJ(m12383b, 0, "filter_type", zzH);
        }
        if (zzekVar.zzo()) {
            zzK(m12383b, 1, "event_count_filter", zzekVar.zzf());
        }
        if (zzekVar.zza() > 0) {
            m12383b.append("  filters {\n");
            for (com.google.android.gms.internal.measurement.zzem zzemVar : zzekVar.zzh()) {
                zzF(m12383b, 2, zzemVar);
            }
        }
        zzG(m12383b, 1);
        m12383b.append("}\n}\n");
        return m12383b.toString();
    }

    public final String zzq(com.google.android.gms.internal.measurement.zzet zzetVar) {
        if (zzetVar == null) {
            return "null";
        }
        StringBuilder m12383b = C0499a.m12383b("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            zzJ(m12383b, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        zzJ(m12383b, 0, "property_name", this.zzt.zzj().zzf(zzetVar.zze()));
        String zzH = zzH(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!zzH.isEmpty()) {
            zzJ(m12383b, 0, "filter_type", zzH);
        }
        zzF(m12383b, 1, zzetVar.zzb());
        m12383b.append("}\n");
        return m12383b.toString();
    }

    public final List zzr(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzt.zzaA().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzt.zzaA().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(zzt((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map zzt(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzt(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzt(android.os.Bundle, boolean):java.util.Map");
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzfw zzfwVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.checkNotNull(obj);
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
        } else if (!(obj instanceof Bundle[])) {
            this.zzt.zzaA().zzd().zzb("Ignoring invalid (type) event param value", obj);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzfx) zze.zzaD());
                    }
                }
            }
            zzfwVar.zzb(arrayList);
        }
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzgl zzglVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzglVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzt.zzaA().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzx(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.zzt.zzax().currentTimeMillis() - j) > j2;
    }

    public final byte[] zzz(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzt.zzaA().zzd().zzb("Failed to gzip content", e);
            throw e;
        }
    }
}
