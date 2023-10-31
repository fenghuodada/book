package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.android.gms.ads.impl.C7513R;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcbq extends FrameLayout implements zzcbh {
    @VisibleForTesting
    final zzcce zza;
    private final zzccc zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcc zze;
    private final long zzf;
    @Nullable
    private final zzcbi zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbq(Context context, zzccc zzcccVar, int i, boolean z, zzbcc zzbccVar, zzccb zzccbVar) {
        super(context);
        this.zzb = zzcccVar;
        this.zze = zzbccVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcccVar.zzj());
        zzcbj zzcbjVar = zzcccVar.zzj().zza;
        zzcbi zzccuVar = i == 2 ? new zzccu(context, new zzccd(context, zzcccVar.zzn(), zzcccVar.zzbm(), zzbccVar, zzcccVar.zzk()), zzcccVar, z, zzcbj.zza(zzcccVar), zzccbVar) : new zzcbg(context, zzcccVar, z, zzcbj.zza(zzcccVar), zzccbVar, new zzccd(context, zzcccVar.zzn(), zzcccVar.zzbm(), zzbccVar, zzcccVar.zzk()));
        this.zzg = zzccuVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzccuVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzI)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzE)).booleanValue();
        this.zzk = booleanValue;
        if (zzbccVar != null) {
            zzbccVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcce(this);
        zzccuVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbi zzcbiVar = this.zzg;
            if (zzcbiVar != null) {
                zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbi.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        zzcce zzcceVar = this.zza;
        if (z) {
            zzcceVar.zzb();
        } else {
            zzcceVar.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbl
            @Override // java.lang.Runnable
            public final void run() {
                zzcbq.this.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbh
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbp(this, z));
    }

    public final void zzA(int i) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzB(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder m11130b = C1169e.m11130b("Set video bounds to x:", i, ";y:", i2, ";w:");
            m11130b.append(i3);
            m11130b.append(";h:");
            m11130b.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(m11130b.toString());
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzb.zze(f);
        zzcbiVar.zzn();
    }

    public final void zzH(float f, float f2) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar != null) {
            zzcbiVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzb.zzd(false);
        zzcbiVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbL)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzb(String str, @Nullable String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzc(String str, @Nullable String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbL)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzf() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar != null && this.zzm == 0) {
            zzK("canplaythrough", "duration", String.valueOf(zzcbiVar.zzc() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbm
            @Override // java.lang.Runnable
            public final void run() {
                zzcbq.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbo(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbbc zzbbcVar = zzbbk.zzH;
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbh
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.zzf) {
            zzbzt.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbcc zzbccVar = this.zze;
            if (zzbccVar != null) {
                zzbccVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Nullable
    public final Integer zzl() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar != null) {
            return zzcbiVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        TextView textView = new TextView(zzcbiVar.getContext());
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        textView.setText(String.valueOf(zzd == null ? "AdMob - " : zzd.getString(C7513R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar != null) {
            zzcbiVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzb.zzd(true);
        zzcbiVar.zzn();
    }

    public final void zzt() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        long zza = zzcbiVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f = ((float) zza) / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzo();
    }

    public final void zzv() {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzp();
    }

    public final void zzw(int i) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcbi zzcbiVar = this.zzg;
        if (zzcbiVar == null) {
            return;
        }
        zzcbiVar.zzy(i);
    }
}
