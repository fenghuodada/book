package androidx.work;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.C1901g;
import androidx.work.impl.C1915l;
import androidx.work.impl.utils.RunnableC1964e;
import androidx.work.impl.utils.taskexecutor.C1999b;
import java.util.Collections;
import java.util.List;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: androidx.work.t */
/* loaded from: classes.dex */
public abstract class AbstractC2019t {
    @NonNull
    /* renamed from: a */
    public final void m9726a(@NonNull C2008n c2008n) {
        List singletonList = Collections.singletonList(c2008n);
        C1915l c1915l = (C1915l) this;
        if (!singletonList.isEmpty()) {
            C1901g c1901g = new C1901g(c1915l, singletonList);
            if (!c1901g.f4639h) {
                ((C1999b) c1915l.f4658d).m9738a(new RunnableC1964e(c1901g));
                return;
            }
            AbstractC2005l.m9733c().mo9728f(C1901g.f4631i, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", c1901g.f4636e)), new Throwable[0]);
            return;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
}
