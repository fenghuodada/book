package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zzfhy {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final Map zzh = new WeakHashMap();
    private boolean zzi;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfhx zzb(View view) {
        zzfhx zzfhxVar = (zzfhx) this.zzb.get(view);
        if (zzfhxVar != null) {
            this.zzb.remove(view);
        }
        return zzfhxVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        Boolean bool;
        String str;
        zzfhd zza = zzfhd.zza();
        if (zza != null) {
            for (zzfgs zzfgsVar : zza.zzb()) {
                View zzf = zzfgsVar.zzf();
                if (zzfgsVar.zzj()) {
                    String zzh = zzfgsVar.zzh();
                    if (zzf != null) {
                        if (zzf.isAttachedToWindow()) {
                            if (zzf.hasWindowFocus()) {
                                this.zzh.remove(zzf);
                                bool = Boolean.FALSE;
                            } else if (this.zzh.containsKey(zzf)) {
                                bool = (Boolean) this.zzh.get(zzf);
                            } else {
                                Map map = this.zzh;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(zzf, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = zzf;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String zzb = zzfhw.zzb(view);
                                    if (zzb != null) {
                                        str = zzb;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzf, zzh);
                            for (zzfhf zzfhfVar : zzfgsVar.zzi()) {
                                View view2 = (View) zzfhfVar.zzb().get();
                                if (view2 != null) {
                                    zzfhx zzfhxVar = (zzfhx) this.zzb.get(view2);
                                    if (zzfhxVar != null) {
                                        zzfhxVar.zzc(zzfgsVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfhx(zzfhfVar, zzfgsVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzf);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        if (this.zzh.containsKey(view)) {
            this.zzh.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int zzk(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzi ? 2 : 3;
    }
}
