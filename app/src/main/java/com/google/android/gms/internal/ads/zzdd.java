package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class zzdd {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfrr zzh;
    private final zzfrr zzi;
    private final int zzj;
    private final int zzk;
    private final zzfrr zzl;
    private zzfrr zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzdd() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfrr.zzl();
        this.zzi = zzfrr.zzl();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfrr.zzl();
        this.zzm = zzfrr.zzl();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public zzdd(zzde zzdeVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzdeVar.zzl;
        this.zzf = zzdeVar.zzm;
        this.zzg = zzdeVar.zzn;
        this.zzh = zzdeVar.zzo;
        this.zzi = zzdeVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzdeVar.zzu;
        this.zzm = zzdeVar.zzv;
        this.zzn = zzdeVar.zzw;
        this.zzp = new HashSet(zzdeVar.zzC);
        this.zzo = new HashMap(zzdeVar.zzB);
    }

    public final zzdd zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzfn.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfrr.zzm(zzfn.zzw(locale));
            }
        }
        return this;
    }

    public zzdd zze(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }
}
