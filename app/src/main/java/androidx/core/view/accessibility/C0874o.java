package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.p003os.BuildCompat;
import androidx.core.view.accessibility.InterfaceC0883s;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* renamed from: androidx.core.view.accessibility.o */
/* loaded from: classes.dex */
public final class C0874o {

    /* renamed from: d */
    public static int f2605d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f2606a;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})

    /* renamed from: b */
    public int f2607b = -1;

    /* renamed from: c */
    public int f2608c = -1;

    /* renamed from: androidx.core.view.accessibility.o$a */
    /* loaded from: classes.dex */
    public static class C0875a {

        /* renamed from: e */
        public static final C0875a f2609e;

        /* renamed from: f */
        public static final C0875a f2610f;

        /* renamed from: g */
        public static final C0875a f2611g;

        /* renamed from: h */
        public static final C0875a f2612h;

        /* renamed from: i */
        public static final C0875a f2613i;

        /* renamed from: j */
        public static final C0875a f2614j;

        /* renamed from: k */
        public static final C0875a f2615k;

        /* renamed from: l */
        public static final C0875a f2616l;

        /* renamed from: a */
        public final Object f2617a;

        /* renamed from: b */
        public final int f2618b;

        /* renamed from: c */
        public final Class<? extends InterfaceC0883s.AbstractC0884a> f2619c;
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})

        /* renamed from: d */
        public final InterfaceC0883s f2620d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            new C0875a(1);
            new C0875a(2);
            new C0875a(4);
            new C0875a(8);
            f2609e = new C0875a(16);
            new C0875a(32);
            new C0875a(64);
            new C0875a(128);
            new C0875a(256, InterfaceC0883s.C0885b.class);
            new C0875a(AdRequest.MAX_CONTENT_URL_LENGTH, InterfaceC0883s.C0885b.class);
            new C0875a(1024, InterfaceC0883s.C0886c.class);
            new C0875a(2048, InterfaceC0883s.C0886c.class);
            f2610f = new C0875a(4096);
            f2611g = new C0875a(8192);
            new C0875a(Http2.INITIAL_MAX_FRAME_SIZE);
            new C0875a(32768);
            new C0875a(65536);
            new C0875a(131072, InterfaceC0883s.C0890g.class);
            f2612h = new C0875a(262144);
            f2613i = new C0875a(524288);
            f2614j = new C0875a(1048576);
            new C0875a(2097152, InterfaceC0883s.C0891h.class);
            int i = Build.VERSION.SDK_INT;
            new C0875a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            new C0875a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, InterfaceC0883s.C0888e.class);
            f2615k = new C0875a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            new C0875a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            f2616l = new C0875a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            new C0875a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            new C0875a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            if (i >= 29) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction = accessibilityAction12;
            } else {
                accessibilityAction = null;
            }
            new C0875a(accessibilityAction, 16908359, null, null, null);
            new C0875a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            if (i >= 29) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction2 = accessibilityAction11;
            } else {
                accessibilityAction2 = null;
            }
            new C0875a(accessibilityAction2, 16908361, null, null, null);
            new C0875a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            if (i >= 24) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction3 = accessibilityAction10;
            } else {
                accessibilityAction3 = null;
            }
            new C0875a(accessibilityAction3, 16908349, null, null, InterfaceC0883s.C0889f.class);
            new C0875a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, InterfaceC0883s.C0887d.class);
            if (i >= 28) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction4 = accessibilityAction9;
            } else {
                accessibilityAction4 = null;
            }
            new C0875a(accessibilityAction4, 16908356, null, null, null);
            if (i >= 28) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction5 = accessibilityAction8;
            } else {
                accessibilityAction5 = null;
            }
            new C0875a(accessibilityAction5, 16908357, null, null, null);
            new C0875a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (i >= 30) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction7;
            } else {
                accessibilityAction6 = null;
            }
            new C0875a(accessibilityAction6, 16908372, null, null, null);
            new C0875a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            new C0875a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            new C0875a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
            new C0875a(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        }

        public C0875a(int i) {
            this(null, i, null, null, null);
        }

        public C0875a(int i, Class cls) {
            this(null, i, null, null, cls);
        }

        public C0875a(Object obj, int i, String str, InterfaceC0883s interfaceC0883s, Class cls) {
            this.f2618b = i;
            this.f2620d = interfaceC0883s;
            this.f2617a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, str) : obj;
            this.f2619c = cls;
        }

        /* renamed from: a */
        public final int m11546a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2617a).getId();
        }

        /* renamed from: b */
        public final CharSequence m11545b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2617a).getLabel();
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj != null && (obj instanceof C0875a)) {
                Object obj2 = ((C0875a) obj).f2617a;
                Object obj3 = this.f2617a;
                return obj3 == null ? obj2 == null : obj3.equals(obj2);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f2617a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: androidx.core.view.accessibility.o$b */
    /* loaded from: classes.dex */
    public static class C0876b {

        /* renamed from: a */
        public final Object f2621a;

        public C0876b(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f2621a = collectionItemInfo;
        }

        /* renamed from: a */
        public static C0876b m11544a(int i, int i2, int i3, int i4, boolean z) {
            return new C0876b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
        }
    }

    public C0874o(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2606a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public final void m11557a(int i) {
        this.f2606a.addAction(i);
    }

    /* renamed from: b */
    public final void m11556b(C0875a c0875a) {
        this.f2606a.addAction((AccessibilityNodeInfo.AccessibilityAction) c0875a.f2617a);
    }

    /* renamed from: c */
    public final ArrayList m11555c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2606a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    /* renamed from: d */
    public final void m11554d(Rect rect) {
        this.f2606a.getBoundsInParent(rect);
    }

    /* renamed from: e */
    public final CharSequence m11553e() {
        boolean z = !m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2606a;
        if (z) {
            ArrayList m11555c = m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList m11555c2 = m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList m11555c3 = m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList m11555c4 = m11555c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < m11555c.size(); i++) {
                spannableString.setSpan(new C0860a(((Integer) m11555c4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) m11555c.get(i)).intValue(), ((Integer) m11555c2.get(i)).intValue(), ((Integer) m11555c3.get(i)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0874o)) {
            C0874o c0874o = (C0874o) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f2606a;
            if (accessibilityNodeInfo2 == null) {
                if (accessibilityNodeInfo != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
                return false;
            }
            return this.f2608c == c0874o.f2608c && this.f2607b == c0874o.f2607b;
        }
        return false;
    }

    /* renamed from: f */
    public final void m11552f(int i, boolean z) {
        Bundle extras = this.f2606a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: g */
    public final void m11551g(CharSequence charSequence) {
        this.f2606a.setClassName(charSequence);
    }

    /* renamed from: h */
    public final void m11550h(C0876b c0876b) {
        this.f2606a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c0876b.f2621a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2606a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final void m11549i(@Nullable String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2606a;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* renamed from: j */
    public final void m11548j(boolean z) {
        this.f2606a.setScrollable(z);
    }

    /* renamed from: k */
    public final void m11547k(CharSequence charSequence) {
        this.f2606a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    @NonNull
    public final String toString() {
        String string;
        ?? emptyList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m11554d(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2606a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(m11553e());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (BuildCompat.m11866c()) {
            string = accessibilityNodeInfo.getUniqueId();
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                emptyList.add(new C0875a(actionList.get(i), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < emptyList.size(); i2++) {
            C0875a c0875a = (C0875a) emptyList.get(i2);
            int m11546a = c0875a.m11546a();
            if (m11546a != 1) {
                if (m11546a != 2) {
                    switch (m11546a) {
                        case 4:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case 16:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case 64:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case 256:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 1024:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case 2048:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case 8192:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                            str = "ACTION_COPY";
                            break;
                        case 32768:
                            str = "ACTION_PASTE";
                            break;
                        case 65536:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case 16908354:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        default:
                            switch (m11546a) {
                                case 16908342:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case 16908343:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case 16908344:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case 16908345:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case 16908346:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case 16908347:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case 16908348:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case 16908349:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (m11546a) {
                                        case 16908356:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case 16908357:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case 16908358:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case 16908359:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case 16908360:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case 16908361:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case 16908362:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            switch (m11546a) {
                                                case 16908372:
                                                    str = "ACTION_IME_ENTER";
                                                    break;
                                                case 16908373:
                                                    str = "ACTION_DRAG_START";
                                                    break;
                                                case 16908374:
                                                    str = "ACTION_DRAG_DROP";
                                                    break;
                                                case 16908375:
                                                    str = "ACTION_DRAG_CANCEL";
                                                    break;
                                                default:
                                                    str = "ACTION_UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && c0875a.m11545b() != null) {
                str = c0875a.m11545b().toString();
            }
            sb.append(str);
            if (i2 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
