package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.exceptions.C10171d;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: io.reactivex.rxjava3.internal.disposables.a */
/* loaded from: classes3.dex */
public final class EnumC10175a implements InterfaceC10161b {

    /* renamed from: a */
    public static final EnumC10175a f20431a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10175a[] f20432b;

    static {
        EnumC10175a enumC10175a = new EnumC10175a();
        f20431a = enumC10175a;
        f20432b = new EnumC10175a[]{enumC10175a};
    }

    /* renamed from: a */
    public static void m1212a(AtomicReference atomicReference) {
        InterfaceC10161b interfaceC10161b;
        InterfaceC10161b interfaceC10161b2 = (InterfaceC10161b) atomicReference.get();
        EnumC10175a enumC10175a = f20431a;
        if (interfaceC10161b2 == enumC10175a || (interfaceC10161b = (InterfaceC10161b) atomicReference.getAndSet(enumC10175a)) == enumC10175a || interfaceC10161b == null) {
            return;
        }
        interfaceC10161b.mo49b();
    }

    /* renamed from: c */
    public static boolean m1211c(AtomicReference<InterfaceC10161b> atomicReference, InterfaceC10161b interfaceC10161b) {
        boolean z;
        Objects.requireNonNull(interfaceC10161b, "d is null");
        while (true) {
            if (atomicReference.compareAndSet(null, interfaceC10161b)) {
                z = true;
                break;
            } else if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        interfaceC10161b.mo49b();
        if (atomicReference.get() != f20431a) {
            C10234a.m1188a(new C10171d());
        }
        return false;
    }

    public static EnumC10175a valueOf(String str) {
        return (EnumC10175a) Enum.valueOf(EnumC10175a.class, str);
    }

    public static EnumC10175a[] values() {
        return (EnumC10175a[]) f20432b.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
    }
}
