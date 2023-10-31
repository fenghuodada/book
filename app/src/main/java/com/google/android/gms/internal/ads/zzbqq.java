package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.impl.C7513R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbqq extends zzbqy {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbqq(zzcfb zzcfbVar, Map map) {
        super(zzcfbVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfbVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze(FirebaseAnalytics.Param.LOCATION);
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(AppIntroBaseFragmentKt.ARG_TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbau(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(this.zzb);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        zzG.setTitle(zzd != null ? zzd.getString(C7513R.string.f14279s5) : "Create calendar event");
        zzG.setMessage(zzd != null ? zzd.getString(C7513R.string.f14280s6) : "Allow Ad to create a calendar event?");
        zzG.setPositiveButton(zzd != null ? zzd.getString(C7513R.string.f14277s3) : "Accept", new zzbqo(this));
        zzG.setNegativeButton(zzd != null ? zzd.getString(C7513R.string.f14278s4) : "Decline", new zzbqp(this));
        zzG.create().show();
    }
}
