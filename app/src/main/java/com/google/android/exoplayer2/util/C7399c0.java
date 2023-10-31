package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.InterfaceC7412i;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.util.c0 */
/* loaded from: classes.dex */
public final class C7399c0 implements InterfaceC7412i {
    @GuardedBy("messagePool")

    /* renamed from: b */
    public static final ArrayList f13888b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f13889a;

    /* renamed from: com.google.android.exoplayer2.util.c0$a */
    /* loaded from: classes.dex */
    public static final class C7400a implements InterfaceC7412i.InterfaceC7413a {
        @Nullable

        /* renamed from: a */
        public Message f13890a;

        /* renamed from: a */
        public final void m5122a() {
            Message message = this.f13890a;
            message.getClass();
            message.sendToTarget();
            this.f13890a = null;
            ArrayList arrayList = C7399c0.f13888b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public C7399c0(Handler handler) {
        this.f13889a = handler;
    }

    /* renamed from: k */
    public static C7400a m5123k() {
        C7400a c7400a;
        ArrayList arrayList = f13888b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                c7400a = new C7400a();
            } else {
                c7400a = (C7400a) arrayList.remove(arrayList.size() - 1);
            }
        }
        return c7400a;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: a */
    public final boolean mo5072a() {
        return this.f13889a.hasMessages(0);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: b */
    public final C7400a mo5071b(int i, int i2, int i3) {
        C7400a m5123k = m5123k();
        m5123k.f13890a = this.f13889a.obtainMessage(i, i2, i3);
        return m5123k;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: c */
    public final void mo5070c() {
        this.f13889a.removeMessages(2);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: d */
    public final boolean mo5069d(Runnable runnable) {
        return this.f13889a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: e */
    public final C7400a mo5068e(int i) {
        C7400a m5123k = m5123k();
        m5123k.f13890a = this.f13889a.obtainMessage(i);
        return m5123k;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: f */
    public final void mo5067f() {
        this.f13889a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: g */
    public final boolean mo5066g(long j) {
        return this.f13889a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: h */
    public final boolean mo5065h(InterfaceC7412i.InterfaceC7413a interfaceC7413a) {
        C7400a c7400a = (C7400a) interfaceC7413a;
        Message message = c7400a.f13890a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = this.f13889a.sendMessageAtFrontOfQueue(message);
        c7400a.f13890a = null;
        ArrayList arrayList = f13888b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(c7400a);
            }
        }
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: i */
    public final boolean mo5064i(int i) {
        return this.f13889a.sendEmptyMessage(i);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC7412i
    /* renamed from: j */
    public final C7400a mo5063j(int i, @Nullable Object obj) {
        C7400a m5123k = m5123k();
        m5123k.f13890a = this.f13889a.obtainMessage(i, obj);
        return m5123k;
    }
}
