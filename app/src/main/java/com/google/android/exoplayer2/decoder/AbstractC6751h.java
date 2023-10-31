package com.google.android.exoplayer2.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6558q;
import com.google.android.exoplayer2.decoder.AbstractC6749g;
import com.google.android.exoplayer2.decoder.C6748f;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.AbstractC7207a;
import com.google.android.exoplayer2.text.C7208b;
import com.google.android.exoplayer2.text.C7234e;
import com.google.android.exoplayer2.text.C7237g;
import com.google.android.exoplayer2.util.C7394a;
import java.util.ArrayDeque;

/* renamed from: com.google.android.exoplayer2.decoder.h */
/* loaded from: classes.dex */
public abstract class AbstractC6751h<I extends DecoderInputBuffer, O extends AbstractC6749g, E extends C6748f> implements InterfaceC6746d<I, O, E> {

    /* renamed from: a */
    public final C6752a f10930a;

    /* renamed from: b */
    public final Object f10931b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f10932c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f10933d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f10934e;

    /* renamed from: f */
    public final O[] f10935f;

    /* renamed from: g */
    public int f10936g;

    /* renamed from: h */
    public int f10937h;

    /* renamed from: i */
    public I f10938i;

    /* renamed from: j */
    public C7234e f10939j;

    /* renamed from: k */
    public boolean f10940k;

    /* renamed from: l */
    public boolean f10941l;

    /* renamed from: com.google.android.exoplayer2.decoder.h$a */
    /* loaded from: classes.dex */
    public class C6752a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ AbstractC6751h f10942a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6752a(AbstractC7207a abstractC7207a) {
            super("ExoPlayer:SimpleDecoder");
            this.f10942a = abstractC7207a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AbstractC6751h abstractC6751h = this.f10942a;
            abstractC6751h.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (abstractC6751h.m6014g());
        }
    }

    public AbstractC6751h(I[] iArr, O[] oArr) {
        this.f10934e = iArr;
        this.f10936g = iArr.length;
        for (int i = 0; i < this.f10936g; i++) {
            this.f10934e[i] = new C7237g();
        }
        this.f10935f = oArr;
        this.f10937h = oArr.length;
        for (int i2 = 0; i2 < this.f10937h; i2++) {
            this.f10935f[i2] = new C7208b(new C6558q((AbstractC7207a) this));
        }
        C6752a c6752a = new C6752a((AbstractC7207a) this);
        this.f10930a = c6752a;
        c6752a.start();
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    @Nullable
    /* renamed from: b */
    public final Object mo5352b() throws C6748f {
        synchronized (this.f10931b) {
            try {
                C7234e c7234e = this.f10939j;
                if (c7234e == null) {
                    if (this.f10933d.isEmpty()) {
                        return null;
                    }
                    return this.f10933d.removeFirst();
                }
                throw c7234e;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    @Nullable
    /* renamed from: c */
    public final Object mo5351c() throws C6748f {
        boolean z;
        I i;
        synchronized (this.f10931b) {
            try {
                C7234e c7234e = this.f10939j;
                if (c7234e == null) {
                    if (this.f10938i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C7394a.m5131d(z);
                    int i2 = this.f10936g;
                    if (i2 == 0) {
                        i = null;
                    } else {
                        I[] iArr = this.f10934e;
                        int i3 = i2 - 1;
                        this.f10936g = i3;
                        i = iArr[i3];
                    }
                    this.f10938i = i;
                } else {
                    throw c7234e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    /* renamed from: d */
    public final void mo5350d(C7237g c7237g) throws C6748f {
        boolean z;
        synchronized (this.f10931b) {
            try {
                C7234e c7234e = this.f10939j;
                if (c7234e == null) {
                    boolean z2 = true;
                    if (c7237g == this.f10938i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C7394a.m5134a(z);
                    this.f10932c.addLast(c7237g);
                    if (this.f10932c.isEmpty() || this.f10937h <= 0) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f10931b.notify();
                    }
                    this.f10938i = null;
                } else {
                    throw c7234e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public abstract C7234e mo5371e(Throwable th);

    @Nullable
    /* renamed from: f */
    public abstract C7234e mo5370f(DecoderInputBuffer decoderInputBuffer, AbstractC6749g abstractC6749g, boolean z);

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    public final void flush() {
        synchronized (this.f10931b) {
            this.f10940k = true;
            I i = this.f10938i;
            if (i != null) {
                i.mo5603h();
                int i2 = this.f10936g;
                this.f10936g = i2 + 1;
                this.f10934e[i2] = i;
                this.f10938i = null;
            }
            while (!this.f10932c.isEmpty()) {
                I removeFirst = this.f10932c.removeFirst();
                removeFirst.mo5603h();
                int i3 = this.f10936g;
                this.f10936g = i3 + 1;
                this.f10934e[i3] = removeFirst;
            }
            while (!this.f10933d.isEmpty()) {
                this.f10933d.removeFirst().mo5345h();
            }
        }
    }

    /* renamed from: g */
    public final boolean m6014g() throws InterruptedException {
        C7234e mo5371e;
        boolean z;
        synchronized (this.f10931b) {
            while (!this.f10941l) {
                try {
                    if (!this.f10932c.isEmpty() && this.f10937h > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    this.f10931b.wait();
                } finally {
                }
            }
            if (this.f10941l) {
                return false;
            }
            I removeFirst = this.f10932c.removeFirst();
            O[] oArr = this.f10935f;
            int i = this.f10937h - 1;
            this.f10937h = i;
            O o = oArr[i];
            boolean z2 = this.f10940k;
            this.f10940k = false;
            if (removeFirst.m6018f(4)) {
                o.f10915a = 4 | o.f10915a;
            } else {
                if (removeFirst.m6017g()) {
                    o.f10915a |= Integer.MIN_VALUE;
                }
                try {
                    mo5371e = mo5370f(removeFirst, o, z2);
                } catch (OutOfMemoryError | RuntimeException e) {
                    mo5371e = mo5371e(e);
                }
                if (mo5371e != null) {
                    synchronized (this.f10931b) {
                        this.f10939j = mo5371e;
                    }
                    return false;
                }
            }
            synchronized (this.f10931b) {
                if (!this.f10940k && !o.m6017g()) {
                    this.f10933d.addLast(o);
                    removeFirst.mo5603h();
                    int i2 = this.f10936g;
                    this.f10936g = i2 + 1;
                    this.f10934e[i2] = removeFirst;
                }
                o.mo5345h();
                removeFirst.mo5603h();
                int i22 = this.f10936g;
                this.f10936g = i22 + 1;
                this.f10934e[i22] = removeFirst;
            }
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.InterfaceC6746d
    @CallSuper
    public final void release() {
        synchronized (this.f10931b) {
            this.f10941l = true;
            this.f10931b.notify();
        }
        try {
            this.f10930a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
