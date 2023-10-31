package com.iab.omid.library.applovin.walking.p050a;

import com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.applovin.walking.a.c */
/* loaded from: classes3.dex */
public class C8811c implements AbstractAsyncTaskC8808b.InterfaceC8809a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f16777a;

    /* renamed from: b */
    private final ThreadPoolExecutor f16778b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC8808b> f16779c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC8808b f16780d = null;

    public C8811c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f16777a = linkedBlockingQueue;
        this.f16778b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m2958a() {
        AbstractAsyncTaskC8808b poll = this.f16779c.poll();
        this.f16780d = poll;
        if (poll != null) {
            poll.m2959a(this.f16778b);
        }
    }

    @Override // com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b.InterfaceC8809a
    /* renamed from: a */
    public void mo2957a(AbstractAsyncTaskC8808b abstractAsyncTaskC8808b) {
        this.f16780d = null;
        m2958a();
    }

    /* renamed from: b */
    public void m2956b(AbstractAsyncTaskC8808b abstractAsyncTaskC8808b) {
        abstractAsyncTaskC8808b.m2960a(this);
        this.f16779c.add(abstractAsyncTaskC8808b);
        if (this.f16780d == null) {
            m2958a();
        }
    }
}
