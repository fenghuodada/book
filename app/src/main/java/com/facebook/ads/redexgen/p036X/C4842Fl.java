package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Fl */
/* loaded from: assets/audience_network.dex */
public final class C4842Fl {
    public static String[] A04 = {"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    public final int A00;
    @Nullable
    public final C4829FY A01;
    public final long A02;
    public final CopyOnWriteArrayList<C4841Fk> A03;

    public C4842Fl() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C4842Fl(CopyOnWriteArrayList<C4841Fk> copyOnWriteArrayList, int i, @Nullable C4829FY c4829fy, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c4829fy;
        this.A02 = j;
    }

    private long A00(long j) {
        long A01 = C4523AG.A01(j);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        A04[7] = "vQJR5ZN";
        return j2 + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final C4842Fl A02(int i, @Nullable C4829FY c4829fy, long j) {
        return new C4842Fl(this.A03, i, c4829fy, j);
    }

    public final void A03() {
        C4997IK.A04(this.A01 != null);
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC4832Fb(this, listenerAndHandler.A01));
        }
    }

    public final void A04() {
        C4997IK.A04(this.A01 != null);
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC4833Fc(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        C4997IK.A04(this.A01 != null);
        Iterator<C4841Fk> it = this.A03.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            A04[2] = "JAadAeVCHcunsRCfoQL";
            if (hasNext) {
                C4841Fk listenerAndHandler = it.next();
                A01(listenerAndHandler.A00, new RunnableC4838Fh(this, listenerAndHandler.A01));
            } else {
                return;
            }
        }
    }

    public final void A06(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
        A0C(new C4844Fn(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC4845Fo interfaceC4845Fo) {
        C4997IK.A03((handler == null || interfaceC4845Fo == null) ? false : true);
        this.A03.add(new C4841Fk(handler, interfaceC4845Fo));
    }

    public final void A08(C4843Fm c4843Fm, C4844Fn c4844Fn) {
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk next = it.next();
            A01(next.A00, new RunnableC4836Ff(this, next.A01, c4843Fm, c4844Fn));
        }
    }

    public final void A09(C4843Fm c4843Fm, C4844Fn c4844Fn) {
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk next = it.next();
            A01(next.A00, new RunnableC4835Fe(this, next.A01, c4843Fm, c4844Fn));
        }
    }

    public final void A0A(C4843Fm c4843Fm, C4844Fn c4844Fn) {
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk next = it.next();
            A01(next.A00, new RunnableC4834Fd(this, next.A01, c4843Fm, c4844Fn));
        }
    }

    public final void A0B(C4843Fm c4843Fm, C4844Fn c4844Fn, IOException iOException, boolean z) {
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC4837Fg(this, listenerAndHandler.A01, c4843Fm, c4844Fn, iOException, z));
        }
    }

    public final void A0C(C4844Fn c4844Fn) {
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk next = it.next();
            A01(next.A00, new RunnableC4840Fj(this, next.A01, c4844Fn));
        }
    }

    public final void A0D(InterfaceC4845Fo interfaceC4845Fo) {
        Iterator<C4841Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C4841Fk next = it.next();
            if (next.A01 == interfaceC4845Fo) {
                this.A03.remove(next);
            }
        }
    }

    public final void A0E(C4959Hi c4959Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
        A0A(new C4843Fm(c4959Hi, j3, 0L, 0L), new C4844Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C4959Hi c4959Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new C4843Fm(c4959Hi, j3, j4, j5), new C4844Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C4959Hi c4959Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new C4843Fm(c4959Hi, j3, j4, j5), new C4844Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C4959Hi c4959Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new C4843Fm(c4959Hi, j3, j4, j5), new C4844Fn(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
