package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbbi implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    @VisibleForTesting
    volatile boolean zza = false;
    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbbp.zza(new zzfpp() { // from class: com.google.android.gms.internal.ads.zzbbg
                @Override // com.google.android.gms.internal.ads.zzfpp
                public final Object zza() {
                    return zzbbi.this.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzbbc zzbbcVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbbcVar.zzm();
            }
        }
        if (zzbbcVar.zze() != 2) {
            return (zzbbcVar.zze() == 1 && this.zzh.has(zzbbcVar.zzn())) ? zzbbcVar.zza(this.zzh) : zzbbp.zza(new zzfpp() { // from class: com.google.android.gms.internal.ads.zzbbf
                @Override // com.google.android.gms.internal.ads.zzfpp
                public final Object zza() {
                    return zzbbi.this.zzc(zzbbcVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbbcVar.zzm() : zzbbcVar.zzb(bundle);
    }

    public final /* synthetic */ Object zzc(zzbbc zzbbcVar) {
        return zzbbcVar.zzc(this.zze);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", JsonUtils.EMPTY_JSON);
    }

    public final void zze(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                context = remoteContext;
            }
            if (context == null) {
                this.zza = false;
                this.zzc.open();
                return;
            }
            com.google.android.gms.ads.internal.client.zzba.zzb();
            SharedPreferences zza = zzbbe.zza(context);
            this.zze = zza;
            if (zza != null) {
                zza.registerOnSharedPreferenceChangeListener(this);
            }
            zzbdv.zzc(new zzbbh(this));
            zzf();
            this.zzd = true;
            this.zza = false;
            this.zzc.open();
        }
    }
}
