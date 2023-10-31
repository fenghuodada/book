package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzm;

/* loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context, zzq zzqVar, @Nullable zzad zzadVar) {
        super(context);
        this.zzb = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int zzx = zzbzm.zzx(context, zzqVar.zza);
        zzay.zzb();
        int zzx2 = zzbzm.zzx(context, 0);
        zzay.zzb();
        int zzx3 = zzbzm.zzx(context, zzqVar.zzb);
        zzay.zzb();
        imageButton.setPadding(zzx, zzx2, zzx3, zzbzm.zzx(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int zzx4 = zzbzm.zzx(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzx4, zzbzm.zzx(context, zzqVar.zzd + zzqVar.zzc), 17));
        long longValue = ((Long) zzba.zzc().zzb(zzbbk.zzaZ)).longValue();
        if (longValue <= 0) {
            return;
        }
        zzp zzpVar = ((Boolean) zzba.zzc().zzb(zzbbk.zzba)).booleanValue() ? new zzp(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.internal.ads.zzbbk.zzaY
            com.google.android.gms.internal.ads.zzbbi r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L67
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L67
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24
            goto L67
        L24:
            com.google.android.gms.internal.ads.zzbzc r1 = com.google.android.gms.ads.internal.zzt.zzo()
            android.content.res.Resources r1 = r1.zzd()
            if (r1 == 0) goto L61
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r4 == 0) goto L3e
            int r0 = com.google.android.gms.ads.impl.C7513R.C7514drawable.admob_close_button_white_circle_black_cross     // Catch: android.content.res.Resources.NotFoundException -> L49
        L39:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L4e
        L3e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r0 == 0) goto L4e
            int r0 = com.google.android.gms.ads.impl.C7513R.C7514drawable.admob_close_button_black_circle_white_cross     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L39
        L49:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.internal.ads.zzbzt.zze(r0)
        L4e:
            android.widget.ImageButton r0 = r5.zza
            if (r3 != 0) goto L56
            r0.setImageResource(r2)
            return
        L56:
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.zza
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L61:
            android.widget.ImageButton r0 = r5.zza
            r0.setImageResource(r2)
            return
        L67:
            android.widget.ImageButton r0 = r5.zza
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzr.zzc():void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.zzb;
        if (zzadVar != null) {
            zzadVar.zzi();
        }
    }

    public final void zzb(boolean z) {
        if (!z) {
            this.zza.setVisibility(0);
            return;
        }
        this.zza.setVisibility(8);
        if (((Long) zzba.zzc().zzb(zzbbk.zzaZ)).longValue() > 0) {
            this.zza.animate().cancel();
            this.zza.clearAnimation();
        }
    }
}
