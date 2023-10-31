package com.vungle.warren;

import androidx.annotation.NonNull;
import com.vungle.warren.AdLoader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.vungle.warren.d0 */
/* loaded from: classes3.dex */
public final class C9763d0 {

    /* renamed from: a */
    public final PriorityQueue<C9765b> f19437a = new PriorityQueue<>(11, new C9764a());

    /* renamed from: com.vungle.warren.d0$a */
    /* loaded from: classes3.dex */
    public class C9764a implements Comparator<C9765b> {
        @Override // java.util.Comparator
        public final int compare(C9765b c9765b, C9765b c9765b2) {
            C9765b c9765b3 = c9765b;
            C9765b c9765b4 = c9765b2;
            int compareTo = Integer.valueOf(c9765b3.f19440b.f19304k).compareTo(Integer.valueOf(c9765b4.f19440b.f19304k));
            if (compareTo == 0) {
                return Integer.valueOf(c9765b3.f19439a).compareTo(Integer.valueOf(c9765b4.f19439a));
            }
            return compareTo;
        }
    }

    /* renamed from: com.vungle.warren.d0$b */
    /* loaded from: classes3.dex */
    public static class C9765b {

        /* renamed from: c */
        public static final AtomicInteger f19438c = new AtomicInteger();

        /* renamed from: a */
        public final int f19439a = f19438c.incrementAndGet();
        @NonNull

        /* renamed from: b */
        public final AdLoader.C9718f f19440b;

        public C9765b(@NonNull AdLoader.C9718f c9718f) {
            this.f19440b = c9718f;
        }
    }
}
