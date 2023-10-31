package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7239i;
import com.google.android.exoplayer2.text.span.InterfaceC7245b;
import com.google.android.exoplayer2.util.C7408g0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleView */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements InterfaceC7239i {

    /* renamed from: a */
    public List<Cue> f13538a;

    /* renamed from: b */
    public CaptionStyleCompat f13539b;

    /* renamed from: c */
    public int f13540c;

    /* renamed from: d */
    public float f13541d;

    /* renamed from: e */
    public float f13542e;

    /* renamed from: f */
    public boolean f13543f;

    /* renamed from: g */
    public boolean f13544g;

    /* renamed from: h */
    public int f13545h;

    /* renamed from: i */
    public InterfaceC7314a f13546i;

    /* renamed from: j */
    public View f13547j;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$ViewType */
    /* loaded from: classes.dex */
    public @interface ViewType {
    }

    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7314a {
        /* renamed from: a */
        void mo5181a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2);
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13538a = Collections.emptyList();
        this.f13539b = CaptionStyleCompat.f13502g;
        this.f13540c = 0;
        this.f13541d = 0.0533f;
        this.f13542e = 0.08f;
        this.f13543f = true;
        this.f13544g = true;
        C7317a c7317a = new C7317a(context);
        this.f13546i = c7317a;
        this.f13547j = c7317a;
        addView(c7317a);
        this.f13545h = 1;
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        Object[] spans;
        if (this.f13543f && this.f13544g) {
            return this.f13538a;
        }
        ArrayList arrayList = new ArrayList(this.f13538a.size());
        for (int i = 0; i < this.f13538a.size(); i++) {
            Cue cue = this.f13538a.get(i);
            cue.getClass();
            Cue.C7206a c7206a = new Cue.C7206a(cue);
            if (!this.f13543f) {
                c7206a.f12999n = false;
                CharSequence charSequence = c7206a.f12986a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c7206a.f12986a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c7206a.f12986a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC7245b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                C7337n.m5188a(c7206a);
            } else if (!this.f13544g) {
                C7337n.m5188a(c7206a);
            }
            arrayList.add(c7206a.m5372a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C7408g0.f13905a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        CaptioningManager captioningManager;
        CaptionStyleCompat captionStyleCompat;
        int i;
        int i2;
        int i3;
        int i4 = C7408g0.f13905a;
        CaptionStyleCompat captionStyleCompat2 = CaptionStyleCompat.f13502g;
        if (i4 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i4 >= 21) {
                int i5 = -1;
                if (userStyle.hasForegroundColor()) {
                    i = userStyle.foregroundColor;
                } else {
                    i = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i2 = userStyle.backgroundColor;
                } else {
                    i2 = -16777216;
                }
                int i6 = i2;
                int i7 = 0;
                if (userStyle.hasWindowColor()) {
                    i3 = userStyle.windowColor;
                } else {
                    i3 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i7 = userStyle.edgeType;
                }
                int i8 = i7;
                if (userStyle.hasEdgeColor()) {
                    i5 = userStyle.edgeColor;
                }
                captionStyleCompat = new CaptionStyleCompat(i, i6, i3, i8, i5, userStyle.getTypeface());
            } else {
                captionStyleCompat = new CaptionStyleCompat(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return captionStyleCompat;
        }
        return captionStyleCompat2;
    }

    private <T extends View & InterfaceC7314a> void setView(T t) {
        removeView(this.f13547j);
        View view = this.f13547j;
        if (view instanceof C7342r) {
            ((C7342r) view).f13705b.destroy();
        }
        this.f13547j = t;
        this.f13546i = t;
        addView(t);
    }

    /* renamed from: a */
    public final void m5223a() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: b */
    public final void m5222b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* renamed from: c */
    public final void m5221c() {
        this.f13546i.mo5181a(getCuesWithStylingPreferencesApplied(), this.f13539b, this.f13541d, this.f13540c, this.f13542e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f13544g = z;
        m5221c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f13543f = z;
        m5221c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f13542e = f;
        m5221c();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f13538a = list;
        m5221c();
    }

    public void setFractionalTextSize(float f) {
        this.f13540c = 0;
        this.f13541d = f;
        m5221c();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.f13539b = captionStyleCompat;
        m5221c();
    }

    public void setViewType(int i) {
        KeyEvent.Callback c7317a;
        if (this.f13545h == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                c7317a = new C7342r(getContext());
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            c7317a = new C7317a(getContext());
        }
        setView(c7317a);
        this.f13545h = i;
    }

    @Override // com.google.android.exoplayer2.text.InterfaceC7239i
    /* renamed from: z */
    public final void mo5191z(List<Cue> list) {
        setCues(list);
    }
}
