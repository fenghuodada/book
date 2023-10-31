package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3296i;
import com.applovin.impl.sdk.utils.C3333k;
import com.applovin.impl.sdk.utils.C3337o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.n */
/* loaded from: classes.dex */
public class C3220n implements C3296i.InterfaceC3297a {

    /* renamed from: a */
    private final C3214m f8442a;

    /* renamed from: b */
    private Object f8443b;

    /* renamed from: c */
    private WeakReference<View> f8444c = new WeakReference<>(null);

    /* renamed from: d */
    private C3296i f8445d;

    /* renamed from: e */
    private C3337o f8446e;

    /* renamed from: f */
    private int f8447f;

    public C3220n(C3214m c3214m) {
        this.f8442a = c3214m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageButton, android.widget.ImageView, android.view.View] */
    /* renamed from: a */
    private View m7383a(final Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(C3393R.C3395drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(m7374e());
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.sdk.n.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3220n.this.m7382a((Context) activity);
            }
        });
        if (C3294g.m7023d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7382a(Context context) {
        final String m7373f = m7373f();
        final WeakReference weakReference = new WeakReference(context);
        new AlertDialog.Builder(context).setTitle("Ad Info").setMessage(m7373f).setNegativeButton("Close", (DialogInterface.OnClickListener) null).setPositiveButton("Report", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.n.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    C3220n.this.m7381a(context2, m7373f);
                }
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7381a(Context context, String str) {
        C3333k c3333k = new C3333k();
        c3333k.m6929b("Describe your issue below:\n\n\n").m6933a("Ad Info:").m6933a(str).m6933a("\nDebug Info:\n").m6932a("Platform", "fireos".equals(this.f8442a.m7466V().m7134f()) ? "Fire OS" : "Android").m6932a("AppLovin SDK Version", AppLovinSdk.VERSION).m6932a("Plugin Version", this.f8442a.m7456a(C3109b.f8004dz)).m6932a("Ad Review Version", C3127e.m7713a()).m6932a("App Package Name", context.getPackageName()).m6932a("Device", Build.DEVICE).m6932a("OS Version", Build.VERSION.RELEASE).m6932a("AppLovin Random Token", this.f8442a.m7397o()).m6938a(m7372g());
        Intent intent = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", "MAX Ad Report").setPackage("com.google.android.gm");
        if (this.f8443b instanceof AbstractC3080e) {
            intent.putExtra("android.intent.extra.SUBJECT", "AppLovin Ad Report");
            JSONObject originalFullResponse = ((AbstractC3080e) this.f8443b).getOriginalFullResponse();
            Uri cacheTextWithFileName = AppLovinContentProviderUtils.cacheTextWithFileName(originalFullResponse.toString(), "ad_response.json");
            if (cacheTextWithFileName != null) {
                intent.putExtra("android.intent.extra.STREAM", cacheTextWithFileName);
            } else {
                c3333k.m6933a("\nAd Response:\n");
                c3333k.m6933a(originalFullResponse.toString());
            }
        }
        intent.putExtra("android.intent.extra.TEXT", c3333k.toString());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage(null);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7375d() {
        if (this.f8442a.m7435ae().m7068b() && this.f8444c.get() == null) {
            Activity m8070a = this.f8442a.m7434af().m8070a();
            if (m8070a == null) {
                C3349v m7487A = this.f8442a.m7487A();
                m7487A.m6850e("AppLovinSdk", "Failed to display creative debugger button for ad: " + this.f8443b);
                return;
            }
            View findViewById = m8070a.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                if (C3349v.m6862a()) {
                    C3349v m7487A2 = this.f8442a.m7487A();
                    m7487A2.m6855b("AppLovinSdk", "Displaying creative debugger button for ad: " + this.f8443b);
                }
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View m7383a = m7383a(m8070a);
                frameLayout.addView(m7383a);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                m7383a.startAnimation(alphaAnimation);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.sdk.n.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (m7383a.getParent() == null) {
                            frameLayout.addView(m7383a);
                        }
                    }
                });
                this.f8444c = new WeakReference<>(m7383a);
            }
        }
    }

    /* renamed from: e */
    private Drawable m7374e() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* renamed from: f */
    private String m7373f() {
        C3333k c3333k = new C3333k();
        Object obj = this.f8443b;
        if (obj instanceof AbstractC3080e) {
            AbstractC3080e abstractC3080e = (AbstractC3080e) obj;
            c3333k.m6932a("Network", "APPLOVIN").m6935a(abstractC3080e).m6930b(abstractC3080e);
        } else if (obj instanceof AbstractC2823a) {
            c3333k.m6936a((AbstractC2823a) obj);
        }
        c3333k.m6934a(this.f8442a);
        c3333k.m6938a(m7372g());
        return c3333k.toString();
    }

    @Nullable
    /* renamed from: g */
    private Bundle m7372g() {
        Bundle m7708b = this.f8442a.m7486B().m7708b(Utils.getCurrentAdServeId(this.f8443b));
        if (m7708b != null) {
            for (String str : m7708b.keySet()) {
                Object obj = m7708b.get(str);
                m7708b.remove(str);
                BundleUtils.put(StringUtils.toHumanReadableString(str), obj, m7708b);
            }
            return m7708b;
        }
        return null;
    }

    /* renamed from: a */
    public void m7384a() {
        C3296i c3296i = this.f8445d;
        if (c3296i != null) {
            c3296i.m6991b();
        }
        this.f8443b = null;
        this.f8444c = new WeakReference<>(null);
    }

    /* renamed from: a */
    public void m7376a(Object obj) {
        if (C2895c.m8453b(obj)) {
            return;
        }
        this.f8443b = obj;
        if (((Boolean) this.f8442a.m7456a(C3109b.f7856bH)).booleanValue() && this.f8442a.m7396p().isCreativeDebuggerEnabled()) {
            if (this.f8445d == null) {
                this.f8445d = new C3296i(this.f8442a, this);
            }
            this.f8445d.m6992a();
        }
    }

    @Override // com.applovin.impl.sdk.utils.C3296i.InterfaceC3297a
    /* renamed from: b */
    public void mo6990b() {
        if (this.f8447f == 0) {
            this.f8446e = C3337o.m6906a(TimeUnit.SECONDS.toMillis(3L), this.f8442a, new Runnable() { // from class: com.applovin.impl.sdk.n.1
                @Override // java.lang.Runnable
                public void run() {
                    C3220n.this.f8447f = 0;
                }
            });
        }
        int i = this.f8447f;
        if (i % 2 == 0) {
            this.f8447f = i + 1;
        }
    }

    @Override // com.applovin.impl.sdk.utils.C3296i.InterfaceC3297a
    /* renamed from: c */
    public void mo6989c() {
        int i = this.f8447f;
        if (i % 2 == 1) {
            this.f8447f = i + 1;
        }
        if (this.f8447f / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.2
                @Override // java.lang.Runnable
                public void run() {
                    C3220n.this.m7375d();
                }
            });
            this.f8447f = 0;
            this.f8446e.m6899d();
            this.f8445d.m6991b();
        }
    }
}
