package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class zzaqn implements zzaqm {
    protected static volatile zzarr zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    @Nullable
    protected zzarj zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzaqn(Context context) {
        try {
            zzapf.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcr)).booleanValue()) {
                this.zzr = new zzarj();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzm(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqn.zzm(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzarh;

    public abstract zzano zzb(Context context, View view, Activity activity);

    public abstract zzano zzc(Context context, zzanh zzanhVar);

    public abstract zzano zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zze(Context context, @Nullable String str, @Nullable View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzg(Context context) {
        if (zzaru.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    public abstract zzart zzi(MotionEvent motionEvent) throws zzarh;

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final synchronized void zzk(@Nullable MotionEvent motionEvent) {
        Long l;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzs;
            double d2 = rawY - this.zzt;
            this.zzk += Math.sqrt((d2 * d2) + (d * d));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzart zzi = zzi(motionEvent);
                    Long l2 = zzi.zzd;
                    if (l2 != null && zzi.zzg != null) {
                        this.zzi = l2.longValue() + zzi.zzg.longValue() + this.zzi;
                    }
                    if (this.zzq != null && (l = zzi.zze) != null && zzi.zzh != null) {
                        this.zzj = l.longValue() + zzi.zzh.longValue() + this.zzj;
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzarh unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzch)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzarj zzarjVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcr)).booleanValue() || (zzarjVar = this.zzr) == null) {
            return;
        }
        zzarjVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public void zzo(View view) {
    }
}
