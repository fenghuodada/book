package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.disposables.InterfaceC10162c;
import io.reactivex.rxjava3.exceptions.C10164a;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.internal.schedulers.RunnableC10221j;
import io.reactivex.rxjava3.internal.util.C10231a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

/* renamed from: io.reactivex.rxjava3.internal.disposables.c */
/* loaded from: classes3.dex */
public final class C10177c implements InterfaceC10161b, InterfaceC10162c {

    /* renamed from: a */
    public LinkedList f20435a;

    /* renamed from: b */
    public volatile boolean f20436b;

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10162c
    /* renamed from: a */
    public final boolean mo1210a(InterfaceC10161b interfaceC10161b) {
        if (mo1208e(interfaceC10161b)) {
            ((RunnableC10221j) interfaceC10161b).mo49b();
            return true;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        if (this.f20436b) {
            return;
        }
        synchronized (this) {
            if (this.f20436b) {
                return;
            }
            this.f20436b = true;
            LinkedList<InterfaceC10161b> linkedList = this.f20435a;
            ArrayList arrayList = null;
            this.f20435a = null;
            if (linkedList != null) {
                for (InterfaceC10161b interfaceC10161b : linkedList) {
                    try {
                        interfaceC10161b.mo49b();
                    } catch (Throwable th) {
                        C10169b.m1213a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() == 1) {
                        throw C10231a.m1191a((Throwable) arrayList.get(0));
                    }
                    throw new C10164a(arrayList);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10162c
    /* renamed from: c */
    public final boolean mo1209c(InterfaceC10161b interfaceC10161b) {
        if (!this.f20436b) {
            synchronized (this) {
                if (!this.f20436b) {
                    LinkedList linkedList = this.f20435a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f20435a = linkedList;
                    }
                    linkedList.add(interfaceC10161b);
                    return true;
                }
            }
        }
        interfaceC10161b.mo49b();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10162c
    /* renamed from: e */
    public final boolean mo1208e(InterfaceC10161b interfaceC10161b) {
        Objects.requireNonNull(interfaceC10161b, "Disposable item is null");
        if (this.f20436b) {
            return false;
        }
        synchronized (this) {
            if (this.f20436b) {
                return false;
            }
            LinkedList linkedList = this.f20435a;
            if (linkedList != null && linkedList.remove(interfaceC10161b)) {
                return true;
            }
            return false;
        }
    }
}
