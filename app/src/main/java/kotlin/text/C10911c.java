package kotlin.text;

import androidx.core.p003os.C0740h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C10806j;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import kotlin.ranges.C10878c;
import kotlin.sequences.InterfaceC10902d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: kotlin.text.c */
/* loaded from: classes3.dex */
public final class C10911c implements InterfaceC10902d<C10878c> {
    @NotNull

    /* renamed from: a */
    public final CharSequence f21453a;

    /* renamed from: b */
    public final int f21454b;

    /* renamed from: c */
    public final int f21455c;
    @NotNull

    /* renamed from: d */
    public final InterfaceC10824p<CharSequence, Integer, C10806j<Integer, Integer>> f21456d;

    /* renamed from: kotlin.text.c$a */
    /* loaded from: classes3.dex */
    public static final class C10912a implements Iterator<C10878c>, InterfaceC10847a, p060j$.util.Iterator {

        /* renamed from: a */
        public int f21457a = -1;

        /* renamed from: b */
        public int f21458b;

        /* renamed from: c */
        public int f21459c;
        @Nullable

        /* renamed from: d */
        public C10878c f21460d;

        /* renamed from: e */
        public int f21461e;

        public C10912a() {
            int i = C10911c.this.f21454b;
            int length = C10911c.this.f21453a.length();
            if (length >= 0) {
                if (i < 0) {
                    i = 0;
                } else if (i > length) {
                    i = length;
                }
                this.f21458b = i;
                this.f21459c = i;
                return;
            }
            throw new IllegalArgumentException(C0740h.m11849a("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r6 < r3) goto L14;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m404a() {
            /*
                r7 = this;
                int r0 = r7.f21459c
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.f21457a = r1
                r0 = 0
                r7.f21460d = r0
                goto L77
            Lb:
                kotlin.text.c r2 = kotlin.text.C10911c.this
                int r3 = r2.f21455c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1a
                int r6 = r7.f21461e
                int r6 = r6 + r5
                r7.f21461e = r6
                if (r6 >= r3) goto L22
            L1a:
                java.lang.CharSequence r3 = r2.f21453a
                int r3 = r3.length()
                if (r0 <= r3) goto L34
            L22:
                kotlin.ranges.c r0 = new kotlin.ranges.c
                int r1 = r7.f21458b
                java.lang.CharSequence r2 = r2.f21453a
                int r2 = kotlin.text.C10929r.m377o(r2)
                r0.<init>(r1, r2)
            L2f:
                r7.f21460d = r0
                r7.f21459c = r4
                goto L75
            L34:
                kotlin.jvm.functions.p<java.lang.CharSequence, java.lang.Integer, kotlin.j<java.lang.Integer, java.lang.Integer>> r0 = r2.f21456d
                java.lang.CharSequence r3 = r2.f21453a
                int r6 = r7.f21459c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.invoke(r3, r6)
                kotlin.j r0 = (kotlin.C10806j) r0
                if (r0 != 0) goto L54
                kotlin.ranges.c r0 = new kotlin.ranges.c
                int r1 = r7.f21458b
                java.lang.CharSequence r2 = r2.f21453a
                int r2 = kotlin.text.C10929r.m377o(r2)
                r0.<init>(r1, r2)
                goto L2f
            L54:
                A r2 = r0.f21397a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f21398b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f21458b
                kotlin.ranges.c r3 = kotlin.ranges.C10882g.m411c(r3, r2)
                r7.f21460d = r3
                int r2 = r2 + r0
                r7.f21458b = r2
                if (r0 != 0) goto L72
                r1 = r5
            L72:
                int r2 = r2 + r1
                r7.f21459c = r2
            L75:
                r7.f21457a = r5
            L77:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C10911c.C10912a.m404a():void");
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C10878c> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            if (this.f21457a == -1) {
                m404a();
            }
            return this.f21457a == 1;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            if (this.f21457a == -1) {
                m404a();
            }
            if (this.f21457a != 0) {
                C10878c c10878c = this.f21460d;
                C10843j.m432d(c10878c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f21460d = null;
                this.f21457a = -1;
                return c10878c;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10911c(@NotNull CharSequence input, int i, int i2, @NotNull InterfaceC10824p<? super CharSequence, ? super Integer, C10806j<Integer, Integer>> interfaceC10824p) {
        C10843j.m430f(input, "input");
        this.f21453a = input;
        this.f21454b = i;
        this.f21455c = i2;
        this.f21456d = interfaceC10824p;
    }

    @Override // kotlin.sequences.InterfaceC10902d
    @NotNull
    public final java.util.Iterator<C10878c> iterator() {
        return new C10912a();
    }
}
