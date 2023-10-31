package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0134j;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.view.menu.C0210g;
import androidx.core.view.C0922g2;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f875a;

    /* renamed from: b */
    public TypedValue f876b;

    /* renamed from: c */
    public TypedValue f877c;

    /* renamed from: d */
    public TypedValue f878d;

    /* renamed from: e */
    public TypedValue f879e;

    /* renamed from: f */
    public TypedValue f880f;

    /* renamed from: g */
    public final Rect f881g;

    /* renamed from: h */
    public InterfaceC0249a f882h;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0249a {
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f881g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f879e == null) {
            this.f879e = new TypedValue();
        }
        return this.f879e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f880f == null) {
            this.f880f = new TypedValue();
        }
        return this.f880f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f877c == null) {
            this.f877c = new TypedValue();
        }
        return this.f877c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f878d == null) {
            this.f878d = new TypedValue();
        }
        return this.f878d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f875a == null) {
            this.f875a = new TypedValue();
        }
        return this.f875a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f876b == null) {
            this.f876b = new TypedValue();
        }
        return this.f876b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0249a interfaceC0249a = this.f882h;
        if (interfaceC0249a != null) {
            interfaceC0249a.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0249a interfaceC0249a = this.f882h;
        if (interfaceC0249a != null) {
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = ((C0134j) interfaceC0249a).f380a;
            InterfaceC0408r0 interfaceC0408r0 = layoutInflater$Factory2C0114h.f335r;
            if (interfaceC0408r0 != null) {
                interfaceC0408r0.mo12527i();
            }
            if (layoutInflater$Factory2C0114h.f340w != null) {
                layoutInflater$Factory2C0114h.f329l.getDecorView().removeCallbacks(layoutInflater$Factory2C0114h.f341x);
                if (layoutInflater$Factory2C0114h.f340w.isShowing()) {
                    try {
                        layoutInflater$Factory2C0114h.f340w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflater$Factory2C0114h.f340w = null;
            }
            C0922g2 c0922g2 = layoutInflater$Factory2C0114h.f342y;
            if (c0922g2 != null) {
                c0922g2.m11472b();
            }
            C0210g c0210g = layoutInflater$Factory2C0114h.m12990S(0).f369h;
            if (c0210g != null) {
                c0210g.m12848c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0249a interfaceC0249a) {
        this.f882h = interfaceC0249a;
    }
}
