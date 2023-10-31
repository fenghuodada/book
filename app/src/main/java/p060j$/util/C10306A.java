package p060j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.A */
/* loaded from: classes2.dex */
public final class C10306A extends C10336c0 {

    /* renamed from: f */
    final /* synthetic */ SortedSet f20708f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10306A(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f20708f = sortedSet;
    }

    @Override // p060j$.util.C10336c0, p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        return this.f20708f.comparator();
    }
}
