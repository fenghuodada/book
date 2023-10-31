package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0098c;
import androidx.appcompat.content.res.C0158a;
import androidx.core.util.C0799c;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.a0 */
/* loaded from: classes.dex */
public final class C0286a0 extends Spinner implements InterfaceC0969m0 {
    @SuppressLint({"ResourceType"})
    @StyleableRes

    /* renamed from: i */
    public static final int[] f1081i = {16843505};

    /* renamed from: a */
    public final C0326e f1082a;

    /* renamed from: b */
    public final Context f1083b;

    /* renamed from: c */
    public final C0434z f1084c;

    /* renamed from: d */
    public SpinnerAdapter f1085d;

    /* renamed from: e */
    public final boolean f1086e;

    /* renamed from: f */
    public final InterfaceC0299i f1087f;

    /* renamed from: g */
    public int f1088g;

    /* renamed from: h */
    public final Rect f1089h;

    /* renamed from: androidx.appcompat.widget.a0$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0287a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0287a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C0286a0 c0286a0 = C0286a0.this;
            if (!c0286a0.getInternalPopup().mo12725a()) {
                c0286a0.f1087f.mo12716m(C0289c.m12730b(c0286a0), C0289c.m12731a(c0286a0));
            }
            ViewTreeObserver viewTreeObserver = c0286a0.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0288b.m12732a(viewTreeObserver, this);
            }
        }
    }

    @RequiresApi(16)
    /* renamed from: androidx.appcompat.widget.a0$b */
    /* loaded from: classes.dex */
    public static final class C0288b {
        @DoNotInline
        /* renamed from: a */
        public static void m12732a(@NonNull ViewTreeObserver viewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @RequiresApi(17)
    /* renamed from: androidx.appcompat.widget.a0$c */
    /* loaded from: classes.dex */
    public static final class C0289c {
        @DoNotInline
        /* renamed from: a */
        public static int m12731a(@NonNull View view) {
            return view.getTextAlignment();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m12730b(@NonNull View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12729c(@NonNull View view, int i) {
            view.setTextAlignment(i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m12728d(@NonNull View view, int i) {
            view.setTextDirection(i);
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.appcompat.widget.a0$d */
    /* loaded from: classes.dex */
    public static final class C0290d {
        @DoNotInline
        /* renamed from: a */
        public static void m12727a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (!C0799c.m11795a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: androidx.appcompat.widget.a0$e */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC0291e implements InterfaceC0299i, DialogInterface.OnClickListener {
        @VisibleForTesting

        /* renamed from: a */
        public DialogInterfaceC0098c f1091a;

        /* renamed from: b */
        public ListAdapter f1092b;

        /* renamed from: c */
        public CharSequence f1093c;

        public DialogInterface$OnClickListenerC0291e() {
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: a */
        public final boolean mo12725a() {
            DialogInterfaceC0098c dialogInterfaceC0098c = this.f1091a;
            if (dialogInterfaceC0098c != null) {
                return dialogInterfaceC0098c.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: b */
        public final int mo12724b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: d */
        public final void mo12723d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        public final void dismiss() {
            DialogInterfaceC0098c dialogInterfaceC0098c = this.f1091a;
            if (dialogInterfaceC0098c != null) {
                dialogInterfaceC0098c.dismiss();
                this.f1091a = null;
            }
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: e */
        public final CharSequence mo12722e() {
            return this.f1093c;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: g */
        public final Drawable mo12721g() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: i */
        public final void mo12720i(CharSequence charSequence) {
            this.f1093c = charSequence;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: j */
        public final void mo12719j(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: k */
        public final void mo12718k(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: l */
        public final void mo12717l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: m */
        public final void mo12716m(int i, int i2) {
            if (this.f1092b == null) {
                return;
            }
            C0286a0 c0286a0 = C0286a0.this;
            DialogInterfaceC0098c.C0099a c0099a = new DialogInterfaceC0098c.C0099a(c0286a0.getPopupContext());
            CharSequence charSequence = this.f1093c;
            if (charSequence != null) {
                c0099a.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f1092b;
            int selectedItemPosition = c0286a0.getSelectedItemPosition();
            AlertController.C0083b c0083b = c0099a.f239a;
            c0083b.f199k = listAdapter;
            c0083b.f200l = this;
            c0083b.f203o = selectedItemPosition;
            c0083b.f202n = true;
            DialogInterfaceC0098c create = c0099a.create();
            this.f1091a = create;
            AlertController.RecycleListView recycleListView = create.f238f.f165f;
            C0289c.m12728d(recycleListView, i);
            C0289c.m12729c(recycleListView, i2);
            this.f1091a.show();
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: n */
        public final int mo12715n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: o */
        public final void mo12645o(ListAdapter listAdapter) {
            this.f1092b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C0286a0 c0286a0 = C0286a0.this;
            c0286a0.setSelection(i);
            if (c0286a0.getOnItemClickListener() != null) {
                c0286a0.performItemClick(null, i, this.f1092b.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$f */
    /* loaded from: classes.dex */
    public static class C0292f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public final SpinnerAdapter f1095a;

        /* renamed from: b */
        public final ListAdapter f1096b;

        public C0292f(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.f1095a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1096b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    C0290d.m12727a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC0416t1) {
                    InterfaceC0416t1 interfaceC0416t1 = (InterfaceC0416t1) spinnerAdapter;
                    if (interfaceC0416t1.getDropDownViewTheme() == null) {
                        interfaceC0416t1.m12494r();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1096b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1095a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1095a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1095a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1095a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1095a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1096b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1095a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1095a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: androidx.appcompat.widget.a0$g */
    /* loaded from: classes.dex */
    public class C0293g extends C0334e1 implements InterfaceC0299i {

        /* renamed from: D */
        public CharSequence f1097D;

        /* renamed from: E */
        public ListAdapter f1098E;

        /* renamed from: F */
        public final Rect f1099F;

        /* renamed from: G */
        public int f1100G;

        /* renamed from: androidx.appcompat.widget.a0$g$a */
        /* loaded from: classes.dex */
        public class C0294a implements AdapterView.OnItemClickListener {
            public C0294a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0293g c0293g = C0293g.this;
                C0286a0.this.setSelection(i);
                if (C0286a0.this.getOnItemClickListener() != null) {
                    C0286a0.this.performItemClick(view, i, c0293g.f1098E.getItemId(i));
                }
                c0293g.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.a0$g$b */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnGlobalLayoutListenerC0295b implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserver$OnGlobalLayoutListenerC0295b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z;
                C0293g c0293g = C0293g.this;
                C0286a0 c0286a0 = C0286a0.this;
                c0293g.getClass();
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0817g.m11730b(c0286a0) && c0286a0.getGlobalVisibleRect(c0293g.f1099F)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    c0293g.dismiss();
                    return;
                }
                c0293g.m12726r();
                c0293g.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.a0$g$c */
        /* loaded from: classes.dex */
        public class C0296c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1104a;

            public C0296c(ViewTreeObserver$OnGlobalLayoutListenerC0295b viewTreeObserver$OnGlobalLayoutListenerC0295b) {
                this.f1104a = viewTreeObserver$OnGlobalLayoutListenerC0295b;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0286a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1104a);
                }
            }
        }

        public C0293g(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f1099F = new Rect();
            this.f1210o = C0286a0.this;
            this.f1220y = true;
            this.f1221z.setFocusable(true);
            this.f1211p = new C0294a();
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: e */
        public final CharSequence mo12722e() {
            return this.f1097D;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: i */
        public final void mo12720i(CharSequence charSequence) {
            this.f1097D = charSequence;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: l */
        public final void mo12717l(int i) {
            this.f1100G = i;
        }

        @Override // androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: m */
        public final void mo12716m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean mo12653a = mo12653a();
            m12726r();
            C0407r c0407r = this.f1221z;
            c0407r.setInputMethodMode(2);
            show();
            C0435z0 c0435z0 = this.f1198c;
            c0435z0.setChoiceMode(1);
            C0289c.m12728d(c0435z0, i);
            C0289c.m12729c(c0435z0, i2);
            C0286a0 c0286a0 = C0286a0.this;
            int selectedItemPosition = c0286a0.getSelectedItemPosition();
            C0435z0 c0435z02 = this.f1198c;
            if (mo12653a() && c0435z02 != null) {
                c0435z02.setListSelectionHidden(false);
                c0435z02.setSelection(selectedItemPosition);
                if (c0435z02.getChoiceMode() != 0) {
                    c0435z02.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!mo12653a && (viewTreeObserver = c0286a0.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC0295b viewTreeObserver$OnGlobalLayoutListenerC0295b = new ViewTreeObserver$OnGlobalLayoutListenerC0295b();
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0295b);
                c0407r.setOnDismissListener(new C0296c(viewTreeObserver$OnGlobalLayoutListenerC0295b));
            }
        }

        @Override // androidx.appcompat.widget.C0334e1, androidx.appcompat.widget.C0286a0.InterfaceC0299i
        /* renamed from: o */
        public final void mo12645o(ListAdapter listAdapter) {
            super.mo12645o(listAdapter);
            this.f1098E = listAdapter;
        }

        /* renamed from: r */
        public final void m12726r() {
            int i;
            int i2;
            Drawable m12650g = m12650g();
            C0286a0 c0286a0 = C0286a0.this;
            if (m12650g != null) {
                m12650g.getPadding(c0286a0.f1089h);
                if (C0362i2.m12616a(c0286a0)) {
                    i = c0286a0.f1089h.right;
                } else {
                    i = -c0286a0.f1089h.left;
                }
            } else {
                Rect rect = c0286a0.f1089h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = c0286a0.getPaddingLeft();
            int paddingRight = c0286a0.getPaddingRight();
            int width = c0286a0.getWidth();
            int i3 = c0286a0.f1088g;
            if (i3 == -2) {
                int m12733a = c0286a0.m12733a((SpinnerAdapter) this.f1098E, m12650g());
                int i4 = c0286a0.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = c0286a0.f1089h;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (m12733a > i5) {
                    m12733a = i5;
                }
                i3 = Math.max(m12733a, (width - paddingLeft) - paddingRight);
            } else if (i3 == -1) {
                i3 = (width - paddingLeft) - paddingRight;
            }
            m12644q(i3);
            if (C0362i2.m12616a(c0286a0)) {
                i2 = (((width - paddingRight) - this.f1200e) - this.f1100G) + i;
            } else {
                i2 = paddingLeft + this.f1100G + i;
            }
            this.f1201f = i2;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$h */
    /* loaded from: classes.dex */
    public static class C0297h extends View.BaseSavedState {
        public static final Parcelable.Creator<C0297h> CREATOR = new C0298a();

        /* renamed from: a */
        public boolean f1106a;

        /* renamed from: androidx.appcompat.widget.a0$h$a */
        /* loaded from: classes.dex */
        public class C0298a implements Parcelable.Creator<C0297h> {
            @Override // android.os.Parcelable.Creator
            public final C0297h createFromParcel(Parcel parcel) {
                return new C0297h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0297h[] newArray(int i) {
                return new C0297h[i];
            }
        }

        public C0297h(Parcel parcel) {
            super(parcel);
            this.f1106a = parcel.readByte() != 0;
        }

        public C0297h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1106a ? (byte) 1 : (byte) 0);
        }
    }

    @VisibleForTesting
    /* renamed from: androidx.appcompat.widget.a0$i */
    /* loaded from: classes.dex */
    public interface InterfaceC0299i {
        /* renamed from: a */
        boolean mo12725a();

        /* renamed from: b */
        int mo12724b();

        /* renamed from: d */
        void mo12723d(int i);

        void dismiss();

        /* renamed from: e */
        CharSequence mo12722e();

        /* renamed from: g */
        Drawable mo12721g();

        /* renamed from: i */
        void mo12720i(CharSequence charSequence);

        /* renamed from: j */
        void mo12719j(Drawable drawable);

        /* renamed from: k */
        void mo12718k(int i);

        /* renamed from: l */
        void mo12717l(int i);

        /* renamed from: m */
        void mo12716m(int i, int i2);

        /* renamed from: n */
        int mo12715n();

        /* renamed from: o */
        void mo12645o(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0286a0(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f1089h = r0
            android.content.Context r0 = r10.getContext()
            androidx.appcompat.widget.C0413s1.m12501a(r10, r0)
            int[] r0 = androidx.appcompat.C0157c.f431v
            r1 = 0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r10)
            r10.f1082a = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L2e
            androidx.appcompat.view.c r4 = new androidx.appcompat.view.c
            r4.<init>(r11, r3)
            r10.f1083b = r4
            goto L30
        L2e:
            r10.f1083b = r11
        L30:
            r3 = -1
            r4 = 0
            int[] r5 = androidx.appcompat.widget.C0286a0.f1081i     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r13, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r6 == 0) goto L58
            int r3 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r11 = move-exception
            r4 = r5
            goto Lcb
        L47:
            r6 = move-exception
            goto L4f
        L49:
            r11 = move-exception
            goto Lcb
        L4c:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L4f:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L5b
        L58:
            r5.recycle()
        L5b:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L93
            if (r3 == r6) goto L62
            goto La0
        L62:
            androidx.appcompat.widget.a0$g r3 = new androidx.appcompat.widget.a0$g
            android.content.Context r7 = r10.f1083b
            r3.<init>(r7, r12, r13)
            android.content.Context r7 = r10.f1083b
            androidx.appcompat.widget.x1 r0 = androidx.appcompat.widget.C0430x1.m12465m(r7, r12, r0, r13)
            android.content.res.TypedArray r7 = r0.f1406b
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.f1088g = r7
            android.graphics.drawable.Drawable r7 = r0.m12473e(r6)
            r3.m12648j(r7)
            java.lang.String r5 = r2.getString(r5)
            r3.f1097D = r5
            r0.m12464n()
            r10.f1087f = r3
            androidx.appcompat.widget.z r0 = new androidx.appcompat.widget.z
            r0.<init>(r10, r10, r3)
            r10.f1084c = r0
            goto La0
        L93:
            androidx.appcompat.widget.a0$e r0 = new androidx.appcompat.widget.a0$e
            r0.<init>()
            r10.f1087f = r0
            java.lang.String r3 = r2.getString(r5)
            r0.f1093c = r3
        La0:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto Lb7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r3, r0)
            r11 = 2131558601(0x7f0d00c9, float:1.8742522E38)
            r1.setDropDownViewResource(r11)
            r10.setAdapter(r1)
        Lb7:
            r2.recycle()
            r10.f1086e = r6
            android.widget.SpinnerAdapter r11 = r10.f1085d
            if (r11 == 0) goto Lc5
            r10.setAdapter(r11)
            r10.f1085d = r4
        Lc5:
            androidx.appcompat.widget.e r11 = r10.f1082a
            r11.m12684d(r12, r13)
            return
        Lcb:
            if (r4 == 0) goto Ld0
            r4.recycle()
        Ld0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0286a0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public final int m12733a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f1089h;
            drawable.getPadding(rect);
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1082a;
        if (c0326e != null) {
            c0326e.m12687a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        return interfaceC0299i != null ? interfaceC0299i.mo12724b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        return interfaceC0299i != null ? interfaceC0299i.mo12715n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1087f != null ? this.f1088g : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final InterfaceC0299i getInternalPopup() {
        return this.f1087f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        return interfaceC0299i != null ? interfaceC0299i.mo12721g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1083b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        return interfaceC0299i != null ? interfaceC0299i.mo12722e() : super.getPrompt();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1082a;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1082a;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0299i interfaceC0299i = this.f1087f;
        if (interfaceC0299i == null || !interfaceC0299i.mo12725a()) {
            return;
        }
        interfaceC0299i.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1087f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m12733a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0297h c0297h = (C0297h) parcelable;
        super.onRestoreInstanceState(c0297h.getSuperState());
        if (!c0297h.f1106a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0287a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0297h c0297h = new C0297h(super.onSaveInstanceState());
        InterfaceC0299i interfaceC0299i = this.f1087f;
        c0297h.f1106a = interfaceC0299i != null && interfaceC0299i.mo12725a();
        return c0297h;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0434z c0434z = this.f1084c;
        if (c0434z == null || !c0434z.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        if (interfaceC0299i != null) {
            if (!interfaceC0299i.mo12725a()) {
                interfaceC0299i.mo12716m(C0289c.m12730b(this), C0289c.m12731a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1086e) {
            this.f1085d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0299i interfaceC0299i = this.f1087f;
        if (interfaceC0299i != null) {
            Context context = this.f1083b;
            if (context == null) {
                context = getContext();
            }
            interfaceC0299i.mo12645o(new C0292f(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1082a;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1082a;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        if (interfaceC0299i == null) {
            super.setDropDownHorizontalOffset(i);
            return;
        }
        interfaceC0299i.mo12717l(i);
        interfaceC0299i.mo12723d(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        if (interfaceC0299i != null) {
            interfaceC0299i.mo12718k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1087f != null) {
            this.f1088g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        if (interfaceC0299i != null) {
            interfaceC0299i.mo12719j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(C0158a.m12920a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0299i interfaceC0299i = this.f1087f;
        if (interfaceC0299i != null) {
            interfaceC0299i.mo12720i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f1082a;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1082a;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }
}
