package androidx.transition;

import android.view.View;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.C0510h;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.transition.o */
/* loaded from: classes.dex */
public final class C1766o {

    /* renamed from: b */
    public final View f4279b;

    /* renamed from: a */
    public final HashMap f4278a = new HashMap();

    /* renamed from: c */
    public final ArrayList<Transition> f4280c = new ArrayList<>();

    @Deprecated
    public C1766o() {
    }

    public C1766o(@NonNull View view) {
        this.f4279b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1766o) {
            C1766o c1766o = (C1766o) obj;
            return this.f4279b == c1766o.f4279b && this.f4278a.equals(c1766o.f4278a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4278a.hashCode() + (this.f4279b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        StringBuilder m12339b = C0510h.m12339b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        m12339b.append(this.f4279b);
        m12339b.append("\n");
        String m13053a = C0063d.m13053a(m12339b.toString(), "    values:");
        for (String str : this.f4278a.keySet()) {
            m13053a = m13053a + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return m13053a;
    }
}
