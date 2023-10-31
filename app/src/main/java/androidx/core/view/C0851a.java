package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.core.view.accessibility.C0877p;
import androidx.core.view.accessibility.InterfaceC0883s;
import com.ambrose.overwall.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C0851a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f2596c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f2597a;

    /* renamed from: b */
    public final C0852a f2598b;

    /* renamed from: androidx.core.view.a$a */
    /* loaded from: classes.dex */
    public static final class C0852a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C0851a f2599a;

        public C0852a(C0851a c0851a) {
            this.f2599a = c0851a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2599a.mo10097a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @RequiresApi(16)
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0877p mo10096b = this.f2599a.mo10096b(view);
            if (mo10096b != null) {
                return (AccessibilityNodeProvider) mo10096b.f2622a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2599a.mo4531c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            Object tag;
            boolean z2;
            boolean z3;
            Object tag2;
            boolean z4;
            boolean z5;
            Object tag3;
            int i;
            C0874o c0874o = new C0874o(accessibilityNodeInfo);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            boolean z6 = true;
            int i2 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                z = true;
            } else {
                z = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z) {
                tag = Boolean.valueOf(ViewCompat.C0823l.m11673d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z2);
            } else {
                c0874o.m11552f(1, z2);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                tag2 = Boolean.valueOf(ViewCompat.C0823l.m11674c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            if (bool2 != null && bool2.booleanValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i3 >= 28) {
                accessibilityNodeInfo.setHeading(z4);
            } else {
                c0874o.m11552f(2, z4);
            }
            CharSequence m11780e = ViewCompat.m11780e(view);
            if (i3 >= 28) {
                accessibilityNodeInfo.setPaneTitle(m11780e);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m11780e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                tag3 = ViewCompat.C0825n.m11663a(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i3 < 30) {
                z6 = false;
            }
            if (z6) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f2599a.mo4308d(view, c0874o);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    c0874o.f2606a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i6 = 0;
                    while (i6 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i6];
                        int i7 = i2;
                        while (true) {
                            if (i7 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                    i = sparseArray2.keyAt(i7);
                                    break;
                                }
                                i7++;
                            } else {
                                i = C0874o.f2605d;
                                C0874o.f2605d = i + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                        Spanned spanned = (Spanned) text;
                        c0874o.m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        c0874o.m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        c0874o.m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        c0874o.m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                        i6++;
                        i2 = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                c0874o.m11556b((C0874o.C0875a) list.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2599a.mo4385e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2599a.mo10095f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f2599a.mo4307g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.f2599a.mo10094h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2599a.mo10093i(view, accessibilityEvent);
        }
    }

    @RequiresApi(16)
    /* renamed from: androidx.core.view.a$b */
    /* loaded from: classes.dex */
    public static class C0853b {
        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeProvider m11599a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11598b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C0851a() {
        this(f2596c);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public C0851a(@NonNull View.AccessibilityDelegate accessibilityDelegate) {
        this.f2597a = accessibilityDelegate;
        this.f2598b = new C0852a(this);
    }

    /* renamed from: a */
    public boolean mo10097a(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.f2597a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Nullable
    /* renamed from: b */
    public C0877p mo10096b(@NonNull View view) {
        AccessibilityNodeProvider m11599a = C0853b.m11599a(this.f2597a, view);
        if (m11599a != null) {
            return new C0877p(m11599a);
        }
        return null;
    }

    /* renamed from: c */
    public void mo4531c(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f2597a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo4308d(@NonNull View view, @NonNull C0874o c0874o) {
        this.f2597a.onInitializeAccessibilityNodeInfo(view, c0874o.f2606a);
    }

    /* renamed from: e */
    public void mo4385e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f2597a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo10095f(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.f2597a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo4307g(@NonNull View view, int i, @Nullable Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C0874o.C0875a c0875a = (C0874o.C0875a) list.get(i2);
            if (c0875a.m11546a() == i) {
                InterfaceC0883s interfaceC0883s = c0875a.f2620d;
                if (interfaceC0883s != null) {
                    Class<? extends InterfaceC0883s.AbstractC0884a> cls = c0875a.f2619c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = interfaceC0883s.mo4734a(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = C0853b.m11598b(this.f2597a, view, i, bundle);
        }
        if (!z && i == R.id.accessibility_action_clickable_span && bundle != null) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                        if (clickableSpan.equals(clickableSpanArr[i4])) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    clickableSpan.onClick(view);
                    z3 = true;
                }
            }
            return z3;
        }
        return z;
    }

    /* renamed from: h */
    public void mo10094h(@NonNull View view, int i) {
        this.f2597a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo10093i(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.f2597a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
