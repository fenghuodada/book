package androidx.cursoradapter.widget;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: androidx.cursoradapter.widget.c */
/* loaded from: classes.dex */
public abstract class AbstractC1067c extends AbstractC1062a {

    /* renamed from: h */
    public final int f2743h;

    /* renamed from: i */
    public final int f2744i;

    /* renamed from: j */
    public final LayoutInflater f2745j;

    @Deprecated
    public AbstractC1067c(Context context, int i) {
        super(context);
        this.f2744i = i;
        this.f2743h = i;
        this.f2745j = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
