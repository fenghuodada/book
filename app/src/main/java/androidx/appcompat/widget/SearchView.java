package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.view.InterfaceC0180b;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.AbstractC1062a;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC0180b {

    /* renamed from: j0 */
    public static final C0266o f898j0;

    /* renamed from: A */
    public final Rect f899A;

    /* renamed from: B */
    public final int[] f900B;

    /* renamed from: C */
    public final int[] f901C;

    /* renamed from: D */
    public final ImageView f902D;

    /* renamed from: E */
    public final Drawable f903E;

    /* renamed from: F */
    public final int f904F;

    /* renamed from: G */
    public final int f905G;

    /* renamed from: H */
    public final Intent f906H;

    /* renamed from: I */
    public final Intent f907I;

    /* renamed from: J */
    public final CharSequence f908J;

    /* renamed from: K */
    public View.OnFocusChangeListener f909K;

    /* renamed from: L */
    public View.OnClickListener f910L;

    /* renamed from: M */
    public boolean f911M;

    /* renamed from: N */
    public boolean f912N;

    /* renamed from: O */
    public AbstractC1062a f913O;

    /* renamed from: P */
    public boolean f914P;

    /* renamed from: Q */
    public CharSequence f915Q;

    /* renamed from: R */
    public boolean f916R;

    /* renamed from: S */
    public boolean f917S;

    /* renamed from: T */
    public int f918T;

    /* renamed from: U */
    public boolean f919U;

    /* renamed from: V */
    public CharSequence f920V;

    /* renamed from: W */
    public boolean f921W;

    /* renamed from: d0 */
    public int f922d0;

    /* renamed from: e0 */
    public SearchableInfo f923e0;

    /* renamed from: f0 */
    public Bundle f924f0;

    /* renamed from: g0 */
    public final RunnableC0253b f925g0;

    /* renamed from: h0 */
    public final RunnableC0254c f926h0;

    /* renamed from: i0 */
    public final WeakHashMap<String, Drawable.ConstantState> f927i0;

    /* renamed from: p */
    public final SearchAutoComplete f928p;

    /* renamed from: q */
    public final View f929q;

    /* renamed from: r */
    public final View f930r;

    /* renamed from: s */
    public final View f931s;

    /* renamed from: t */
    public final ImageView f932t;

    /* renamed from: u */
    public final ImageView f933u;

    /* renamed from: v */
    public final ImageView f934v;

    /* renamed from: w */
    public final ImageView f935w;

    /* renamed from: x */
    public final View f936x;

    /* renamed from: y */
    public C0269q f937y;

    /* renamed from: z */
    public final Rect f938z;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0320d {

        /* renamed from: e */
        public int f939e;

        /* renamed from: f */
        public SearchView f940f;

        /* renamed from: g */
        public boolean f941g;

        /* renamed from: h */
        public final RunnableC0251a f942h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        public class RunnableC0251a implements Runnable {
            public RunnableC0251a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f941g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f941g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f942h = new RunnableC0251a();
            this.f939e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* renamed from: a */
        public final void m12775a() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0262k.m12773b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0266o c0266o = SearchView.f898j0;
            c0266o.getClass();
            C0266o.m12772a();
            Method method = c0266o.f956c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f939e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0320d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f941g) {
                RunnableC0251a runnableC0251a = this.f942h;
                removeCallbacks(runnableC0251a);
                post(runnableC0251a);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f940f;
            searchView.m12776w(searchView.f912N);
            searchView.post(searchView.f925g0);
            if (searchView.f928p.hasFocus()) {
                searchView.m12787l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f940f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f940f.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f941g = true;
                Context context = getContext();
                C0266o c0266o = SearchView.f898j0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    m12775a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0251a runnableC0251a = this.f942h;
            if (!z) {
                this.f941g = false;
                removeCallbacks(runnableC0251a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f941g = true;
            } else {
                this.f941g = false;
                removeCallbacks(runnableC0251a);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f940f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f939e = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    public class C0252a implements TextWatcher {
        public C0252a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f928p.getText();
            searchView.f920V = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.m12777v(z);
            boolean z2 = !z;
            int i4 = 8;
            if (searchView.f919U && !searchView.f912N && z2) {
                searchView.f933u.setVisibility(8);
                i4 = 0;
            }
            searchView.f935w.setVisibility(i4);
            searchView.m12781r();
            searchView.m12778u();
            charSequence.toString();
            searchView.getClass();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    public class RunnableC0253b implements Runnable {
        public RunnableC0253b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.m12780s();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    public class RunnableC0254c implements Runnable {
        public RunnableC0254c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC1062a abstractC1062a = SearchView.this.f913O;
            if (abstractC1062a instanceof View$OnClickListenerC0409r1) {
                abstractC1062a.mo11240b(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    public class View$OnFocusChangeListenerC0255d implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC0255d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f909K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC0256e implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0256e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            SearchView searchView = SearchView.this;
            View view2 = searchView.f936x;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f930r.getPaddingLeft();
                Rect rect = new Rect();
                boolean m12616a = C0362i2.m12616a(searchView);
                if (searchView.f911M) {
                    i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i9 = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.f928p;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                if (m12616a) {
                    i10 = -rect.left;
                } else {
                    i10 = paddingLeft - (rect.left + i9);
                }
                searchAutoComplete.setDropDownHorizontalOffset(i10);
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0257f implements View.OnClickListener {
        public View$OnClickListenerC0257f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f932t;
            SearchAutoComplete searchAutoComplete = searchView.f928p;
            if (view == imageView) {
                searchView.m12776w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f910L;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.f934v) {
                searchView.m12786m();
            } else if (view == searchView.f933u) {
                searchView.m12782q();
            } else if (view == searchView.f935w) {
                SearchableInfo searchableInfo = searchView.f923e0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f906H);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m12788k(searchView.f907I, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.m12787l();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    public class View$OnKeyListenerC0258g implements View.OnKeyListener {
        public View$OnKeyListenerC0258g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            boolean z;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.f923e0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f928p;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.f923e0 == null || searchView.f913O == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i != 66 && i != 84 && i != 61) {
                    if (i != 21 && i != 22) {
                        if (i != 19) {
                            return false;
                        }
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    if (i == 21) {
                        length = 0;
                    } else {
                        length = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(length);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.m12775a();
                } else {
                    searchView.m12785n(searchAutoComplete.getListSelection());
                }
                return true;
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.m12789i("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    public class C0259h implements TextView.OnEditorActionListener {
        public C0259h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m12782q();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    public class C0260i implements AdapterView.OnItemClickListener {
        public C0260i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m12785n(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    public class C0261j implements AdapterView.OnItemSelectedListener {
        public C0261j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m12784o(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public static class C0262k {
        @DoNotInline
        /* renamed from: a */
        public static void m12774a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12773b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0263l {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0264m {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public interface InterfaceC0265n {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    public static class C0266o {

        /* renamed from: a */
        public final Method f954a;

        /* renamed from: b */
        public final Method f955b;

        /* renamed from: c */
        public final Method f956c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0266o() {
            this.f954a = null;
            this.f955b = null;
            this.f956c = null;
            m12772a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f954a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f955b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f956c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m12772a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    public static class C0267p extends AbstractC1068a {
        public static final Parcelable.Creator<C0267p> CREATOR = new C0268a();

        /* renamed from: c */
        public boolean f957c;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        /* loaded from: classes.dex */
        public class C0268a implements Parcelable.ClassLoaderCreator<C0267p> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0267p(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C0267p[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0267p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0267p(parcel, classLoader);
            }
        }

        public C0267p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f957c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0267p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f957c + "}";
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeValue(Boolean.valueOf(this.f957c));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    /* loaded from: classes.dex */
    public static class C0269q extends TouchDelegate {

        /* renamed from: a */
        public final View f958a;

        /* renamed from: b */
        public final Rect f959b;

        /* renamed from: c */
        public final Rect f960c;

        /* renamed from: d */
        public final Rect f961d;

        /* renamed from: e */
        public final int f962e;

        /* renamed from: f */
        public boolean f963f;

        public C0269q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f962e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f959b = rect3;
            Rect rect4 = new Rect();
            this.f961d = rect4;
            Rect rect5 = new Rect();
            this.f960c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.f958a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f963f;
                    if (z2 && !this.f961d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f963f;
                        this.f963f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f959b.contains(x, y)) {
                    this.f963f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                Rect rect = this.f960c;
                View view = this.f958a;
                if (!z || rect.contains(x, y)) {
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = view.getWidth() / 2;
                    i = view.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return view.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f898j0 = Build.VERSION.SDK_INT < 29 ? new C0266o() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f938z = new Rect();
        this.f899A = new Rect();
        this.f900B = new int[2];
        this.f901C = new int[2];
        this.f925g0 = new RunnableC0253b();
        this.f926h0 = new RunnableC0254c();
        this.f927i0 = new WeakHashMap<>();
        View$OnClickListenerC0257f view$OnClickListenerC0257f = new View$OnClickListenerC0257f();
        View$OnKeyListenerC0258g view$OnKeyListenerC0258g = new View$OnKeyListenerC0258g();
        C0259h c0259h = new C0259h();
        C0260i c0260i = new C0260i();
        C0261j c0261j = new C0261j();
        C0252a c0252a = new C0252a();
        int[] iArr = C0157c.f430u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0430x1 c0430x1 = new C0430x1(context, obtainStyledAttributes);
        ViewCompat.m11772m(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(c0430x1.m12469i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f928p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f929q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f930r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f931s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f932t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f933u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f934v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f935w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f902D = imageView5;
        ViewCompat.C0814d.m11748q(findViewById, c0430x1.m12473e(18));
        ViewCompat.C0814d.m11748q(findViewById2, c0430x1.m12473e(23));
        imageView.setImageDrawable(c0430x1.m12473e(21));
        imageView2.setImageDrawable(c0430x1.m12473e(13));
        imageView3.setImageDrawable(c0430x1.m12473e(10));
        imageView4.setImageDrawable(c0430x1.m12473e(26));
        imageView5.setImageDrawable(c0430x1.m12473e(21));
        this.f903E = c0430x1.m12473e(20);
        C0324d2.m12689a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f904F = c0430x1.m12469i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.f905G = c0430x1.m12469i(11, 0);
        imageView.setOnClickListener(view$OnClickListenerC0257f);
        imageView3.setOnClickListener(view$OnClickListenerC0257f);
        imageView2.setOnClickListener(view$OnClickListenerC0257f);
        imageView4.setOnClickListener(view$OnClickListenerC0257f);
        searchAutoComplete.setOnClickListener(view$OnClickListenerC0257f);
        searchAutoComplete.addTextChangedListener(c0252a);
        searchAutoComplete.setOnEditorActionListener(c0259h);
        searchAutoComplete.setOnItemClickListener(c0260i);
        searchAutoComplete.setOnItemSelectedListener(c0261j);
        searchAutoComplete.setOnKeyListener(view$OnKeyListenerC0258g);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC0255d());
        setIconifiedByDefault(c0430x1.m12477a(16, true));
        int m12474d = c0430x1.m12474d(2, -1);
        if (m12474d != -1) {
            setMaxWidth(m12474d);
        }
        this.f908J = c0430x1.m12467k(12);
        this.f915Q = c0430x1.m12467k(19);
        int m12470h = c0430x1.m12470h(6, -1);
        if (m12470h != -1) {
            setImeOptions(m12470h);
        }
        int m12470h2 = c0430x1.m12470h(5, -1);
        if (m12470h2 != -1) {
            setInputType(m12470h2);
        }
        setFocusable(c0430x1.m12477a(1, true));
        c0430x1.m12464n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f906H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f907I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f936x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0256e());
        }
        m12776w(this.f911M);
        m12779t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f928p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f917S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f928p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f917S = false;
    }

    public int getImeOptions() {
        return this.f928p.getImeOptions();
    }

    public int getInputType() {
        return this.f928p.getInputType();
    }

    public int getMaxWidth() {
        return this.f918T;
    }

    public CharSequence getQuery() {
        return this.f928p.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f915Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f923e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f908J : getContext().getText(this.f923e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f905G;
    }

    public int getSuggestionRowLayout() {
        return this.f904F;
    }

    public AbstractC1062a getSuggestionsAdapter() {
        return this.f913O;
    }

    /* renamed from: i */
    public final Intent m12789i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f920V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f924f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f923e0.getSearchActivity());
        return intent;
    }

    /* renamed from: k */
    public final Intent m12788k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f924f0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: l */
    public final void m12787l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f928p;
        if (i >= 29) {
            C0262k.m12774a(searchAutoComplete);
            return;
        }
        C0266o c0266o = f898j0;
        c0266o.getClass();
        C0266o.m12772a();
        Method method = c0266o.f954a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        c0266o.getClass();
        C0266o.m12772a();
        Method method2 = c0266o.f955b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: m */
    public final void m12786m() {
        SearchAutoComplete searchAutoComplete = this.f928p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f911M) {
            clearFocus();
            m12776w(true);
        }
    }

    /* renamed from: n */
    public final void m12785n(int i) {
        int i2;
        Uri parse;
        String m12523h;
        Cursor cursor = this.f913O.f2735c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = View$OnClickListenerC0409r1.f1356x;
                String m12523h2 = View$OnClickListenerC0409r1.m12523h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (m12523h2 == null) {
                    m12523h2 = this.f923e0.getSuggestIntentAction();
                }
                if (m12523h2 == null) {
                    m12523h2 = "android.intent.action.SEARCH";
                }
                String m12523h3 = View$OnClickListenerC0409r1.m12523h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m12523h3 == null) {
                    m12523h3 = this.f923e0.getSuggestIntentData();
                }
                if (m12523h3 != null && (m12523h = View$OnClickListenerC0409r1.m12523h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    m12523h3 = m12523h3 + RemoteSettings.FORWARD_SLASH_STRING + Uri.encode(m12523h);
                }
                if (m12523h3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(m12523h3);
                }
                intent = m12789i(m12523h2, parse, View$OnClickListenerC0409r1.m12523h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), View$OnClickListenerC0409r1.m12523h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f928p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: o */
    public final void m12784o(int i) {
        String mo11239c;
        Editable text = this.f928p.getText();
        Cursor cursor = this.f913O.f2735c;
        if (cursor != null) {
            if (cursor.moveToPosition(i) && (mo11239c = this.f913O.mo11239c(cursor)) != null) {
                setQuery(mo11239c);
            } else {
                setQuery(text);
            }
        }
    }

    @Override // androidx.appcompat.view.InterfaceC0180b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f928p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f920V = "";
        clearFocus();
        m12776w(true);
        searchAutoComplete.setImeOptions(this.f922d0);
        this.f921W = false;
    }

    @Override // androidx.appcompat.view.InterfaceC0180b
    public final void onActionViewExpanded() {
        if (this.f921W) {
            return;
        }
        this.f921W = true;
        SearchAutoComplete searchAutoComplete = this.f928p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f922d0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f925g0);
        post(this.f926h0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f928p;
            int[] iArr = this.f900B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f901C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            Rect rect = this.f938z;
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f899A;
            rect2.set(i7, 0, i8, i9);
            C0269q c0269q = this.f937y;
            if (c0269q == null) {
                C0269q c0269q2 = new C0269q(rect2, rect, searchAutoComplete);
                this.f937y = c0269q2;
                setTouchDelegate(c0269q2);
                return;
            }
            c0269q.f959b.set(rect2);
            Rect rect3 = c0269q.f961d;
            rect3.set(rect2);
            int i10 = -c0269q.f962e;
            rect3.inset(i10, i10);
            c0269q.f960c.set(rect);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f912N
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f918T
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f918T
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f918T
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0267p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0267p c0267p = (C0267p) parcelable;
        super.onRestoreInstanceState(c0267p.f2747a);
        m12776w(c0267p.f957c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0267p c0267p = new C0267p(super.onSaveInstanceState());
        c0267p.f957c = this.f912N;
        return c0267p;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f925g0);
    }

    /* renamed from: p */
    public final void m12783p(@Nullable CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: q */
    public final void m12782q() {
        SearchAutoComplete searchAutoComplete = this.f928p;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f923e0 != null) {
                getContext().startActivity(m12789i("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    /* renamed from: r */
    public final void m12781r() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f928p.getText());
        if (!z2 && (!this.f911M || this.f921W)) {
            z = false;
        }
        int i = z ? 0 : 8;
        ImageView imageView = this.f934v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f917S || !isFocusable()) {
            return false;
        }
        if (!this.f912N) {
            boolean requestFocus = this.f928p.requestFocus(i, rect);
            if (requestFocus) {
                m12776w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    /* renamed from: s */
    public final void m12780s() {
        int[] iArr = this.f928p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f930r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f931s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f924f0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m12786m();
            return;
        }
        m12776w(false);
        SearchAutoComplete searchAutoComplete = this.f928p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f910L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f911M == z) {
            return;
        }
        this.f911M = z;
        m12776w(z);
        m12779t();
    }

    public void setImeOptions(int i) {
        this.f928p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f928p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f918T = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0263l interfaceC0263l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f909K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0264m interfaceC0264m) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f910L = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0265n interfaceC0265n) {
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f915Q = charSequence;
        m12779t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f916R = z;
        AbstractC1062a abstractC1062a = this.f913O;
        if (abstractC1062a instanceof View$OnClickListenerC0409r1) {
            View$OnClickListenerC0409r1 view$OnClickListenerC0409r1 = (View$OnClickListenerC0409r1) abstractC1062a;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            view$OnClickListenerC0409r1.f1362p = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f923e0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f928p
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f923e0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f923e0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f923e0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            androidx.cursoradapter.widget.a r8 = r7.f913O
            if (r8 == 0) goto L3e
            r8.mo11240b(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f923e0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.r1 r8 = new androidx.appcompat.widget.r1
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f923e0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.f927i0
            r8.<init>(r4, r7, r5, r6)
            r7.f913O = r8
            r0.setAdapter(r8)
            androidx.cursoradapter.widget.a r8 = r7.f913O
            androidx.appcompat.widget.r1 r8 = (androidx.appcompat.widget.View$OnClickListenerC0409r1) r8
            boolean r4 = r7.f916R
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f1362p = r4
        L65:
            r7.m12779t()
        L68:
            android.app.SearchableInfo r8 = r7.f923e0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f923e0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.f906H
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f923e0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.f907I
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.f919U = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.f912N
            r7.m12776w(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f914P = z;
        m12776w(this.f912N);
    }

    public void setSuggestionsAdapter(AbstractC1062a abstractC1062a) {
        this.f913O = abstractC1062a;
        this.f928p.setAdapter(abstractC1062a);
    }

    /* renamed from: t */
    public final void m12779t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.f911M;
        SearchAutoComplete searchAutoComplete = this.f928p;
        if (z && (drawable = this.f903E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: u */
    public final void m12778u() {
        boolean z;
        int i = 0;
        if ((this.f914P || this.f919U) && !this.f912N) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (this.f933u.getVisibility() != 0 && this.f935w.getVisibility() != 0)) {
            i = 8;
        }
        this.f931s.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r2.f919U == false) goto L14;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12777v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f914P
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.f919U
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f912N
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f919U
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f933u
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m12777v(boolean):void");
    }

    /* renamed from: w */
    public final void m12776w(boolean z) {
        int i;
        int i2;
        int i3;
        this.f912N = z;
        int i4 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f928p.getText());
        this.f932t.setVisibility(i);
        m12777v(z2);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.f929q.setVisibility(i2);
        ImageView imageView = this.f902D;
        if (imageView.getDrawable() != null && !this.f911M) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        m12781r();
        boolean z3 = !z2;
        if (this.f919U && !this.f912N && z3) {
            this.f933u.setVisibility(8);
        } else {
            i4 = 8;
        }
        this.f935w.setVisibility(i4);
        m12778u();
    }
}
