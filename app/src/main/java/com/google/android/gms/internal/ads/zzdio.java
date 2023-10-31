package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdio {
    private final zzdnk zza;
    private final zzdlz zzb;
    private final zzcoj zzc;
    private final zzdhk zzd;

    public zzdio(zzdnk zzdnkVar, zzdlz zzdlzVar, zzcoj zzcojVar, zzdhk zzdhkVar) {
        this.zza = zzdnkVar;
        this.zzb = zzdlzVar;
        this.zzc = zzcojVar;
        this.zzd = zzdhkVar;
    }

    public final View zza() throws zzcfm {
        zzcfb zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzad("/sendMessageToSdk", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdii
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdio.this.zzb((zzcfb) obj, map);
            }
        });
        zza.zzad("/adMuted", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdij
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdio.this.zzc((zzcfb) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdik
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, final Map map) {
                final zzdio zzdioVar = zzdio.this;
                zzcfb zzcfbVar = (zzcfb) obj;
                zzcfbVar.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzdin
                    @Override // com.google.android.gms.internal.ads.zzcgm
                    public final void zza(boolean z) {
                        zzdio.this.zzd(map, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfbVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfbVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdil
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdio.this.zze((zzcfb) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdim
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdio.this.zzf((zzcfb) obj, map);
            }
        });
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcfb zzcfbVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcfb zzcfbVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(FacebookAdapter.KEY_ID, (String) map.get(FacebookAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(zzcfb zzcfbVar, Map map) {
        zzbzt.zzi("Showing native ads overlay.");
        zzcfbVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcfb zzcfbVar, Map map) {
        zzbzt.zzi("Hiding native ads overlay.");
        zzcfbVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
