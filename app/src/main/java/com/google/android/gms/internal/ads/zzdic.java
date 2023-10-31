package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdic {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfaa zzc;
    private final zzdhh zzd;
    private final zzdhc zze;
    @Nullable
    private final zzdio zzf;
    @Nullable
    private final zzdiw zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbee zzj;
    private final zzdgz zzk;

    public zzdic(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfaa zzfaaVar, zzdhh zzdhhVar, zzdhc zzdhcVar, @Nullable zzdio zzdioVar, @Nullable zzdiw zzdiwVar, Executor executor, Executor executor2, zzdgz zzdgzVar) {
        this.zzb = zzgVar;
        this.zzc = zzfaaVar;
        this.zzj = zzfaaVar.zzi;
        this.zzd = zzdhhVar;
        this.zze = zzdhcVar;
        this.zzf = zzdioVar;
        this.zzg = zzdiwVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdgzVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z) {
        View zzf = z ? this.zze.zzf() : this.zze.zzg();
        if (zzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf.getParent()).removeView(zzf);
        }
        viewGroup.addView(zzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdA)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdhc zzdhcVar = this.zze;
        if (zzdhcVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdhcVar.zzc() == 2 || zzdhcVar.zzc() == 1) {
                this.zzb.zzI(this.zzc.zzf, String.valueOf(zzdhcVar.zzc()), z);
            } else if (zzdhcVar.zzc() == 6) {
                this.zzb.zzI(this.zzc.zzf, "2", z);
                this.zzb.zzI(this.zzc.zzf, "1", z);
            }
        }
    }

    public final /* synthetic */ void zzb(zzdiy zzdiyVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzben zza2;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdiyVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdiyVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdhc zzdhcVar = this.zze;
        if (zzdhcVar.zze() != null) {
            view = zzdhcVar.zze();
            zzbee zzbeeVar = this.zzj;
            if (zzbeeVar != null && viewGroup == null) {
                zzh(layoutParams, zzbeeVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (zzdhcVar.zzl() instanceof zzbdz) {
            zzbdz zzbdzVar = (zzbdz) zzdhcVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbdzVar.zzc());
            }
            View zzbeaVar = new zzbea(context, zzbdzVar, layoutParams);
            zzbeaVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdy));
            view = zzbeaVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdiyVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdiyVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdiyVar.zzq(zzdiyVar.zzk(), view, true);
        }
        zzfrr zzfrrVar = zzdhy.zza;
        int size = zzfrrVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdiyVar.zzg((String) zzfrrVar.get(i2));
            i2++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhz
            @Override // java.lang.Runnable
            public final void run() {
                zzdic.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdhc zzdhcVar2 = this.zze;
            if (zzdhcVar2.zzr() != null) {
                zzdhcVar2.zzr().zzao(new zzdib(zzdiyVar, viewGroup2));
            }
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjd)).booleanValue() && zzi(viewGroup2, false)) {
            zzdhc zzdhcVar3 = this.zze;
            if (zzdhcVar3.zzp() != null) {
                zzdhcVar3.zzp().zzao(new zzdib(zzdiyVar, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzf = zzdiyVar.zzf();
            Context context2 = zzf != null ? zzf.getContext() : null;
            if (context2 == null || (zza2 = this.zzk.zza()) == null) {
                return;
            }
            try {
                IObjectWrapper zzi = zza2.zzi();
                if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzj = zzdiyVar.zzj();
                if (zzj != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfT)).booleanValue()) {
                        scaleType = (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
                        imageView.setScaleType(scaleType);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                scaleType = zza;
                imageView.setScaleType(scaleType);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                zzbzt.zzj("Could not get main image drawable");
            }
        }
    }

    public final void zzc(@Nullable zzdiy zzdiyVar) {
        if (zzdiyVar == null || this.zzf == null || zzdiyVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdiyVar.zzh().addView(this.zzf.zza());
        } catch (zzcfm e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(@Nullable zzdiy zzdiyVar) {
        if (zzdiyVar == null) {
            return;
        }
        Context context = zzdiyVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                zzbzt.zze("Activity context is needed for policy validator.");
            } else if (this.zzg == null || zzdiyVar.zzh() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzg.zza(zzdiyVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
                } catch (zzcfm e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final void zze(final zzdiy zzdiyVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdia
            @Override // java.lang.Runnable
            public final void run() {
                zzdic.this.zzb(zzdiyVar);
            }
        });
    }

    public final boolean zzf(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
