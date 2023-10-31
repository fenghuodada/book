package androidx.fragment.app;

import android.view.View;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.C10757m;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m508d2 = {"<anonymous>", "", "entry", "", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, m507k = 3, m506mv = {1, 8, 0}, m504xi = 48)
/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController$retainMatchingViews$1 extends AbstractC10844k implements InterfaceC10820l<Map.Entry<String, View>, Boolean> {
    final /* synthetic */ Collection<String> $names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController$retainMatchingViews$1(Collection<String> collection) {
        super(1);
        this.$names = collection;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    @NotNull
    public final Boolean invoke(@NotNull Map.Entry<String, View> entry) {
        C10843j.m430f(entry, "entry");
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        return Boolean.valueOf(C10757m.m480i(this.$names, ViewCompat.C0819i.m11711k(entry.getValue())));
    }
}
