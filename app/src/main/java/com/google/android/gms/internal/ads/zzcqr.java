package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcqr extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcqr(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcqr zza(Context context, View view, zzezf zzezfVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcqr zzcqrVar = new zzcqr(context);
        if (!zzezfVar.zzv.isEmpty() && (resources = zzcqrVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzezg zzezgVar = (zzezg) zzezfVar.zzv.get(0);
            float f = displayMetrics.density;
            zzcqrVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzezgVar.zza * f), (int) (zzezgVar.zzb * f)));
        }
        zzcqrVar.zzb = view;
        zzcqrVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcat.zzb(zzcqrVar, zzcqrVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcat.zza(zzcqrVar, zzcqrVar);
        JSONObject jSONObject = zzezfVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqrVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcqrVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcqrVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcqrVar.addView(relativeLayout);
        return zzcqrVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzm.zzx(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
