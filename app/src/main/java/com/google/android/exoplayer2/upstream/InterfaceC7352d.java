package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.C6642d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.upstream.d */
/* loaded from: classes.dex */
public interface InterfaceC7352d {

    /* renamed from: com.google.android.exoplayer2.upstream.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7353a {

        /* renamed from: com.google.android.exoplayer2.upstream.d$a$a */
        /* loaded from: classes.dex */
        public static final class C7354a {

            /* renamed from: a */
            public final CopyOnWriteArrayList<C7355a> f13743a = new CopyOnWriteArrayList<>();

            /* renamed from: com.google.android.exoplayer2.upstream.d$a$a$a */
            /* loaded from: classes.dex */
            public static final class C7355a {

                /* renamed from: a */
                public final Handler f13744a;

                /* renamed from: b */
                public final InterfaceC7353a f13745b;

                /* renamed from: c */
                public boolean f13746c;

                public C7355a(Handler handler, InterfaceC7353a interfaceC7353a) {
                    this.f13744a = handler;
                    this.f13745b = interfaceC7353a;
                }
            }

            /* renamed from: a */
            public final void m5176a(InterfaceC7353a interfaceC7353a) {
                CopyOnWriteArrayList<C7355a> copyOnWriteArrayList = this.f13743a;
                Iterator<C7355a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C7355a next = it.next();
                    if (next.f13745b == interfaceC7353a) {
                        next.f13746c = true;
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }
    }

    @Nullable
    /* renamed from: d */
    C7369n mo5165d();

    /* renamed from: e */
    void mo5164e(C6642d0 c6642d0);

    /* renamed from: g */
    void mo5162g(Handler handler, InterfaceC7353a interfaceC7353a);
}
