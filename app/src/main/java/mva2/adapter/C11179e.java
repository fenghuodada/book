package mva2.adapter;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import mva2.adapter.internal.C11185b;
import mva2.adapter.util.EnumC11188a;

/* renamed from: mva2.adapter.e */
/* loaded from: classes3.dex */
public final class C11179e<M> extends AbstractC11183h {

    /* renamed from: e */
    public final ArrayList f21836e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f21837f = new ArrayList();

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: e */
    public final int mo79e() {
        return this.f21836e.size();
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: g */
    public final Object mo77g(int i) {
        return this.f21836e.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d  */
    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo75i(int r18, int r19, androidx.recyclerview.widget.RecyclerView.LayoutManager r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mva2.adapter.C11179e.mo75i(int, int, androidx.recyclerview.widget.RecyclerView$LayoutManager):int");
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: j */
    public final boolean mo74j(int i) {
        return ((C11185b) this.f21837f.get(i)).f21854a;
    }

    @Override // mva2.adapter.AbstractC11183h
    /* renamed from: n */
    public final void mo70n(int i, @NonNull EnumC11188a enumC11188a) {
        C11185b c11185b;
        EnumC11188a enumC11188a2;
        if (i < mo79e() && i >= 0 && (enumC11188a2 = this.f21849a) != EnumC11188a.INHERIT) {
            enumC11188a = enumC11188a2;
        }
        EnumC11188a enumC11188a3 = EnumC11188a.SINGLE;
        ArrayList arrayList = this.f21837f;
        if (enumC11188a == enumC11188a3) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C11185b c11185b2 = (C11185b) it.next();
                if (i2 == i) {
                    boolean z = c11185b2.f21854a;
                    if (z) {
                        c11185b2.f21854a = !z;
                        m73k(i2, "item_expansion_payload");
                        return;
                    }
                    c11185b2.f21854a = !z;
                    m73k(i2, "item_expansion_payload");
                } else if (c11185b2.f21854a) {
                    c11185b2.f21854a = false;
                    m73k(i2, "item_expansion_payload");
                    if (i < 0) {
                        return;
                    }
                } else {
                    continue;
                }
                i2++;
            }
        } else if (enumC11188a == EnumC11188a.MULTIPLE && i < mo79e() && i >= 0) {
            ((C11185b) arrayList.get(i)).f21854a = !c11185b.f21854a;
            m73k(i, "item_expansion_payload");
        }
    }
}
