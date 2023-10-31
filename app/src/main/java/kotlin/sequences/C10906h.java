package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import kotlin.text.C10911c;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n2903#2:71\n*E\n"})
/* renamed from: kotlin.sequences.h */
/* loaded from: classes3.dex */
public final class C10906h implements Iterable<Object>, InterfaceC10847a {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10902d f21444a;

    public C10906h(C10911c c10911c) {
        this.f21444a = c10911c;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Object> iterator() {
        return this.f21444a.iterator();
    }
}
