package com.applovin.impl.mediation.debugger.p021ui.p026d;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.b */
/* loaded from: classes.dex */
public class C2956b {

    /* renamed from: a */
    public TextView f7258a;

    /* renamed from: b */
    public TextView f7259b;

    /* renamed from: c */
    public ImageView f7260c;

    /* renamed from: d */
    public ImageView f7261d;

    /* renamed from: e */
    private C2957c f7262e;

    /* renamed from: f */
    private int f7263f;

    /* renamed from: a */
    public int m8271a() {
        return this.f7263f;
    }

    /* renamed from: a */
    public void m8270a(int i) {
        this.f7263f = i;
    }

    /* renamed from: a */
    public void m8269a(C2957c c2957c) {
        this.f7262e = c2957c;
        this.f7258a.setText(c2957c.mo8217k());
        this.f7258a.setTextColor(c2957c.m8256n());
        if (this.f7259b != null) {
            if (TextUtils.isEmpty(c2957c.mo8264c_())) {
                this.f7259b.setVisibility(8);
            } else {
                this.f7259b.setTypeface(null, 0);
                this.f7259b.setVisibility(0);
                this.f7259b.setText(c2957c.mo8264c_());
                this.f7259b.setTextColor(c2957c.mo8265c());
                if (c2957c.mo8263d_()) {
                    this.f7259b.setTypeface(null, 1);
                }
            }
        }
        if (this.f7260c != null) {
            if (c2957c.mo8262e() > 0) {
                this.f7260c.setImageResource(c2957c.mo8262e());
                this.f7260c.setColorFilter(c2957c.m8255o());
                this.f7260c.setVisibility(0);
            } else {
                this.f7260c.setVisibility(8);
            }
        }
        if (this.f7261d != null) {
            if (c2957c.mo8219f() <= 0) {
                this.f7261d.setVisibility(8);
                return;
            }
            this.f7261d.setImageResource(c2957c.mo8219f());
            this.f7261d.setColorFilter(c2957c.mo8218g());
            this.f7261d.setVisibility(0);
        }
    }

    /* renamed from: b */
    public C2957c m8268b() {
        return this.f7262e;
    }
}
