package mva2.adapter;

import android.view.ViewGroup;
import java.util.ArrayList;
import mva2.adapter.C11177d;

/* renamed from: mva2.adapter.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11175b<M, VH extends C11177d<M>> {

    /* renamed from: a */
    public final ArrayList f21830a = new ArrayList();

    /* renamed from: a */
    public abstract void mo93a(VH vh, M m);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void mo92b(C11177d c11177d, Object obj) {
        mo93a(c11177d, obj);
    }

    /* renamed from: c */
    public abstract boolean mo91c(Object obj);

    /* renamed from: d */
    public abstract VH mo90d(ViewGroup viewGroup);
}
