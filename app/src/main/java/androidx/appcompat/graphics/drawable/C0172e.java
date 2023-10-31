package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.C0166b;

/* renamed from: androidx.appcompat.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0172e extends C0166b {

    /* renamed from: n */
    public C0173a f499n;

    /* renamed from: o */
    public boolean f500o;

    /* renamed from: androidx.appcompat.graphics.drawable.e$a */
    /* loaded from: classes.dex */
    public static class C0173a extends C0166b.AbstractC0169c {

        /* renamed from: H */
        public int[][] f501H;

        public C0173a(C0173a c0173a, C0172e c0172e, Resources resources) {
            super(c0173a, c0172e, resources);
            if (c0173a != null) {
                this.f501H = c0173a.f501H;
            } else {
                this.f501H = new int[this.f478g.length];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0166b.AbstractC0169c
        /* renamed from: e */
        public void mo12903e() {
            int[][] iArr = this.f501H;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f501H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f501H = iArr2;
        }

        /* renamed from: f */
        public final int m12902f(int[] iArr) {
            int[][] iArr2 = this.f501H;
            int i = this.f479h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new C0172e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C0172e(this, resources);
        }
    }

    public C0172e() {
    }

    public C0172e(C0173a c0173a, Resources resources) {
        mo12905e(new C0173a(c0173a, this, resources));
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.C0166b, android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.C0166b
    /* renamed from: e */
    public void mo12905e(@NonNull C0166b.AbstractC0169c abstractC0169c) {
        this.f451a = abstractC0169c;
        int i = this.f457g;
        if (i >= 0) {
            Drawable m12908d = abstractC0169c.m12908d(i);
            this.f453c = m12908d;
            if (m12908d != null) {
                m12913c(m12908d);
            }
        }
        this.f454d = null;
        if (abstractC0169c instanceof C0173a) {
            this.f499n = (C0173a) abstractC0169c;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.C0166b
    /* renamed from: f */
    public C0173a mo12906b() {
        return new C0173a(this.f499n, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.C0166b, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f500o) {
            super.mutate();
            this.f499n.mo12903e();
            this.f500o = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.C0166b, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m12902f = this.f499n.m12902f(iArr);
        if (m12902f < 0) {
            m12902f = this.f499n.m12902f(StateSet.WILD_CARD);
        }
        return m12912d(m12902f) || onStateChange;
    }
}
