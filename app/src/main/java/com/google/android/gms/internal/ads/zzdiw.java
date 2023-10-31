package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdiw {
    private final zzdnk zza;
    private final zzdlz zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdiw(zzdnk zzdnkVar, zzdlz zzdlzVar) {
        this.zza = zzdnkVar;
        this.zzb = zzdlzVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzm.zzx(context, i);
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcfm {
        zzcfb zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzad("/sendMessageToSdk", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdis
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdiw.this.zzb((zzcfb) obj, map);
            }
        });
        zza.zzad("/hideValidatorOverlay", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdit
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdiw.this.zzc(windowManager, view, (zzcfb) obj, map);
            }
        });
        zza.zzad("/open", new zzbis(null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdiu
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdiw.this.zze(view, windowManager, (zzcfb) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showValidatorOverlay", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdiv
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzbzt.zze("Show native ad policy validator overlay.");
                ((zzcfb) obj).zzF().setVisibility(0);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcfb zzcfbVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcfb zzcfbVar, Map map) {
        zzbzt.zze("Hide native ad policy validator overlay.");
        zzcfbVar.zzF().setVisibility(8);
        if (zzcfbVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfbVar.zzF());
        }
        zzcfbVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(FacebookAdapter.KEY_ID, (String) map.get(FacebookAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcfb zzcfbVar, final Map map) {
        zzcfbVar.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzdiq
            @Override // com.google.android.gms.internal.ads.zzcgm
            public final void zza(boolean z) {
                zzdiw.this.zzd(map, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhD)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhE)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcfbVar.zzag(zzcgq.zzb(zzf, zzf2));
        try {
            zzcfbVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhF)).booleanValue());
            zzcfbVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhG)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzcfbVar.zzF(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdir
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zzcfb zzcfbVar2 = zzcfbVar;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i2 = i;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzcfbVar2.zzF().getWindowToken() == null) {
                        return;
                    }
                    layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i2;
                    windowManager2.updateViewLayout(zzcfbVar2.zzF(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcfbVar.loadUrl(str2);
    }
}
