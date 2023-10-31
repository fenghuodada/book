package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@GwtCompatible
/* renamed from: com.google.common.base.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7928a<T> implements Iterator<T>, p060j$.util.Iterator {

    /* renamed from: a */
    public int f15686a = 2;
    @NullableDecl

    /* renamed from: b */
    public String f15687b;

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
        r8 = r0.f15702d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r1 >= r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r8.mo4291b(r7.charAt(r1)) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r4 <= r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        r9 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r8.mo4291b(r7.charAt(r9)) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r0.f15703e == false) goto L59;
     */
    @Override // java.util.Iterator, p060j$.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext() {
        /*
            r11 = this;
            int r0 = r11.f15686a
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L9
            r4 = r3
            goto La
        L9:
            r4 = r2
        La:
            if (r4 == 0) goto Lab
            int r0 = androidx.constraintlayout.core.C0511i.m12337b(r0)
            if (r0 == 0) goto Laa
            r4 = 2
            if (r0 == r4) goto La9
            r11.f15686a = r1
            r0 = r11
            com.google.common.base.k$a r0 = (com.google.common.base.C7942k.AbstractC7943a) r0
        L1a:
            int r1 = r0.f15704f
        L1c:
            int r4 = r0.f15704f
            r5 = -1
            r6 = 3
            if (r4 == r5) goto L9d
            r7 = r0
            com.google.common.base.i r7 = (com.google.common.base.C7940i) r7
            com.google.common.base.j r8 = r7.f15696h
            com.google.common.base.c r8 = r8.f15697a
            java.lang.CharSequence r7 = r7.f15701c
            int r4 = r8.mo4292a(r4, r7)
            java.lang.CharSequence r7 = r0.f15701c
            if (r4 != r5) goto L3a
            int r4 = r7.length()
            r0.f15704f = r5
            goto L3e
        L3a:
            int r8 = r4 + 1
            r0.f15704f = r8
        L3e:
            int r8 = r0.f15704f
            if (r8 != r1) goto L4f
            int r8 = r8 + 1
            r0.f15704f = r8
            int r4 = r7.length()
            if (r8 <= r4) goto L1c
            r0.f15704f = r5
            goto L1c
        L4f:
            com.google.common.base.c r8 = r0.f15702d
            if (r1 >= r4) goto L60
            char r9 = r7.charAt(r1)
            boolean r9 = r8.mo4291b(r9)
            if (r9 == 0) goto L60
            int r1 = r1 + 1
            goto L4f
        L60:
            if (r4 <= r1) goto L70
            int r9 = r4 + (-1)
            char r10 = r7.charAt(r9)
            boolean r10 = r8.mo4291b(r10)
            if (r10 == 0) goto L70
            r4 = r9
            goto L60
        L70:
            boolean r9 = r0.f15703e
            if (r9 == 0) goto L77
            if (r1 != r4) goto L77
            goto L1a
        L77:
            int r9 = r0.f15705g
            if (r9 != r3) goto L91
            int r4 = r7.length()
            r0.f15704f = r5
        L81:
            if (r4 <= r1) goto L94
            int r0 = r4 + (-1)
            char r5 = r7.charAt(r0)
            boolean r5 = r8.mo4291b(r5)
            if (r5 == 0) goto L94
            r4 = r0
            goto L81
        L91:
            int r9 = r9 - r3
            r0.f15705g = r9
        L94:
            java.lang.CharSequence r0 = r7.subSequence(r1, r4)
            java.lang.String r0 = r0.toString()
            goto La0
        L9d:
            r0.f15686a = r6
            r0 = 0
        La0:
            r11.f15687b = r0
            int r0 = r11.f15686a
            if (r0 == r6) goto La9
            r11.f15686a = r3
            r2 = r3
        La9:
            return r2
        Laa:
            return r3
        Lab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractC7928a.hasNext():boolean");
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f15686a = 2;
            T t = (T) this.f15687b;
            this.f15687b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
