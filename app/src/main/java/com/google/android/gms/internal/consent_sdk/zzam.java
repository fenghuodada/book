package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzam {
    private final Application zza;
    private final SharedPreferences zzb;
    private final Set<String> zzc;

    public zzam(Application application) {
        this.zza = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzb = sharedPreferences;
        this.zzc = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzb.getInt("consent_status", 0);
    }

    public final Map<String, String> zzb() {
        String valueOf;
        String str;
        String str2;
        String str3;
        Application application = this.zza;
        Set<String> stringSet = this.zzb.getStringSet("stored_info", Collections.emptySet());
        HashMap hashMap = new HashMap();
        for (String str4 : stringSet) {
            zzby zza = zzca.zza(application, str4);
            if (zza == null) {
                valueOf = String.valueOf(str4);
                str = "Fetching request info: failed for key: ";
                if (valueOf.length() == 0) {
                    str2 = new String("Fetching request info: failed for key: ");
                    Log.d("UserMessagingPlatform", str2);
                }
                str2 = str.concat(valueOf);
                Log.d("UserMessagingPlatform", str2);
            } else {
                Object obj = application.getSharedPreferences(zza.zza, 0).getAll().get(zza.zzb);
                if (obj == null) {
                    valueOf = String.valueOf(str4);
                    str = "Stored info not exists: ";
                    if (valueOf.length() == 0) {
                        str2 = new String("Stored info not exists: ");
                        Log.d("UserMessagingPlatform", str2);
                    }
                    str2 = str.concat(valueOf);
                    Log.d("UserMessagingPlatform", str2);
                } else {
                    if (obj instanceof Boolean) {
                        str3 = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str3 = obj.toString();
                    } else if (obj instanceof String) {
                        str3 = (String) obj;
                    } else {
                        valueOf = String.valueOf(str4);
                        str = "Failed to fetch stored info: ";
                        if (valueOf.length() == 0) {
                            str2 = new String("Failed to fetch stored info: ");
                            Log.d("UserMessagingPlatform", str2);
                        }
                        str2 = str.concat(valueOf);
                        Log.d("UserMessagingPlatform", str2);
                    }
                    hashMap.put(str4, str3);
                }
            }
        }
        return hashMap;
    }

    public final Set<String> zzc() {
        return this.zzc;
    }

    public final void zzd() {
        zzca.zzb(this.zza, this.zzc);
        this.zzc.clear();
        this.zzb.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zze() {
        this.zzb.edit().putStringSet("written_values", this.zzc).apply();
    }

    public final void zzf(int i) {
        this.zzb.edit().putInt("consent_status", i).apply();
    }

    public final void zzg(Set<String> set) {
        this.zzb.edit().putStringSet("stored_info", set).apply();
    }
}
