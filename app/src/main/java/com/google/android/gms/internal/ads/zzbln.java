package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbln implements zzblf, zzbld {
    private final zzcfb zza;

    public zzbln(Context context, zzbzz zzbzzVar, @Nullable zzaqq zzaqqVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcfm {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcfb zza = zzcfn.zza(context, zzcgq.zza(), "", false, false, null, null, zzbzzVar, null, null, null, zzawx.zza(), null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbzm.zzu()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbli
            @Override // java.lang.Runnable
            public final void run() {
                zzbln.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblc.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblc.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblc.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblj
            @Override // java.lang.Runnable
            public final void run() {
                zzbln.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbll
            @Override // java.lang.Runnable
            public final void run() {
                zzbln.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblk
            @Override // java.lang.Runnable
            public final void run() {
                zzbln.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final boolean zzi() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final zzbmm zzj() {
        return new zzbmm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzk(final zzblu zzbluVar) {
        this.zza.zzN().zzG(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzblg
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza() {
                zzblu zzbluVar2 = zzblu.this;
                final zzbmk zzbmkVar = zzbluVar2.zza;
                final ArrayList arrayList = zzbluVar2.zzb;
                final long j = zzbluVar2.zzc;
                final zzbmj zzbmjVar = zzbluVar2.zzd;
                final zzblf zzblfVar = zzbluVar2.zze;
                arrayList.add(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j));
                String valueOf = String.valueOf(arrayList.get(0));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbls
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmk.this.zzi(zzbmjVar, zzblfVar, arrayList, j);
                    }
                }, (long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzblc.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final void zzq(String str, zzbii zzbiiVar) {
        this.zza.zzad(str, new zzblm(this, zzbiiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final void zzr(String str, final zzbii zzbiiVar) {
        this.zza.zzav(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzblh
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbii zzbiiVar2;
                zzbii zzbiiVar3 = zzbii.this;
                zzbii zzbiiVar4 = (zzbii) obj;
                if (zzbiiVar4 instanceof zzblm) {
                    zzbiiVar2 = ((zzblm) zzbiiVar4).zzb;
                    return zzbiiVar2.equals(zzbiiVar3);
                }
                return false;
            }
        });
    }
}
