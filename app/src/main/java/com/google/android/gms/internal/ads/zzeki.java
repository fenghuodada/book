package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeki implements zzeqq {
    private final zzfwc zza;
    private final zzfwc zzb;
    private final Context zzc;
    private final zzfaa zzd;
    @Nullable
    private final View zze;

    public zzeki(zzfwc zzfwcVar, zzfwc zzfwcVar2, Context context, zzfaa zzfaaVar, @Nullable ViewGroup viewGroup) {
        this.zza = zzfwcVar;
        this.zzb = zzfwcVar2;
        this.zzc = context;
        this.zzd = zzfaaVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        zzfwc zzfwcVar;
        Callable callable;
        zzbbk.zza(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjA)).booleanValue()) {
            zzfwcVar = this.zzb;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzekg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeki.this.zzc();
                }
            };
        } else {
            zzfwcVar = this.zza;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzekh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeki.this.zzd();
                }
            };
        }
        return zzfwcVar.zzb(callable);
    }

    public final /* synthetic */ zzekj zzc() throws Exception {
        return new zzekj(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzekj zzd() throws Exception {
        return new zzekj(this.zzc, this.zzd.zze, zze());
    }
}
