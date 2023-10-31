package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdhy extends zzbet implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdiy {
    public static final zzfrr zza = zzfrr.zzo("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzfwc zzf;
    private View zzg;
    private zzdgx zzi;
    private zzatz zzj;
    private zzben zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 231700000;

    public zzdhy(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcat.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcat.zzb(frameLayout, this);
        this.zzf = zzcag.zze;
        this.zzj = new zzatz(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    zzbzt.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhx
            @Override // java.lang.Runnable
            public final void run() {
                zzdhy.this.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjP)).booleanValue() || this.zzi.zza() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdie(this.zzi, this));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar == null || !zzdgxVar.zzT()) {
            return;
        }
        this.zzi.zzs();
        this.zzi.zzC(view, this.zzd, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgxVar.zzA(frameLayout, zzl(), zzm(), zzdgx.zzW(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdgxVar.zzA(frameLayout, zzl(), zzm(), zzdgx.zzW(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar == null) {
            return false;
        }
        zzdgxVar.zzJ(view, motionEvent, this.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjP)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
            this.zzo.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized void zzbs(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized void zzbt(IObjectWrapper iObjectWrapper) {
        this.zzi.zzL((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized void zzbu(zzben zzbenVar) {
        if (this.zzn) {
            return;
        }
        this.zzm = true;
        this.zzl = zzbenVar;
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            zzdgxVar.zzc().zzb(zzbenVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized void zzbv(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized void zzbw(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdgx)) {
            zzbzt.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            zzdgxVar.zzR(this);
        }
        zzu();
        zzdgx zzdgxVar2 = (zzdgx) unwrap;
        this.zzi = zzdgxVar2;
        zzdgxVar2.zzQ(this);
        this.zzi.zzI(this.zzd);
        this.zzi.zzr(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdF)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            zzdgxVar.zzR(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    @Nullable
    public final synchronized View zzg(String str) {
        if (this.zzn) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.zzc.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final zzatz zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    @Nullable
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    @Nullable
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    @Nullable
    public final synchronized JSONObject zzo() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            return zzdgxVar.zzi(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    @Nullable
    public final synchronized JSONObject zzp() {
        zzdgx zzdgxVar = this.zzi;
        if (zzdgxVar != null) {
            return zzdgxVar.zzk(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final synchronized void zzq(String str, View view, boolean z) {
        if (this.zzn) {
            return;
        }
        if (view == null) {
            this.zzc.remove(str);
            return;
        }
        this.zzc.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzbx.zzi(this.zzh)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
