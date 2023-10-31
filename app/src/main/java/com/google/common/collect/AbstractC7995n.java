package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.n */
/* loaded from: classes3.dex */
public abstract class AbstractC7995n {

    /* renamed from: a */
    public static final C7996a f15781a = new C7996a();

    /* renamed from: b */
    public static final C7997b f15782b = new C7997b(-1);

    /* renamed from: c */
    public static final C7997b f15783c = new C7997b(1);

    /* renamed from: com.google.common.collect.n$a */
    /* loaded from: classes3.dex */
    public static class C7996a extends AbstractC7995n {
        /* renamed from: f */
        public static AbstractC7995n m4257f(int i) {
            return i < 0 ? AbstractC7995n.f15782b : i > 0 ? AbstractC7995n.f15783c : AbstractC7995n.f15781a;
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: a */
        public final AbstractC7995n mo4256a(int i, int i2) {
            return m4257f(i < i2 ? -1 : i > i2 ? 1 : 0);
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: b */
        public final AbstractC7995n mo4255b(@NullableDecl Object obj, @NullableDecl Object obj2, AbstractC7994m0 abstractC7994m0) {
            return m4257f(abstractC7994m0.compare(obj, obj2));
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: c */
        public final AbstractC7995n mo4254c(boolean z, boolean z2) {
            return m4257f(z == z2 ? 0 : z ? 1 : -1);
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: d */
        public final AbstractC7995n mo4253d(boolean z, boolean z2) {
            return m4257f(z2 == z ? 0 : z2 ? 1 : -1);
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: e */
        public final int mo4252e() {
            return 0;
        }
    }

    /* renamed from: com.google.common.collect.n$b */
    /* loaded from: classes3.dex */
    public static final class C7997b extends AbstractC7995n {

        /* renamed from: d */
        public final int f15784d;

        public C7997b(int i) {
            this.f15784d = i;
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: a */
        public final AbstractC7995n mo4256a(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: b */
        public final AbstractC7995n mo4255b(@NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl AbstractC7994m0 abstractC7994m0) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: c */
        public final AbstractC7995n mo4254c(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: d */
        public final AbstractC7995n mo4253d(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC7995n
        /* renamed from: e */
        public final int mo4252e() {
            return this.f15784d;
        }
    }

    /* renamed from: a */
    public abstract AbstractC7995n mo4256a(int i, int i2);

    /* renamed from: b */
    public abstract AbstractC7995n mo4255b(@NullableDecl Object obj, @NullableDecl Object obj2, AbstractC7994m0 abstractC7994m0);

    /* renamed from: c */
    public abstract AbstractC7995n mo4254c(boolean z, boolean z2);

    /* renamed from: d */
    public abstract AbstractC7995n mo4253d(boolean z, boolean z2);

    /* renamed from: e */
    public abstract int mo4252e();
}
