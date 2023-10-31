package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes.dex */
public abstract class AbstractC1645s {

    /* renamed from: a */
    public final RecyclerView.LayoutManager f4001a;

    /* renamed from: b */
    public int f4002b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f4003c = new Rect();

    public AbstractC1645s(RecyclerView.LayoutManager layoutManager) {
        this.f4001a = layoutManager;
    }

    /* renamed from: a */
    public static AbstractC1645s m10125a(int i, RecyclerView.LayoutManager layoutManager) {
        if (i != 0) {
            if (i == 1) {
                return new C1644r(layoutManager);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C1643q(layoutManager);
    }

    /* renamed from: b */
    public abstract int mo10124b(View view);

    /* renamed from: c */
    public abstract int mo10123c(View view);

    /* renamed from: d */
    public abstract int mo10122d(View view);

    /* renamed from: e */
    public abstract int mo10121e(View view);

    /* renamed from: f */
    public abstract int mo10120f();

    /* renamed from: g */
    public abstract int mo10119g();

    /* renamed from: h */
    public abstract int mo10118h();

    /* renamed from: i */
    public abstract int mo10117i();

    /* renamed from: j */
    public abstract int mo10116j();

    /* renamed from: k */
    public abstract int mo10115k();

    /* renamed from: l */
    public abstract int mo10114l();

    /* renamed from: m */
    public abstract int mo10113m(View view);

    /* renamed from: n */
    public abstract int mo10112n(View view);

    /* renamed from: o */
    public abstract void mo10111o(int i);
}
