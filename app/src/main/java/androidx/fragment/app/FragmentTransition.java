package androidx.fragment.app;

import android.view.View;
import androidx.collection.C0470b;
import androidx.transition.C1744e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10757m;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J,\u0010\u000b\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004H\u0007J<\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u001e\u0010\u0018\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010\u0019\u001a\u00020\u000fH\u0007R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, m508d2 = {"Landroidx/fragment/app/FragmentTransition;", "", "Landroidx/fragment/app/FragmentTransitionImpl;", "resolveSupportImpl", "Landroidx/collection/b;", "", "value", "findKeyForValue", "Landroid/view/View;", "namedViews", "Lkotlin/p;", "retainValues", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "callSharedElementStartEnd", "", "views", "", "visibility", "setViewVisibility", "supportsTransition", "PLATFORM_IMPL", "Landroidx/fragment/app/FragmentTransitionImpl;", "SUPPORT_IMPL", "<init>", "()V", "fragment_release"}, m507k = 1, m506mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n515#2:123\n500#2,6:124\n125#3:130\n152#3,3:131\n125#3:134\n152#3,3:135\n125#3:138\n152#3,3:139\n1855#4,2:142\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:123\n50#1:124,6\n53#1:130\n53#1:131,3\n98#1:134\n98#1:135,3\n99#1:138\n99#1:139,3\n113#1:142,2\n*E\n"})
/* loaded from: classes.dex */
public final class FragmentTransition {
    @NotNull
    public static final FragmentTransition INSTANCE;
    @JvmField
    @Nullable
    public static final FragmentTransitionImpl PLATFORM_IMPL;
    @JvmField
    @Nullable
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
    }

    @JvmStatic
    public static final void callSharedElementStartEnd(@NotNull Fragment inFragment, @NotNull Fragment outFragment, boolean z, @NotNull C0470b<String, View> sharedElements, boolean z2) {
        C10843j.m430f(inFragment, "inFragment");
        C10843j.m430f(outFragment, "outFragment");
        C10843j.m430f(sharedElements, "sharedElements");
        if ((z ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            for (Map.Entry<String, View> entry : sharedElements.entrySet()) {
                arrayList.add(entry.getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            for (Map.Entry<String, View> entry2 : sharedElements.entrySet()) {
                arrayList2.add(entry2.getKey());
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final String findKeyForValue(@NotNull C0470b<String, String> c0470b, @NotNull String value) {
        C10843j.m430f(c0470b, "<this>");
        C10843j.m430f(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c0470b.entrySet()) {
            if (C10843j.m435a(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add((String) entry2.getKey());
        }
        return (String) C10757m.m478k(arrayList);
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            return (FragmentTransitionImpl) C1744e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    public static final void retainValues(@NotNull C0470b<String, String> c0470b, @NotNull C0470b<String, View> namedViews) {
        C10843j.m430f(c0470b, "<this>");
        C10843j.m430f(namedViews, "namedViews");
        int i = c0470b.f1531c;
        while (true) {
            i--;
            if (-1 < i) {
                if (!namedViews.containsKey(c0470b.m12397l(i))) {
                    c0470b.mo6416j(i);
                }
            } else {
                return;
            }
        }
    }

    @JvmStatic
    public static final void setViewVisibility(@NotNull List<? extends View> views, int i) {
        C10843j.m430f(views, "views");
        for (View view : views) {
            view.setVisibility(i);
        }
    }

    @JvmStatic
    public static final boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
