package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.InterfaceC10902d;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,680:1\n3524#2:681\n*E\n"})
/* renamed from: kotlin.collections.l */
/* loaded from: classes3.dex */
public final class C10756l implements InterfaceC10902d<Object> {

    /* renamed from: a */
    public final /* synthetic */ Iterable f21361a;

    public C10756l(Iterable iterable) {
        this.f21361a = iterable;
    }

    @Override // kotlin.sequences.InterfaceC10902d
    @NotNull
    public final Iterator<Object> iterator() {
        return this.f21361a.iterator();
    }
}
