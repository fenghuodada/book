package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzeah extends zzeai {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcum zzd;
    private final TelephonyManager zze;
    private final zzdzz zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzazk.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzazk zzazkVar = zzazk.CONNECTING;
        sparseArray.put(ordinal, zzazkVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzazkVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzazkVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzazk.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzazk zzazkVar2 = zzazk.DISCONNECTED;
        sparseArray.put(ordinal2, zzazkVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzazkVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzazkVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzazkVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzazkVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzazk.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzazkVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzazkVar);
    }

    public zzeah(Context context, zzcum zzcumVar, zzdzz zzdzzVar, zzdzv zzdzvVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzdzvVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcumVar;
        this.zzf = zzdzzVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzazb zza(zzeah zzeahVar, Bundle bundle) {
        zzayu zza = zzazb.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzeahVar.zzg = 2;
        } else {
            zzeahVar.zzg = 1;
            if (i == 0) {
                zza.zzb(2);
            } else if (i != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zza.zza(i3);
        }
        return (zzazb) zza.zzal();
    }

    public static /* bridge */ /* synthetic */ zzazk zzb(zzeah zzeahVar, Bundle bundle) {
        return (zzazk) zzb.get(zzfal.zza(zzfal.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzazk.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzeah zzeahVar, boolean z, ArrayList arrayList, zzazb zzazbVar, zzazk zzazkVar) {
        zzazf zzg = zzazg.zzg();
        zzg.zza(arrayList);
        zzg.zzi(zzg(Settings.Global.getInt(zzeahVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzj(zzeahVar.zzc, zzeahVar.zze));
        zzg.zzf(zzeahVar.zzf.zze());
        zzg.zze(zzeahVar.zzf.zzb());
        zzg.zzb(zzeahVar.zzf.zza());
        zzg.zzc(zzazkVar);
        zzg.zzd(zzazbVar);
        zzg.zzk(zzeahVar.zzg);
        zzg.zzl(zzg(z));
        zzg.zzh(zzeahVar.zzf.zzd());
        zzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
        zzg.zzm(zzg(Settings.Global.getInt(zzeahVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzazg) zzg.zzal()).zzax();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzd(boolean z) {
        zzfvr.zzq(this.zzd.zzb(), new zzeag(this, z), zzcag.zzf);
    }
}
