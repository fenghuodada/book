package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzccb {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final long zzn;
    public final long zzo;

    public zzccb(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbbk.zzJ);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbbk.zzl);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbbk.zzw);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbbk.zzh);
        zzbbc zzbbcVar = zzbbk.zzg;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = string;
            this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbbk.zzi);
            this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbbk.zzj);
            this.zzh = zzb(jSONObject, "player_precache_limit", zzbbk.zzk);
            this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbbk.zzm);
            this.zzj = zza(jSONObject, "use_cache_data_source", zzbbk.zzdX);
            zzb(jSONObject, "min_retry_count", zzbbk.zzn);
            this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbbk.zzq);
            this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbbk.zzbK);
            this.zzm = zza(jSONObject, "use_range_http_data_source", zzbbk.zzbM);
            this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbbk.zzbN);
            this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbbk.zzbO);
        }
        string = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar);
        this.zze = string;
        this.zzf = zzb(jSONObject, "exo_read_timeout_millis", zzbbk.zzi);
        this.zzg = zzb(jSONObject, "load_check_interval_bytes", zzbbk.zzj);
        this.zzh = zzb(jSONObject, "player_precache_limit", zzbbk.zzk);
        this.zzi = zzb(jSONObject, "socket_receive_buffer_size", zzbbk.zzm);
        this.zzj = zza(jSONObject, "use_cache_data_source", zzbbk.zzdX);
        zzb(jSONObject, "min_retry_count", zzbbk.zzn);
        this.zzk = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbbk.zzq);
        this.zzl = zza(jSONObject, "enable_multiple_video_playback", zzbbk.zzbK);
        this.zzm = zza(jSONObject, "use_range_http_data_source", zzbbk.zzbM);
        this.zzn = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbbk.zzbN);
        this.zzo = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbbk.zzbO);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbbc zzbbcVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbbc zzbbcVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbbc zzbbcVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).longValue();
    }
}
