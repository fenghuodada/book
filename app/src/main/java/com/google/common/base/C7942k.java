package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.AbstractC7930c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.base.k */
/* loaded from: classes3.dex */
public final class C7942k {

    /* renamed from: a */
    public final AbstractC7930c f15698a;

    /* renamed from: b */
    public final InterfaceC7944b f15699b;

    /* renamed from: c */
    public final int f15700c;

    /* renamed from: com.google.common.base.k$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7943a extends AbstractC7928a<String> {

        /* renamed from: c */
        public final CharSequence f15701c;

        /* renamed from: d */
        public final AbstractC7930c f15702d;

        /* renamed from: g */
        public int f15705g;

        /* renamed from: f */
        public int f15704f = 0;

        /* renamed from: e */
        public final boolean f15703e = false;

        public AbstractC7943a(C7942k c7942k, CharSequence charSequence) {
            this.f15702d = c7942k.f15698a;
            this.f15705g = c7942k.f15700c;
            this.f15701c = charSequence;
        }
    }

    /* renamed from: com.google.common.base.k$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7944b {
    }

    public C7942k(C7941j c7941j) {
        AbstractC7930c.C7934d c7934d = AbstractC7930c.C7934d.f15690c;
        this.f15699b = c7941j;
        this.f15698a = c7934d;
        this.f15700c = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final List<String> m4285a(CharSequence charSequence) {
        charSequence.getClass();
        C7941j c7941j = (C7941j) this.f15699b;
        c7941j.getClass();
        C7940i c7940i = new C7940i(c7941j, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c7940i.hasNext()) {
            arrayList.add(c7940i.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
