package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0053o;
import androidx.activity.contextaware.InterfaceC0041b;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.C0153z;
import androidx.appcompat.view.AbstractC0178a;
import androidx.appcompat.widget.C0354h2;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0601b;
import androidx.core.app.C0633m0;
import androidx.core.app.C0635n;
import androidx.core.content.ContextCompat;
import androidx.core.p003os.C0735e;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1482l0;
import androidx.savedstate.C1689b;
import androidx.savedstate.C1694e;
import com.ambrose.overwall.R;
import java.util.ArrayList;
import kotlin.jvm.internal.C10843j;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public class ActivityC0101d extends FragmentActivity implements InterfaceC0106e, C0633m0.InterfaceC0634a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AppCompatDelegate mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes.dex */
    public class C0102a implements C1689b.InterfaceC1691b {
        public C0102a() {
        }

        @Override // androidx.savedstate.C1689b.InterfaceC1691b
        @NonNull
        /* renamed from: a */
        public final Bundle mo10049a() {
            Bundle bundle = new Bundle();
            ActivityC0101d.this.getDelegate().mo12964t();
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    /* loaded from: classes.dex */
    public class C0103b implements InterfaceC0041b {
        public C0103b() {
        }

        @Override // androidx.activity.contextaware.InterfaceC0041b
        /* renamed from: a */
        public final void mo10585a(@NonNull Context context) {
            ActivityC0101d activityC0101d = ActivityC0101d.this;
            AppCompatDelegate delegate = activityC0101d.getDelegate();
            delegate.mo12971l();
            activityC0101d.getSavedStateRegistry().m10054a(ActivityC0101d.DELEGATE_TAG);
            delegate.mo12968p();
        }
    }

    public ActivityC0101d() {
        initDelegate();
    }

    @ContentView
    public ActivityC0101d(@LayoutRes int i) {
        super(i);
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m10052c(DELEGATE_TAG, new C0102a());
        addOnContextAvailableListener(new C0103b());
    }

    private void initViewTreeOwners() {
        C1482l0.m10540a(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C10843j.m430f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        C1694e.m10045a(getWindow().getDecorView(), this);
        C0053o.m13054a(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo12980c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo12979d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo13031a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0629l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo13028j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) getDelegate().mo12977f(i);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            C0153z.ExecutorC0154a executorC0154a = AppCompatDelegate.f205a;
            this.mDelegate = new LayoutInflater$Factory2C0114h(this, null, this, this);
        }
        return this.mDelegate;
    }

    @Nullable
    public InterfaceC0088a getDrawerToggleDelegate() {
        return getDelegate().mo12975h();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().mo12973j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = C0354h2.f1264a;
        }
        return resources == null ? super.getResources() : resources;
    }

    @Nullable
    public ActionBar getSupportActionBar() {
        return getDelegate().mo12972k();
    }

    @Override // androidx.core.app.C0633m0.InterfaceC0634a
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return C0635n.m12065a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo12970m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo12969o(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull C0633m0 c0633m0) {
        Intent component;
        c0633m0.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0635n.m12065a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component2 = supportParentActivityIntent.getComponent();
            Context context = c0633m0.f2300b;
            if (component2 == null) {
                component2 = supportParentActivityIntent.resolveActivity(context.getPackageManager());
            }
            ArrayList<Intent> arrayList = c0633m0.f2299a;
            int size = arrayList.size();
            while (true) {
                try {
                    String m12064b = C0635n.m12064b(context, component2);
                    if (m12064b == null) {
                        component = null;
                    } else {
                        ComponentName componentName = new ComponentName(component2.getPackageName(), m12064b);
                        if (C0635n.m12064b(context, componentName) == null) {
                            component = Intent.makeMainActivity(componentName);
                        } else {
                            component = new Intent().setComponent(componentName);
                        }
                    }
                    if (component != null) {
                        arrayList.add(size, component);
                        component2 = component.getComponent();
                    } else {
                        arrayList.add(supportParentActivityIntent);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo12967q();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(@NonNull C0735e c0735e) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo13021d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo12966r();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo12965s();
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull C0633m0 c0633m0) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo12963u();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo12962v();
    }

    @Override // androidx.appcompat.app.InterfaceC0106e
    @CallSuper
    public void onSupportActionModeFinished(@NonNull AbstractC0178a abstractC0178a) {
    }

    @Override // androidx.appcompat.app.InterfaceC0106e
    @CallSuper
    public void onSupportActionModeStarted(@NonNull AbstractC0178a abstractC0178a) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0633m0 c0633m0 = new C0633m0(this);
            onCreateSupportNavigateUpTaskStack(c0633m0);
            onPrepareSupportNavigateUpTaskStack(c0633m0);
            ArrayList<Intent> arrayList = c0633m0.f2299a;
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = ContextCompat.f2323a;
                ContextCompat.C0649a.m12038a(c0633m0.f2300b, intentArr, null);
                try {
                    int i = C0601b.f2263b;
                    C0601b.C0602a.m12101a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        supportNavigateUpTo(supportParentActivityIntent);
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo13005D(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0106e
    @Nullable
    public AbstractC0178a onWindowStartingSupportActionMode(@NonNull AbstractC0178a.InterfaceC0179a interfaceC0179a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo13027k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        getDelegate().mo12960y(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo12959z(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo13008A(view, layoutParams);
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().mo13007B(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@StyleRes int i) {
        super.setTheme(i);
        getDelegate().mo13006C(i);
    }

    @Nullable
    public AbstractC0178a startSupportActionMode(@NonNull AbstractC0178a.InterfaceC0179a interfaceC0179a) {
        return getDelegate().mo13004E(interfaceC0179a);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo12970m();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        C0635n.C0636a.m12062b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo12961x(i);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return C0635n.C0636a.m12061c(this, intent);
    }
}
