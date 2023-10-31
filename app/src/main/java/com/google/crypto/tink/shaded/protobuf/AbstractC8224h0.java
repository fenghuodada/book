package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h0 */
/* loaded from: classes3.dex */
public abstract class AbstractC8224h0 {

    /* renamed from: a */
    public static final C8225a f15995a = new C8225a();

    /* renamed from: b */
    public static final C8226b f15996b = new C8226b();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h0$a */
    /* loaded from: classes3.dex */
    public static final class C8225a extends AbstractC8224h0 {

        /* renamed from: c */
        public static final Class<?> f15997c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static List m3826d(Object obj, int i, long j) {
            C8196a0.InterfaceC8199c mo3453d;
            C8218f0 c8218f0;
            List list = (List) C8271p1.m3598n(j, obj);
            if (list.isEmpty()) {
                if (list instanceof InterfaceC8221g0) {
                    list = new C8218f0(i);
                } else if ((list instanceof InterfaceC8200a1) && (list instanceof C8196a0.InterfaceC8199c)) {
                    mo3453d = ((C8196a0.InterfaceC8199c) list).mo3453d(i);
                    list = mo3453d;
                } else {
                    list = new ArrayList(i);
                }
                C8271p1.m3588x(obj, j, list);
            } else {
                if (f15997c.isAssignableFrom(list.getClass())) {
                    ArrayList arrayList = new ArrayList(list.size() + i);
                    arrayList.addAll(list);
                    c8218f0 = arrayList;
                } else if (list instanceof C8266o1) {
                    C8218f0 c8218f02 = new C8218f0(list.size() + i);
                    c8218f02.addAll((C8266o1) list);
                    c8218f0 = c8218f02;
                } else if ((list instanceof InterfaceC8200a1) && (list instanceof C8196a0.InterfaceC8199c)) {
                    C8196a0.InterfaceC8199c interfaceC8199c = (C8196a0.InterfaceC8199c) list;
                    if (!interfaceC8199c.mo3921h()) {
                        mo3453d = interfaceC8199c.mo3453d(list.size() + i);
                        list = mo3453d;
                        C8271p1.m3588x(obj, j, list);
                    }
                }
                list = c8218f0;
                C8271p1.m3588x(obj, j, list);
            }
            return list;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8224h0
        /* renamed from: a */
        public final void mo3825a(long j, Object obj) {
            Object unmodifiableList;
            List list = (List) C8271p1.m3598n(j, obj);
            if (list instanceof InterfaceC8221g0) {
                unmodifiableList = ((InterfaceC8221g0) list).mo3617f();
            } else {
                if (f15997c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC8200a1) && (list instanceof C8196a0.InterfaceC8199c)) {
                    C8196a0.InterfaceC8199c interfaceC8199c = (C8196a0.InterfaceC8199c) list;
                    if (interfaceC8199c.mo3921h()) {
                        interfaceC8199c.mo3922c();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C8271p1.m3588x(obj, j, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8224h0
        /* renamed from: b */
        public final void mo3824b(Object obj, long j, Object obj2) {
            List list = (List) C8271p1.m3598n(j, obj2);
            List m3826d = m3826d(obj, list.size(), j);
            int size = m3826d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                m3826d.addAll(list);
            }
            if (size > 0) {
                list = m3826d;
            }
            C8271p1.m3588x(obj, j, list);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8224h0
        /* renamed from: c */
        public final List mo3823c(long j, Object obj) {
            return m3826d(obj, 10, j);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h0$b */
    /* loaded from: classes3.dex */
    public static final class C8226b extends AbstractC8224h0 {
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8224h0
        /* renamed from: a */
        public final void mo3825a(long j, Object obj) {
            ((C8196a0.InterfaceC8199c) C8271p1.m3598n(j, obj)).mo3922c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8224h0
        /* renamed from: b */
        public final void mo3824b(Object obj, long j, Object obj2) {
            C8196a0.InterfaceC8199c interfaceC8199c = (C8196a0.InterfaceC8199c) C8271p1.m3598n(j, obj);
            C8196a0.InterfaceC8199c interfaceC8199c2 = (C8196a0.InterfaceC8199c) C8271p1.m3598n(j, obj2);
            int size = interfaceC8199c.size();
            int size2 = interfaceC8199c2.size();
            if (size > 0 && size2 > 0) {
                if (!interfaceC8199c.mo3921h()) {
                    interfaceC8199c = interfaceC8199c.mo3453d(size2 + size);
                }
                interfaceC8199c.addAll(interfaceC8199c2);
            }
            if (size > 0) {
                interfaceC8199c2 = interfaceC8199c;
            }
            C8271p1.m3588x(obj, j, interfaceC8199c2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8224h0
        /* renamed from: c */
        public final List mo3823c(long j, Object obj) {
            int i;
            C8196a0.InterfaceC8199c interfaceC8199c = (C8196a0.InterfaceC8199c) C8271p1.m3598n(j, obj);
            if (!interfaceC8199c.mo3921h()) {
                int size = interfaceC8199c.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                C8196a0.InterfaceC8199c mo3453d = interfaceC8199c.mo3453d(i);
                C8271p1.m3588x(obj, j, mo3453d);
                return mo3453d;
            }
            return interfaceC8199c;
        }
    }

    /* renamed from: a */
    public abstract void mo3825a(long j, Object obj);

    /* renamed from: b */
    public abstract void mo3824b(Object obj, long j, Object obj2);

    /* renamed from: c */
    public abstract List mo3823c(long j, Object obj);
}
