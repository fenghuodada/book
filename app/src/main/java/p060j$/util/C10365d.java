package p060j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p060j$.util.function.Function;

/* renamed from: j$.util.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10365d implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f20836a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f20837b;

    /* renamed from: c */
    public final /* synthetic */ Object f20838c;

    public /* synthetic */ C10365d(Comparator comparator, Object obj, int i) {
        this.f20836a = i;
        this.f20837b = comparator;
        this.f20838c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f20836a;
        Comparator comparator = this.f20837b;
        Object obj3 = this.f20838c;
        switch (i) {
            case 0:
                Comparator comparator2 = (Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
