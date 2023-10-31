package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzdjb implements zzdhk {
    @Nullable
    private final zzbon zza;
    private final zzcwa zzb;
    private final zzcvg zzc;
    private final zzdcu zzd;
    private final Context zze;
    private final zzezf zzf;
    private final zzbzz zzg;
    private final zzfaa zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    @Nullable
    private final zzboj zzl;
    @Nullable
    private final zzbok zzm;

    public zzdjb(@Nullable zzboj zzbojVar, @Nullable zzbok zzbokVar, @Nullable zzbon zzbonVar, zzcwa zzcwaVar, zzcvg zzcvgVar, zzdcu zzdcuVar, Context context, zzezf zzezfVar, zzbzz zzbzzVar, zzfaa zzfaaVar) {
        this.zzl = zzbojVar;
        this.zzm = zzbokVar;
        this.zza = zzbonVar;
        this.zzb = zzcwaVar;
        this.zzc = zzcvgVar;
        this.zzd = zzdcuVar;
        this.zze = context;
        this.zzf = zzezfVar;
        this.zzg = zzbzzVar;
        this.zzh = zzfaaVar;
    }

    private final void zzb(View view) {
        try {
            zzbon zzbonVar = this.zza;
            if (zzbonVar != null && !zzbonVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjp)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzboj zzbojVar = this.zzl;
            if (zzbojVar != null && !zzbojVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjp)).booleanValue()) {
                    this.zzd.zzr();
                    return;
                }
                return;
            }
            zzbok zzbokVar = this.zzm;
            if (zzbokVar == null || zzbokVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjp)).booleanValue()) {
                this.zzd.zzr();
            }
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    @Nullable
    public final JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    @Nullable
    public final JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzj(@Nullable com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        zzbzt.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzk(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        String str;
        if (!this.zzj) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (this.zzf.zzM) {
            zzb(view2);
            return;
        } else {
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        zzbzt.zzj(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzq(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbon zzbonVar = this.zza;
                if (zzbonVar != null && !zzbonVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzboj zzbojVar = this.zzl;
                if (zzbojVar != null && !zzbojVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbok zzbokVar = this.zzm;
                if (zzbokVar == null || zzbokVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzs(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        zzbzt.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzx(zzbgk zzbgkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzy(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzak;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbt)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbu)).booleanValue() && next.equals("3010")) {
                                zzbon zzbonVar = this.zza;
                                Object obj2 = null;
                                if (zzbonVar != null) {
                                    try {
                                        zzn = zzbonVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzboj zzbojVar = this.zzl;
                                    if (zzbojVar != null) {
                                        zzn = zzbojVar.zzk();
                                    } else {
                                        zzbok zzbokVar = this.zzm;
                                        zzn = zzbokVar != null ? zzbokVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbu.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbon zzbonVar2 = this.zza;
            if (zzbonVar2 != null) {
                zzbonVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzboj zzbojVar2 = this.zzl;
            if (zzbojVar2 != null) {
                zzbojVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbok zzbokVar2 = this.zzm;
            if (zzbokVar2 != null) {
                zzbokVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzz(View view, @Nullable Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbon zzbonVar = this.zza;
            if (zzbonVar != null) {
                zzbonVar.zzz(wrap);
                return;
            }
            zzboj zzbojVar = this.zzl;
            if (zzbojVar != null) {
                zzbojVar.zzw(wrap);
                return;
            }
            zzbok zzbokVar = this.zzm;
            if (zzbokVar != null) {
                zzbokVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to call untrackView", e);
        }
    }
}
