package com.google.gson;

import com.google.gson.internal.C8668n;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* renamed from: com.google.gson.r */
/* loaded from: classes3.dex */
public final class C8695r extends AbstractC8692o {

    /* renamed from: a */
    public final C8668n<String, AbstractC8692o> f16516a = new C8668n<>();

    /* renamed from: A */
    public final boolean m3219A(String str) {
        return this.f16516a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8695r) && ((C8695r) obj).f16516a.equals(this.f16516a));
    }

    public final int hashCode() {
        return this.f16516a.hashCode();
    }

    /* renamed from: r */
    public final void m3218r(AbstractC8692o abstractC8692o, String str) {
        if (abstractC8692o == null) {
            abstractC8692o = C8694q.f16515a;
        }
        this.f16516a.put(str, abstractC8692o);
    }

    /* renamed from: s */
    public final void m3217s(String str, Boolean bool) {
        m3218r(bool == null ? C8694q.f16515a : new C8700u(bool), str);
    }

    /* renamed from: t */
    public final void m3216t(String str, Number number) {
        m3218r(number == null ? C8694q.f16515a : new C8700u(number), str);
    }

    /* renamed from: u */
    public final void m3215u(String str, String str2) {
        m3218r(str2 == null ? C8694q.f16515a : new C8700u(str2), str);
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: v */
    public final C8695r mo3208a() {
        boolean z;
        C8695r c8695r = new C8695r();
        C8668n c8668n = C8668n.this;
        C8668n.C8675e c8675e = c8668n.f16464e.f16476d;
        int i = c8668n.f16463d;
        while (true) {
            if (c8675e != c8668n.f16464e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (c8675e != c8668n.f16464e) {
                    if (c8668n.f16463d == i) {
                        C8668n.C8675e c8675e2 = c8675e.f16476d;
                        c8695r.m3218r(((AbstractC8692o) c8675e.getValue()).mo3208a(), (String) c8675e.getKey());
                        c8675e = c8675e2;
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                return c8695r;
            }
        }
    }

    /* renamed from: w */
    public final AbstractC8692o m3213w(String str) {
        return this.f16516a.get(str);
    }

    /* renamed from: y */
    public final C8690m m3212y(String str) {
        return (C8690m) this.f16516a.get(str);
    }

    /* renamed from: z */
    public final C8695r m3211z(String str) {
        return (C8695r) this.f16516a.get(str);
    }
}
