package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.source.InterfaceC7196v;
import com.google.android.exoplayer2.upstream.InterfaceC7351c0;
import com.google.android.exoplayer2.util.C7394a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.source.a */
/* loaded from: classes.dex */
public abstract class AbstractC7138a implements InterfaceC7188p {

    /* renamed from: a */
    public final ArrayList<InterfaceC7188p.InterfaceC7190b> f12698a = new ArrayList<>(1);

    /* renamed from: b */
    public final HashSet<InterfaceC7188p.InterfaceC7190b> f12699b = new HashSet<>(1);

    /* renamed from: c */
    public final InterfaceC7196v.C7197a f12700c = new InterfaceC7196v.C7197a();

    /* renamed from: d */
    public final InterfaceC6789n.C6790a f12701d = new InterfaceC6789n.C6790a();
    @Nullable

    /* renamed from: e */
    public Looper f12702e;
    @Nullable

    /* renamed from: f */
    public AbstractC6984j1 f12703f;

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: a */
    public final void mo5393a(InterfaceC7188p.InterfaceC7190b interfaceC7190b) {
        ArrayList<InterfaceC7188p.InterfaceC7190b> arrayList = this.f12698a;
        arrayList.remove(interfaceC7190b);
        if (!arrayList.isEmpty()) {
            mo5390d(interfaceC7190b);
            return;
        }
        this.f12702e = null;
        this.f12703f = null;
        this.f12699b.clear();
        mo5417r();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: b */
    public final void mo5392b(Handler handler, InterfaceC7196v interfaceC7196v) {
        InterfaceC7196v.C7197a c7197a = this.f12700c;
        c7197a.getClass();
        c7197a.f12958c.add(new InterfaceC7196v.C7197a.C7198a(handler, interfaceC7196v));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: c */
    public final void mo5391c(InterfaceC7196v interfaceC7196v) {
        CopyOnWriteArrayList<InterfaceC7196v.C7197a.C7198a> copyOnWriteArrayList = this.f12700c.f12958c;
        Iterator<InterfaceC7196v.C7197a.C7198a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC7196v.C7197a.C7198a next = it.next();
            if (next.f12961b == interfaceC7196v) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: d */
    public final void mo5390d(InterfaceC7188p.InterfaceC7190b interfaceC7190b) {
        HashSet<InterfaceC7188p.InterfaceC7190b> hashSet = this.f12699b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(interfaceC7190b);
        if (z && hashSet.isEmpty()) {
            mo5460o();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: f */
    public final void mo5388f(Handler handler, InterfaceC6789n interfaceC6789n) {
        InterfaceC6789n.C6790a c6790a = this.f12701d;
        c6790a.getClass();
        c6790a.f11043c.add(new InterfaceC6789n.C6790a.C6791a(handler, interfaceC6789n));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: g */
    public final void mo5387g(InterfaceC6789n interfaceC6789n) {
        CopyOnWriteArrayList<InterfaceC6789n.C6790a.C6791a> copyOnWriteArrayList = this.f12701d.f11043c;
        Iterator<InterfaceC6789n.C6790a.C6791a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC6789n.C6790a.C6791a next = it.next();
            if (next.f11045b == interfaceC6789n) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: i */
    public final /* synthetic */ void mo5385i() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: k */
    public final /* synthetic */ void mo5383k() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: l */
    public final void mo5382l(InterfaceC7188p.InterfaceC7190b interfaceC7190b, @Nullable InterfaceC7351c0 interfaceC7351c0) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f12702e;
        C7394a.m5134a(looper == null || looper == myLooper);
        AbstractC6984j1 abstractC6984j1 = this.f12703f;
        this.f12698a.add(interfaceC7190b);
        if (this.f12702e == null) {
            this.f12702e = myLooper;
            this.f12699b.add(interfaceC7190b);
            mo5418q(interfaceC7351c0);
        } else if (abstractC6984j1 != null) {
            mo5381m(interfaceC7190b);
            interfaceC7190b.mo4891a(abstractC6984j1);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7188p
    /* renamed from: m */
    public final void mo5381m(InterfaceC7188p.InterfaceC7190b interfaceC7190b) {
        this.f12702e.getClass();
        HashSet<InterfaceC7188p.InterfaceC7190b> hashSet = this.f12699b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC7190b);
        if (isEmpty) {
            mo5459p();
        }
    }

    /* renamed from: o */
    public void mo5460o() {
    }

    /* renamed from: p */
    public void mo5459p() {
    }

    /* renamed from: q */
    public abstract void mo5418q(@Nullable InterfaceC7351c0 interfaceC7351c0);

    /* renamed from: r */
    public abstract void mo5417r();
}
