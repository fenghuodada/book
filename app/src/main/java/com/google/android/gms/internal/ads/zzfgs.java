package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfgs extends zzfgo {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfgq zzb;
    private final zzfgp zzc;
    private zzfim zze;
    private zzfhp zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    public zzfgs(zzfgp zzfgpVar, zzfgq zzfgqVar) {
        this.zzc = zzfgpVar;
        this.zzb = zzfgqVar;
        zzk(null);
        if (zzfgqVar.zzd() == zzfgr.HTML || zzfgqVar.zzd() == zzfgr.JAVASCRIPT) {
            this.zzf = new zzfhq(zzfgqVar.zza());
        } else {
            this.zzf = new zzfhs(zzfgqVar.zzi(), null);
        }
        this.zzf.zzj();
        zzfhd.zza().zzd(this);
        zzfhi.zza().zzd(this.zzf.zza(), zzfgpVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfim(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzb(View view, zzfgu zzfguVar, @Nullable String str) {
        zzfhf zzfhfVar;
        if (this.zzh) {
            return;
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzfhfVar = null;
                break;
            }
            zzfhfVar = (zzfhf) it.next();
            if (zzfhfVar.zzb().get() == view) {
                break;
            }
        }
        if (zzfhfVar == null) {
            this.zzd.add(new zzfhf(view, zzfguVar, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfhi.zza().zzc(this.zzf.zza());
        zzfhd.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzfgs> zzc = zzfhd.zza().zzc();
        if (zzc == null || zzc.isEmpty()) {
            return;
        }
        for (zzfgs zzfgsVar : zzc) {
            if (zzfgsVar != this && zzfgsVar.zzf() == view) {
                zzfgsVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzfhd.zza().zzf(this);
        this.zzf.zzh(zzfhj.zzb().zza());
        this.zzf.zzf(this, this.zzb);
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfhp zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
