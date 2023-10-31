package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.AbstractC2774i;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.sdk.AppLovinSdkUtils;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.adview.l */
/* loaded from: classes.dex */
public class DialogC2781l extends Dialog implements InterfaceC2780k {

    /* renamed from: a */
    private final Activity f6642a;

    /* renamed from: b */
    private final C3214m f6643b;

    /* renamed from: c */
    private final C3349v f6644c;

    /* renamed from: d */
    private final C2762d f6645d;

    /* renamed from: e */
    private final C3075a f6646e;

    /* renamed from: f */
    private RelativeLayout f6647f;

    /* renamed from: g */
    private AbstractC2774i f6648g;

    public DialogC2781l(C3075a c3075a, C2762d c2762d, Activity activity, C3214m c3214m) {
        super(activity, 16973840);
        if (c3075a == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (c2762d == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f6643b = c3214m;
        this.f6644c = c3214m.m7487A();
        this.f6642a = activity;
        this.f6645d = c2762d;
        this.f6646e = c3075a;
        requestWindowFeature(1);
        setCancelable(false);
    }

    /* renamed from: a */
    private int m8929a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f6642a, i);
    }

    /* renamed from: a */
    private void m8928a(AbstractC2774i.EnumC2775a enumC2775a) {
        if (this.f6648g != null) {
            if (C3349v.m6862a()) {
                this.f6644c.m6851d("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        AbstractC2774i m8948a = AbstractC2774i.m8948a(enumC2775a, this.f6642a);
        this.f6648g = m8948a;
        m8948a.setVisibility(8);
        this.f6648g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DialogC2781l.this.m8922d();
            }
        });
        this.f6648g.setClickable(false);
        int m8929a = m8929a(((Integer) this.f6643b.m7456a(C3109b.f7869bU)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m8929a, m8929a);
        layoutParams.addRule(10);
        C3214m c3214m = this.f6643b;
        C3109b<Boolean> c3109b = C3109b.f7872bX;
        layoutParams.addRule(((Boolean) c3214m.m7456a(c3109b)).booleanValue() ? 9 : 11);
        this.f6648g.mo8886a(m8929a);
        int m8929a2 = m8929a(((Integer) this.f6643b.m7456a(C3109b.f7871bW)).intValue());
        int m8929a3 = m8929a(((Integer) this.f6643b.m7456a(C3109b.f7870bV)).intValue());
        layoutParams.setMargins(m8929a3, m8929a2, m8929a3, 0);
        this.f6647f.addView(this.f6648g, layoutParams);
        this.f6648g.bringToFront();
        int m8929a4 = m8929a(((Integer) this.f6643b.m7456a(C3109b.f7873bY)).intValue());
        View view = new View(this.f6642a);
        view.setBackgroundColor(0);
        int i = m8929a + m8929a4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f6643b.m7456a(c3109b)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(m8929a3 - m8929a(5), m8929a2 - m8929a(5), m8929a3 - m8929a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (DialogC2781l.this.f6648g.isClickable()) {
                    DialogC2781l.this.f6648g.performClick();
                }
            }
        });
        this.f6647f.addView(view, layoutParams2);
        view.bringToFront();
    }

    /* renamed from: c */
    private void m8924c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6645d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f6642a);
        this.f6647f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6647f.setBackgroundColor(-1157627904);
        this.f6647f.addView(this.f6645d);
        if (!this.f6646e.m8000m()) {
            m8928a(this.f6646e.m7999n());
            m8920e();
        }
        setContentView(this.f6647f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m8922d() {
        this.f6645d.m8971a("javascript:al_onCloseTapped();", new Runnable() { // from class: com.applovin.impl.adview.l.1
            @Override // java.lang.Runnable
            public void run() {
                DialogC2781l.this.dismiss();
            }
        });
    }

    /* renamed from: e */
    private void m8920e() {
        this.f6642a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (DialogC2781l.this.f6648g == null) {
                        DialogC2781l.this.m8922d();
                    }
                    DialogC2781l.this.f6648g.setVisibility(0);
                    DialogC2781l.this.f6648g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.l.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            DialogC2781l.this.f6648g.setClickable(true);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    DialogC2781l.this.f6648g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        DialogC2781l.this.f6644c.m6854b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    DialogC2781l.this.m8922d();
                }
            }
        });
    }

    /* renamed from: a */
    public C3075a m8930a() {
        return this.f6646e;
    }

    /* renamed from: b */
    public C2762d m8926b() {
        return this.f6645d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.InterfaceC2780k
    public void dismiss() {
        C3123d statsManagerHelper = this.f6645d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.m7739e();
        }
        this.f6642a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.3
            @Override // java.lang.Runnable
            public void run() {
                DialogC2781l.this.f6647f.removeView(DialogC2781l.this.f6645d);
                DialogC2781l.super.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f6645d.m8971a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.l.2
            @Override // java.lang.Runnable
            public void run() {
                DialogC2781l.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m8924c();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f6642a.getWindow().getAttributes().flags, this.f6642a.getWindow().getAttributes().flags);
                window.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else if (C3349v.m6862a()) {
                this.f6644c.m6850e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f6644c.m6854b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
