package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzt;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    @NotOnlyInitialized
    protected final zzea zza;

    public BaseAdView(@NonNull Context context, int i) {
        super(context);
        this.zza = new zzea(this, i);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, false, i);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zza = new zzea(this, attributeSet, false, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.zza = new zzea(this, attributeSet, z, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, z);
    }

    public void destroy() {
        zzbbk.zza(getContext());
        if (((Boolean) zzbdb.zze.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzjD)).booleanValue()) {
                zzbzi.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzk();
                        } catch (IllegalStateException e) {
                            zzbsy.zza(baseAdView.getContext()).zzf(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzk();
    }

    @NonNull
    public AdListener getAdListener() {
        return this.zza.zza();
    }

    @Nullable
    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    @NonNull
    public String getAdUnitId() {
        return this.zza.zzj();
    }

    @Nullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isLoading() {
        return this.zza.zzA();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull final AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbbk.zza(getContext());
        if (((Boolean) zzbdb.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzjG)).booleanValue()) {
                zzbzi.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzm(adRequest.zza);
                        } catch (IllegalStateException e) {
                            zzbsy.zza(baseAdView.getContext()).zzf(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AdSize adSize;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzbzt.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        zzbbk.zza(getContext());
        if (((Boolean) zzbdb.zzg.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzjE)).booleanValue()) {
                zzbzi.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzn();
                        } catch (IllegalStateException e) {
                            zzbsy.zza(baseAdView.getContext()).zzf(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbbk.zza(getContext());
        if (((Boolean) zzbdb.zzh.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbk.zzjC)).booleanValue()) {
                zzbzi.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.zza.zzp();
                        } catch (IllegalStateException e) {
                            zzbsy.zza(baseAdView.getContext()).zzf(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    public void setAdListener(@NonNull AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == null) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(@NonNull String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }
}
