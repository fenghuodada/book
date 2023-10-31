package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class zzbww implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzbxy zzd;
    private String zze = "-1";
    private int zzf = -1;

    public zzbww(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxy zzbxyVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
        this.zzd = zzbxyVar;
    }

    private final void zzb(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaw)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzau)).booleanValue()) {
            this.zzc.zzH(z);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue() && z && (context = this.zza) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzap)).booleanValue()) {
            this.zzd.zzt();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzay)).booleanValue()) {
            if (zzbwv.zza(str, "gad_has_consent_for_cookies")) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaw)).booleanValue()) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != this.zzc.zzb()) {
                        this.zzc.zzH(true);
                    }
                    this.zzc.zzE(i);
                    return;
                }
                return;
            } else if (zzbwv.zza(str, "IABTCF_gdprApplies") || zzbwv.zza(str, "IABTCF_TCString") || zzbwv.zza(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.zzc.zzn(str))) {
                    this.zzc.zzH(true);
                }
                this.zzc.zzF(str, string);
                return;
            } else {
                return;
            }
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                z = true;
            }
            z = true;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                z = false;
            }
            z = true;
        }
        if (!z) {
            if (string2.equals("-1") || this.zze.equals(string2)) {
                return;
            }
            this.zze = string2;
            zzb(string2, i2);
        } else if (!z) {
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaw)).booleanValue() || i2 == -1 || this.zzf == i2) {
                return;
            }
            this.zzf = i2;
            zzb(string2, i2);
        }
    }

    public final void zza() {
        SharedPreferences sharedPreferences;
        String str;
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzay)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            sharedPreferences = this.zzb;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.zzb;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }
}
