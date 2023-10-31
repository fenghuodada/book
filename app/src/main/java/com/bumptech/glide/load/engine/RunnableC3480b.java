package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.C3502c;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes.dex */
public final class RunnableC3480b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3502c f9232a;

    public RunnableC3480b(C3502c c3502c) {
        this.f9232a = c3502c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3502c c3502c = this.f9232a;
        c3502c.getClass();
        while (true) {
            try {
                c3502c.m6679b((C3502c.C3503a) c3502c.f9276d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
