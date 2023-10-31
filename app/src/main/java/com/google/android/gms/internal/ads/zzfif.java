package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfif implements zzfhk {
    private static final zzfif zza = new zzfif();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfib();
    private static final Runnable zze = new zzfic();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfhy zzk = new zzfhy();
    private final zzfhm zzj = new zzfhm();
    private final zzfhz zzl = new zzfhz(new zzfii());

    public static zzfif zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfif zzfifVar) {
        zzfifVar.zzg = 0;
        zzfifVar.zzi.clear();
        zzfifVar.zzh = false;
        for (zzfgs zzfgsVar : zzfhd.zza().zzb()) {
        }
        zzfifVar.zzm = System.nanoTime();
        zzfifVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfhl zza2 = zzfifVar.zzj.zza();
        if (zzfifVar.zzk.zze().size() > 0) {
            Iterator it = zzfifVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfht.zza(0, 0, 0, 0);
                View zza4 = zzfifVar.zzk.zza(str);
                zzfhl zzb2 = zzfifVar.zzj.zzb();
                String zzc2 = zzfifVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfht.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfhu.zza("Error with setting not visible reason", e);
                    }
                    zzfht.zzc(zza3, zza5);
                }
                zzfht.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfifVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfifVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zzfht.zza(0, 0, 0, 0);
            zzfifVar.zzk(null, zza2, zza6, 1, false);
            zzfht.zzf(zza6);
            zzfifVar.zzl.zzd(zza6, zzfifVar.zzk.zzf(), nanoTime);
        } else {
            zzfifVar.zzl.zzb();
        }
        zzfifVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfifVar.zzm;
        if (zzfifVar.zzf.size() > 0) {
            for (zzfie zzfieVar : zzfifVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfieVar.zzb();
                if (zzfieVar instanceof zzfid) {
                    ((zzfid) zzfieVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfhl zzfhlVar, JSONObject jSONObject, int i, boolean z) {
        zzfhlVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final void zza(View view, zzfhl zzfhlVar, JSONObject jSONObject, boolean z) {
        int zzk;
        boolean z2;
        if (zzfhw.zzb(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfhlVar.zza(view);
        zzfht.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfht.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzfhu.zza("Error with setting not visible reason", e);
            }
            this.zzk.zzh();
        } else {
            zzfhx zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfhf zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) zzb3.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e2) {
                    zzfhu.zza("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfhlVar, zza2, zzk, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfia(this));
    }
}
